layui.use(['layer','table'],function(){
    layer = parent.layer === undefined ? layui.layer : top.layer, $ = layui.jquery, table = layui.table;
    var element = layui.element;
    var pathName = window.document.location.pathname;
    projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    var renderList = [
        {type:"numbers", title: '序号', width:70, align:"center"},
        {field: 'dataSourceId', title: '数据源Id', align:"center"},
        {field: 'dataSourceName', title: '数据源名称', align:"center"},
        {field: 'dataSourceType', title: '数据源类型', align:"center"},
        {field: 'sort', title: '排序',width:105, align:"center"},
        {fixed: 'right', width:150, align:'center', toolbar: '#dataSourceListDemo'} //这里的toolbar值是模板元素的选择器
    ];
    tableIns = table.render({
        elem: '#dataSourceList',
        url : projectName + '/report/getDataSource.do',
        toolbar: '#toolbarDemo',
        parseData: function(res){ //res 即为原始返回的数据
            debugger;
           var success = res.success;
           if(success == "0"){
               return null;
           }else
           {
               return res.data;
           }
        },
        cellMinWidth : 95,
        request:{
            pageName: 'currentPage',
            limitName: 'size'
        },
        page : true,
        height : 600,
        limits : [10,15,20,25],
        limit : 10,
        id : "dataSourceListTable",
        cols :[renderList]
    });
    //头工具栏事件
    table.on('toolbar(dataSourceList)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
            case 'getCheckData':
                var data = checkStatus.data;
                layer.alert(JSON.stringify(data));
                break;
            case 'getCheckLength':
                var data = checkStatus.data;
                layer.msg('选中了：'+ data.length + ' 个');
                break;
            case 'isAll':
                layer.msg(checkStatus.isAll ? '全选': '未全选');
                break;
        };
    });
    //列表操作
    table.on('tool(dataSourceList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;
        if(layEvent === 'edit'){ //编辑
            editUser(data);
        }else if(layEvent === 'show'){  //查看
            showUser(data);
        }else if(layEvent === 'del'){ //删除
            indexdel1 = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
            deleteColl(data.id);
        }
    });

    //修改1
    function editUser(edit){

        var index = layui.layer.open({
            title : "修改化石",
            type : 2,
            area: ['80%','700px'],
            content : [projectName + '/collectionsFossil/toEdit.do?id=' + edit.id,'yes'],
            success : function(layero, index){
                resizeLayer(index);
                var body = layui.layer.getChildFrame('body', index);
                if(edit){

//                	body.find("#editOrg option[value='"+edit.orgId+"']").attr("selected",true);


                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回藏品列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            },
            end :function() {
                tableIns1.reload();
            }
        })
//        layui.layer.full(index);
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }
    //查看
    function showUser(edit){
        var index = layui.layer.open({
            title : "查看藏品",
            type : 2,
            area: ['80%','700px'],
            content : [projectName + '/collections/toShow.do?id=' + edit.id,'yes'],
            success : function(layero, index){
                resizeLayer(index);
                var body = layui.layer.getChildFrame('body', index);
                if(edit){

//                	body.find("#editOrg option[value='"+edit.orgId+"']").attr("selected",true);


                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回藏品列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            },
            end :function() {
                tableIns.reload();
            }
        })
        layui.layer.full(index);
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }

    function deleteColl1(id) {
        layer.confirm('确定删除此信息？', {
            btn: ['确定','再想想'] //按钮
        }, function(){
            $.ajax({
                url : projectName + '/collectionsFossil/del.do',
                type : "post",
                data :  {ids:id},
                dataType : "json",
                async: false,
                success : function(data){
                    top.layer.close(indexdel1);
                    if(data){
                        layer.msg('成功删除', {icon: 1});
                        tableIns1.reload();

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
});