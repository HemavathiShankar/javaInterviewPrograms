//package com.demo.emp;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
////print list of employee names whose salary is greater than 5000
//
//public class EmpDemo {
//
//
//    static List<Employee> emp= new ArrayList<>();
//    static{
//        emp.add(new Employee(101,"hema",10000.0));
//        emp.add(new Employee(102,"vijay",5000.00));
//        emp.add(new Employee(103,"lakshmireddy",3000.0));
//
//    }
//
//    public static void main(String[] args){
//
//        //emp.stream().filter(emp->emp.getSalary()>5000.00).map(emp->emp.getName()).forEach(n-> System.out.println(n));
//
//        Employee emp1=emp.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
//
//       List<Employee> e1= emp.stream().sorted((o1,o2)->o2.getSalary()>o1.getSalary()?1:-1).limit(3).collect(Collectors.toList());
//
//        System.out.println(e1);
//
//        System.out.println(emp1);
//
//
//
//    }
//}
