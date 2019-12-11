package com.restapi.task2.load_testonrestapiconcepts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> e = new ArrayList<>(Arrays.asList(
            new Employee("jyothibabu", "abc@gmail.com",123456L),
    new Employee("guru", "guru@gmail.com",46646464L),
            new Employee("hemanth", "hemanth@gmail.com",7987987987L)));

public List<Employee> getall(){
    return e;
}
public Employee getBY(String name){
   return e.stream().filter(t-> t.getName().equals(name)).findFirst().get();
}

public void post(Employee employee){
     e.add(employee);
}

    public void update(String name,Employee employee) {
    for(int i =0;i<e.size();i++){
        Employee em = e.get(i);
        if(em.getName().equals(name)){
            e.set(i,employee);
            return;
        }
    }
    }

    public void delete(String name) {
    e.removeIf(t-> t.getName().equals(name));
    }


}
