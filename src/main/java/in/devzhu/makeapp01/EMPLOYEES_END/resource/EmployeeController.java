package in.devzhu.makeapp01.EMPLOYEES_END.resource;

import in.devzhu.makeapp01.EMPLOYEES_END.model.employee;
import in.devzhu.makeapp01.EMPLOYEES_END.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

@GetMapping("/all")
    public ResponseEntity<List<employee>> getAllEmployees(){
        List<employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);

}

    @GetMapping("/find/{id}")
    public ResponseEntity<employee> getEmployeeById(@PathVariable("id") Long id){
        employee Employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(Employee, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<employee> addEmployee(@RequestBody employee Employee){
        employee newEmployee = employeeService.addEmployee(Employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<employee> updateEmployee(@RequestBody employee Employee){
        employee updateEmployee = employeeService.updateEmployee(Employee);
        return new ResponseEntity<>(updateEmployee,HttpStatus.OK);
    }


    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
