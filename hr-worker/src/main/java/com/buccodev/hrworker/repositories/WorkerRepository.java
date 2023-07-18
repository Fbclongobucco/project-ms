package com.buccodev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
