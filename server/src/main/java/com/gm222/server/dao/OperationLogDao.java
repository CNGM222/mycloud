package com.gm222.server.dao;

import com.gm222.server.model.entity.operation_logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationLogDao extends JpaRepository<operation_logs,Long> {
}
