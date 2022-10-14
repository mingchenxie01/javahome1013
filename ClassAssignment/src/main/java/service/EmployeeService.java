package service;

import domain.entity.Employee;
import org.springframework.stereotype.Service;
@Service
public interface EmployeeService {
    CommonResponse findById(String id);
    CommonResponse findAll();
    CommonResponse insert(Employee emp);
}
