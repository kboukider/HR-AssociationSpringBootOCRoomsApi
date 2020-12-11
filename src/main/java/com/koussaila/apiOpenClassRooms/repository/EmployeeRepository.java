package com.koussaila.apiOpenClassRooms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.koussaila.apiOpenClassRooms.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
