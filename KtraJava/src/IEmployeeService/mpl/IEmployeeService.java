package IEmployeeService.mpl;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAllEmployess() ;
    public Employee getEmployeeByID(String id);
    public Employee getEmployeeByName(String name);

}
