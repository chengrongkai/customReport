layui.use('form', function(){
    var form = layui.form;
    $ = layui.jquery;
    $('#dataSourceForm').find('input,password').attr('readonly',false);
    form.render();
});