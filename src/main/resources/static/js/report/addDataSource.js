layui.use('form', function(){
    var form = layui.form;
    $ = layui.jquery;
    //监听提交
    form.on('submit(save)', function(data){
        var data = $("#dataSourceForm").serialize();
        var json = JSON.stringify(data);
        $.ajax({
            url : '/report/addDataSource.do',
            type : "post",
            data : json,
            dataType : "json",
            async: false,
            success : function(data){
                if(data){
                    layer.msg('保存成功', {icon: 1});
                }else{
                    layer.msg('保存失败', {icon: 2});
                }
            },
        })
        return false;
    });
});