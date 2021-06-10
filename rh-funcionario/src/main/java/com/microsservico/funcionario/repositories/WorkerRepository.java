package com.microsservico.funcionario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservico.funcionario.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
