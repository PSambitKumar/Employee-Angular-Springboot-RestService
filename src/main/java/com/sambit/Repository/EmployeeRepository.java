package com.sambit.Repository;

import com.sambit.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT MAX (empId) FROM Employee")
    int maxSlno();
}
