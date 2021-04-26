package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Loans, Long> {
 
}
