layui.use('form', function(){
    var form = layui.form;
    $('#dataSourceForm').find('input,password').attr('readonly',false);
    form.render();
});