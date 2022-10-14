package service.impl;

import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public CommonResponse getEmployee(){
        List<Employee> empList = employeeRepository.findAll();
        return new CommonResponse(0, new Date(), empList);
    }

    public
}
