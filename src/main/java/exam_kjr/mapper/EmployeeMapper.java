package exam_kjr.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import exam_kjr.dto.Employee;

@Component
public interface EmployeeMapper {
	
	List<Employee> selectEmployeeAll();
	Employee selectByNo(int empNo);
	int insertEmployee(Employee employee);
	int updateEmployee(Employee employee);
	int deleteEmployee(Employee employee);
}
