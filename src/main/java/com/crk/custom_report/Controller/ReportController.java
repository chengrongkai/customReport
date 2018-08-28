package com.crk.custom_report.Controller;

import com.crk.custom_report.Service.ReportService;
import com.crk.custom_report.modle.DataSourceFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ReportService reportService;

    /**
     * 获取数据源列表
     * @return
     */
    @RequestMapping("/getDataSource")
    public List<DataSourceFormat> getDataSourceList(){
        List<DataSourceFormat> dataSourceFormatList = reportService.getDataSourceList();
        return dataSourceFormatList;
    }

    /**
     * 新增数据源
     * @param dataSourceFormat
     * @return
     */
    @RequestMapping("/addDataSource")
    public String addDataSource(DataSourceFormat dataSourceFormat){
        return null;
    }

    /**
     * 修改数据源
     * @param dataSourceFormat
     * @return
     */
    @RequestMapping("/updateDataSource")
    public String updateDataSource(DataSourceFormat dataSourceFormat){
        return null;
    }
    /**
     * 删除数据源
     * @param dataSourceFormatList
     * @return
     */
    @RequestMapping("/deleteDataSource")
    public String deleteDataSource(List<DataSourceFormat> dataSourceFormatList){
        return null;
    }
}
