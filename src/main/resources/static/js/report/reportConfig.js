layui.use(['element','table'], function(){
    var element = layui.element;
    var table = layui.table;
    var coulumnList = [];
    table.render({
        elem: '#coulumnList'
        ,data: coulumnList
        ,cellMinWidth: 80
        ,cols: [[
            {type:'numbers'}
            ,{type: 'checkbox'}
            ,{field:'columnName', title:'字段名称'}
            ,{field:'showName', title:'显示名称'}
            ,{field:'tableName', title: '所在表名'}
            ,{field:'columnType', title:'字段类型', width:85}
            ,{fixed: 'right', width:150, align:'center', toolbar: '#barDemo'}
        ]]
        ,page: true
    });
    var setting = {
        view: {
            // addHoverDom: addHoverDom,
            // removeHoverDom: removeHoverDom,
            selectedMulti: false
        },
        check: {
            chkStyle: "checkbox",//复选框类型
            enable: true
        },
        data: {
            simpleData: {
                enable: true
            }
        },
        callback:{
            beforeCheck:true,
            onCheck:onCheck
        }
    };
    
    var zNodes =[
        {id:1, pId:0, name:"[core] 基本功能 演示", open:true},
        {id:101, pId:1, name:"最简单的树 --  标准 JSON 数据"},
        {id:102, pId:1, name:"最简单的树 --  简单 JSON 数据"},
        {id:103, pId:1, name:"不显示 连接线"},
        {id:104, pId:1, name:"不显示 节点 图标"},
        {id:108, pId:1, name:"异步加载 节点数据"},
        {id:109, pId:1, name:"用 zTree 方法 异步加载 节点数据"},
        {id:110, pId:1, name:"用 zTree 方法 更新 节点数据"},
        {id:111, pId:1, name:"单击 节点 控制"},
        {id:112, pId:1, name:"展开 / 折叠 父节点 控制"},
        {id:113, pId:1, name:"根据 参数 查找 节点"},
        {id:114, pId:1, name:"其他 鼠标 事件监听"}
    ];



    $(document).ready(function(){
        getTableInfo();
        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    });

    var newCount = 1;
    function addHoverDom(treeId, treeNode) {
        var sObj = $("#" + treeNode.tId + "_span");
        if (treeNode.editNameFlag || $("#addBtn_"+treeNode.tId).length>0) return;
        var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
            + "' title='add node' onfocus='this.blur();'></span>";
        sObj.after(addStr);
        var btn = $("#addBtn_"+treeNode.tId);
        if (btn) btn.bind("click", function(){
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.addNodes(treeNode, {id:(100 + newCount), pId:treeNode.id, name:"new node" + (newCount++)});
            return false;
        });
    };
    function removeHoverDom(treeId, treeNode) {
        $("#addBtn_"+treeNode.tId).unbind().remove();
    };
    function onCheck(e,treeId,treeNode) {
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo"),
            nodes = treeObj.getCheckedNodes(true);
        coulumnList = [];
        for (var i = 0; i < nodes.length; i++) {
            if (nodes[i].pId != null) {
                var json = {
                    'columnName': nodes[i].id,
                    'showName': nodes[i].name,
                    'tableName': nodes[i].pId,
                    'columnType': nodes[i].type
                };
                if (coulumnList.indexOf(json)==-1){
                    coulumnList.push(json);
                }
            }
        }
        table.reload('coulumnList',{
            data : coulumnList
        });
    }

    function getTableInfo() {
        $.ajax({
            url : '../report/getTableInfo.do',
            type : "post",
            data : {tableSchema:'mydatabase'},
            async: false,
            success : function(data){
                if(data.success==1){
                    zNodes = data.data;
                }else{
                    layer.msg('数据加载失败', {icon: 2});
                }
            },
        })
    }
});