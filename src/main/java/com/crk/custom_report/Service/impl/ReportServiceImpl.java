package com.crk.custom_report.Service.impl;

import com.crk.custom_report.Service.ReportService;
import com.crk.custom_report.dao.DataSourceEntityMapper;
import com.crk.custom_report.dao.ReportMapper;
import com.crk.custom_report.modle.DataSourceEntity;
import com.crk.custom_report.modle.DataSourceEntityExample;
import com.crk.custom_report.modle.TableEntity;
import com.crk.custom_report.modle.TableInfoTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    DataSourceEntityMapper dataSourceEntityMapper;
    @Autowired
    ReportMapper reportMapper;
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

    @Override
    public List<TableInfoTree> getTableInfo(String tableSchema) {
        List<TableEntity> tableEntityList = reportMapper.getTableInfo(tableSchema);
        if(null != tableEntityList && tableEntityList.size()>0){
            List<TableInfoTree> tableInfoTrees = new ArrayList<TableInfoTree>(tableEntityList.size());
            List<String> tableList = new ArrayList<String>();
            for (int i = 0; i< tableEntityList.size(); i++){
                TableEntity tableEntity = tableEntityList.get(i);
                if (tableList.size() == 0 || !tableList.contains(tableEntity.getTableName())){
                    tableList.add(tableEntity.getTableName());
                    TableInfoTree tableInfoTree = new TableInfoTree();
                    tableInfoTree.setId(tableEntity.getTableName());
                    tableInfoTree.setName(tableEntity.getTableComment());
                    if(null == tableEntity.getTableComment() || tableEntity.getTableComment() == ""){
                        tableInfoTree.setName(tableEntity.getTableName());
                    }
                    tableInfoTree.setpId("-1");
                    tableInfoTree.setType("table");
                    if (tableList.size()==1){
                        tableInfoTree.setOpen(true);
                    }else {
                        tableInfoTree.setOpen(false);
                    }
                    tableInfoTrees.add(tableInfoTree);
                }else{
                    TableInfoTree tableInfoTree = new TableInfoTree();
                    tableInfoTree.setId(tableEntity.getColumnName());
                    tableInfoTree.setName(tableEntity.getColumnComment());
                    if (tableEntity.getColumnComment()==null || tableEntity.getColumnComment() == ""){
                        tableInfoTree.setName(tableEntity.getColumnName());
                    }
                    tableInfoTree.setpId(tableEntity.getTableName());
                    tableInfoTree.setType(tableEntity.getColumnType());
                    if (tableList.size()==1){
                        tableInfoTree.setOpen(true);
                    }else {
                        tableInfoTree.setOpen(false);
                    }
                    tableInfoTrees.add(tableInfoTree);
                }
            }
            return tableInfoTrees;
        }else {
            return null;
        }
    }
}
