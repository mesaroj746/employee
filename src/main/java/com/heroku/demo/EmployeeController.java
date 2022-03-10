package com.heroku.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    private EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public List<Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @PostMapping("save")
    public Employee save(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setPhone(employeeDTO.getPhone());
        System.out.println(employee.getName() + "::entity");
        System.out.println(employeeDTO.getName()+ "::dto");
        return employeeService.save(employee);
    }

    /*
    * git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/mesaroj746/employee.git
git push -u origin main
*
    * */

}
