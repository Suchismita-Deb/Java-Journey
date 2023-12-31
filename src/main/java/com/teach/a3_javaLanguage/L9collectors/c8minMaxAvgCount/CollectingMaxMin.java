package com.teach.a3_javaLanguage.L9collectors.c8minMaxAvgCount;

import com.teach.utilities.SampleData;
import com.teach.utilities.entity.EmployeeSimple;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CollectingMaxMin {
    public static void main(String[] args) {
        List<EmployeeSimple> employees = SampleData.getSimpleEmployees();

        //find the name of the employee with max Salary
        String maxSalEmp = employees.stream()
                .filter(Objects::nonNull).filter(emp -> null != emp.getAge()).filter(emp -> null != emp.getName())
                .collect(Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(EmployeeSimple::getSalary)),//First argument to find the max
                                emp -> emp.map(EmployeeSimple::getName).orElse("No Name")
                        )
                );

        System.out.println(maxSalEmp);

        //TODO: Find the map of names with max Salary
    }
}
