package com.restapi.task2.load_testonrestapiconcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
@GetMapping("/employees")
    public List<Employee> getall()
//    @RequestParam(value = "page", defaultValue  = "2") int page, @RequestParam(value = "limit") int limit
        {
        return employeeService.getall();
    }
@GetMapping("/{name}")
    public Employee getBY( @PathVariable String name) {
        return employeeService.getBY(name);
    }
@PostMapping("/employees")
    public void post(@Valid @RequestBody Employee employee) {
        employeeService.post(employee);
    }
    @PutMapping("/{name}")
    public void put(@RequestBody Employee employee ,@PathVariable String name){
     employeeService.update(name, employee);
    }
    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        employeeService.delete(name);
    }
}