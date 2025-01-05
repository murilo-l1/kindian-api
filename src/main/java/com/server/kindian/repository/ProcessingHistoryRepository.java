package com.server.kindian.repository;

import com.server.kindian.domain.jpa.ProcessingHistoryJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ProcessingHistoryRepository extends JpaRepository<ProcessingHistoryJpa, Long>, JpaSpecificationExecutor<ProcessingHistoryJpa> {

}