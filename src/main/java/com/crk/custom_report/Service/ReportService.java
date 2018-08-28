package com.crk.custom_report.Service;

import com.crk.custom_report.modle.DataSourceFormat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    public List<DataSourceFormat> getDataSourceList();

    public int addDataSource(DataSourceFormat dataSourceFormat);

    public int updateDataSource(DataSourceFormat dataSourceFormat);

    public int deleteDataSource(List<DataSourceFormat> dataSourceFormatList);
}
