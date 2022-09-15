package in.devzhu.makeapp01.EMPLOYEES_END.service;


import in.devzhu.makeapp01.EMPLOYEES_END.exceptions.UserNotFoundException;
import in.devzhu.makeapp01.EMPLOYEES_END.model.employee;
import in.devzhu.makeapp01.EMPLOYEES_END.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public employee addEmployee(employee Employee){
        Employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(Employee);
    }

    public List<employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public employee updateEmployee(employee Employee){
        return employeeRepo.save(Employee);
    }

    public employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id "+ id +"was not found"));
    }

    public void deleteEmployee(Long id){

      employeeRepo.deleteEmployeeById(id);
    }


}
