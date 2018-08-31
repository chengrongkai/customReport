package com.crk.custom_report.Service.impl;

import com.crk.custom_report.Service.ReportService;
import com.crk.custom_report.dao.DataSourceEntityMapper;
import com.crk.custom_report.modle.DataSourceEntity;
import com.crk.custom_report.modle.DataSourceEntityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    DataSourceEntityMapper dataSourceEntityMapper;
    public List<DataSourceEntity> getDataSourceList(){
        DataSourceEntityExample entityExample = new DataSourceEntityExample();
        DataSourceEntityExample.Criteria criteria = entityExample.createCriteria();
        List<DataSourceEntity> dataSourceEntityList = dataSourceEntityMapper.selectByExample(entityExample);
        return dataSourceEntityList;
    }
    public DataSourceEntity getDataSourceById(String dataSourceId){
        DataSourceEntity dataSourceEntity = dataSourceEntityMapper.selectByPrimaryKey(dataSourceId);
        return dataSourceEntity;
    }

    @Override
    public int addDataSource(DataSourceEntity dataSourceFormat) {
        int count = dataSourceEntityMapper.insert(dataSourceFormat);
        return count;
    }

    @Override
    public int updateDataSource(DataSourceEntity dataSourceFormat) {
        DataSourceEntityExample entityExample = new DataSourceEntityExample();
        DataSourceEntityExample.Criteria criteria = entityExample.createCriteria();
        criteria.andDataSourceIdEqualTo(dataSourceFormat.getDataSourceId());
        int count = dataSourceEntityMapper.updateByExample(dataSourceFormat,entityExample);
        return 0;
    }
    @Transactional
    @Override
    public int deleteDataSource(List<DataSourceEntity> dataSourceFormatList) {
        int count = 0;
        for (int i=0;i<dataSourceFormatList.size();i++){
            int result = deleteDataSource(dataSourceFormatList.get(i).getDataSourceId());
            if (result != 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public int deleteDataSource(String dataSourceId) {
        DataSourceEntityExample entityExample = new DataSourceEntityExample();
        DataSourceEntityExample.Criteria criteria = entityExample.createCriteria();
        criteria.andDataSourceIdEqualTo(dataSourceId);
        int result = dataSourceEntityMapper.deleteByExample(entityExample);
        return 0;
    }
}
