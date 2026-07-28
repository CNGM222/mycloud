package com.gm222.server.dao;

import com.gm222.server.model.entity.tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository<tasks, Long> {
}
