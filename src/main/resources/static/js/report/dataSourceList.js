layui.use(['layer','table'],function(){
    layer = parent.layer === undefined ? layui.layer : top.layer, $ = layui.jquery, table = layui.table;
    var element = layui.element;
    var pathName = window.document.location.pathname;
    projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    var renderList = [
        {type:"numbers", title: '序号', align:"center"},
        {field: 'dataSourceId', title: '数据源Id', align:"center"},
        {field: 'dataSourceName', title: '数据源名称',align:"center"},
        {field: 'dataSourceType', title: '数据源类型', align:"center"},
        {field: 'sort', title: '排序', align:"center"},
        {fixed: 'right',title: '操作', align:'center', toolbar: '#dataSourceListDemo'} //这里的toolbar值是模板元素的选择器
    ];
    var dataSourceList = [];
    $.ajax({
        url : '../report/getDataSource.do',
        type : "post",
        data :  null,
        dataType : "json",
        async: false,
        success : function(data){
            if(data.success == "1"){
                dataSourceList = data.data;
            }else{
                layer.msg('数据源列表加载失败', {icon: 2});
                console.log(data.errorMsg);
            }
        },
    });
    var tableIns = table.render({
        elem: '#dataSourceList',
        toolbar: '#toolbarDemo',
        data: dataSourceList,
        cellMinWidth : 80,
        request:{
            pageName: 'currentPage',
            limitName: 'size'
        },
        page : true,
        height : 600,
        limits : [10,15,20,25],
        limit : 10,
        cols :[renderList]
    });

    //列表操作
    table.on('tool(dataSourceList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;
        if(layEvent === 'edit'){ //编辑
            editDataSource(data);
        }else if(layEvent === 'show'){  //查看
            showDataSource(data);
        }else if(layEvent === 'del'){ //删除
            indexdel1 = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
            deleteDataSource(data.dataSourceId);
        }
    });

    //编辑数据源
    function editDataSource(edit){
        var index = layui.layer.open({
            title : "编辑数据源",
            type : 2,
            area: ['80%','700px'],
            content : ['../report/goUpdateDataSource.do?dataSourceId=' + edit.dataSourceId,'yes'],
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                setTimeout(function(){
                    layui.layer.tips('点击此处返回数据源列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            },
            end :function() {
            }
        })
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }
    //查看数据源
    function showDataSource(edit){
        var index = layui.layer.open({
            title : "查看数据源",
            type : 2,
            area: ['80%','700px'],
            content : ['../report/goShowDataSource.do?dataSourceId=' + edit.dataSourceId,'yes'],
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                setTimeout(function(){
                    layui.layer.tips('点击此处返回数据源列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            },
            end :function() {
            }
        })
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }
    // 删除数据源
    function deleteDataSource(id) {
        layer.confirm('确定删除此信息？', {
            btn: ['确定','再想想'] //按钮
        }, function(){
            $.ajax({
                url : '../report/deleteDataSource.do',
                type : "post",
                data :  {'dataSourceId':id},
                dataType : "json",
                async: false,
                success : function(data){
                    top.layer.close(indexdel1);
                    if(data){
                        layer.msg('成功删除', {icon: 1});
                    }else{
                        layer.msg('删除失败', {icon: 2});
                    }
                },
            })
        }, function(){
            layer.msg('已取消删除', {
            });
        });
    };

    $("#addDataSurce").click(function () {
        var index = layui.layer.open({
            title : "新增数据源",
            type : 2,
            area: ['80%','700px'],
            content : ['../report/goAddDataSource.do','yes'],
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                setTimeout(function(){
                    layui.layer.tips('点击此处返回数据源列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            },
            end :function() {
            }
        });
    })
});

