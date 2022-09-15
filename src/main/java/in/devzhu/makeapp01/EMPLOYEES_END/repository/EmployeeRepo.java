package in.devzhu.makeapp01.EMPLOYEES_END.repository;

import in.devzhu.makeapp01.EMPLOYEES_END.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<employee> findEmployeeById(Long id);
}
