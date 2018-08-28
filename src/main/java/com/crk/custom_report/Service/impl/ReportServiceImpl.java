package com.crk.custom_report.Service.impl;

import com.crk.custom_report.Service.ReportService;
import com.crk.custom_report.dao.DataSourceEntityMapper;
import com.crk.custom_report.modle.DataSourceFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    DataSourceEntityMapper dataSourceEntityMapper;
    public List<DataSourceFormat> getDataSourceList(){

        return null;
    }

    @Override
    public int addDataSource(DataSourceFormat dataSourceFormat) {
        return 0;
    }

    @Override
    public int updateDataSource(DataSourceFormat dataSourceFormat) {
        return 0;
    }

    @Override
    public int deleteDataSource(List<DataSourceFormat> dataSourceFormatList) {
        return 0;
    }
}
