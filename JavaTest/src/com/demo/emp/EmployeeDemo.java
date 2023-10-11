package com.demo.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {


        static List<Employee> list=new ArrayList<>();
       static {
           list.add(new Employee(101,"hema",25000));
           list.add(new Employee(102,"lakshmi",23000));
           list.add(new Employee(105,"vijay",50000));
        }
    public static void main(String[] args) {

        list.stream().sorted((o1,o2)->o2.getSalary()>o1.getSalary()?1:-1).map(emp->emp.getName()).forEach(s-> System.out.println(s));
    }
}
