package com.crk.custom_report.Controller;

import com.crk.custom_report.Service.ReportService;
import com.crk.custom_report.common.JsonResult;
import com.crk.custom_report.modle.DataSourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ReportService reportService;
    @RequestMapping("/goDataSourceList.do")
    public ModelAndView goDataSourceList(){
        ModelAndView modelAndView = new ModelAndView("dataSourceList");
        return modelAndView;
    }
    /**
     * 获取数据源列表
     * @return
     */
    @RequestMapping("/getDataSource.do")
    public JsonResult getDataSourceList(){
        try {
            List<DataSourceEntity> dataSourceFormatList = reportService.getDataSourceList();
            return new JsonResult("1",dataSourceFormatList);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult("0",null,e.getMessage().toString());
        }
    }

    /**
     * 新增数据源
     * @param dataSourceFormat
     * @return
     */
    @RequestMapping("/addDataSource.do")
    public JsonResult addDataSource(DataSourceEntity dataSourceFormat){
        try {
            int result = reportService.addDataSource(dataSourceFormat);
            return new JsonResult("1",result);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult("0",null,e.getMessage().toString());
        }
    }

    /**
     * 修改数据源
     * @param dataSourceFormat
     * @return
     */
    @RequestMapping("/updateDataSource.do")
    public JsonResult updateDataSource(DataSourceEntity dataSourceFormat){
        try {
            int result = reportService.updateDataSource(dataSourceFormat);
            return new JsonResult("1",result);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult("0",null,e.getMessage().toString());
        }
    }
    /**
     * 删除数据源
     * @param dataSourceFormatList
     * @return
     */
    @RequestMapping("/deleteDataSource.do")
    public JsonResult deleteDataSource(List<DataSourceEntity> dataSourceFormatList){
        if (dataSourceFormatList.size()==0){
            return new JsonResult("0",null,"传参有误");
        }
        try {
            int result = reportService.deleteDataSource(dataSourceFormatList);
            if (result == dataSourceFormatList.size()){
                return new JsonResult("1",result);
            }else{
                return new JsonResult("0",null,"部分数据删除有异常");
            }
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult("0",null,e.getMessage().toString());
        }
    }
}
