package com.crk.custom_report.Service;

import com.crk.custom_report.modle.DataSourceEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    public List<DataSourceEntity> getDataSourceList();

    public DataSourceEntity getDataSourceById(String dataSourceId);

    public int addDataSource(DataSourceEntity dataSourceFormat);

    public int updateDataSource(DataSourceEntity dataSourceFormat);

    public int deleteDataSource(List<DataSourceEntity> dataSourceFormatList);

    public int deleteDataSource(String dataSourceId);
}
