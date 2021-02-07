package com.warehouse_accounting.repositories;

import com.warehouse_accounting.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository <Department, Long> {
    @Query("SELECT NEW com.warehouse_accounting.models.dto.DepartmentDto(" +
            "d.id," +
            "d.name," +
            "d.sortNumber)" +
            "FROM Department d")
    List<DepartmentDto> getAll();


    @Query("SELECT NEW com.warehouse_accounting.models.dto.DepartmentDto(" +
            "d.id," +
            "d.name," +
            "d.sortNumber)" +
            "FROM Department d WHERE d.id = :id")
    DepartmentDto getById(@Param("id") Long id);
}
