package com.crk.custom_report.dao;

import com.crk.custom_report.modle.TableEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportMapper {
    List<TableEntity> getTableInfo(@Param("tableSchema") String tableSchema);
}