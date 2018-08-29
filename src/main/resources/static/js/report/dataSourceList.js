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
        {fixed: 'right', width:150, align:'center', toolbar: '#barDemo'} //这里的toolbar值是模板元素的选择器
    ];
    tableIns = table.render({
        elem: '#dataSourceList',
        url : projectName + '/report/getDataSource.do',
        parseData: function(res){ //res 即为原始返回的数据
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
});