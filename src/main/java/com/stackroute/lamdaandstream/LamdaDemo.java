package com.stackroute.lamdaandstream;

import java.util.Comparator;
import java.util.List;

public class LamdaDemo {

    public LamdaDemo() {

    }

    public List<Employee> sort(List<Employee> employeeList) {

        try {

            if (employeeList != null) {
                employeeList.sort(Comparator.comparing(Employee::getLastname));
            }
            return employeeList;
        }catch (Exception exception)
        {
            return null;
        }
    }


    public List<Employee> filter(List<Employee> employeeList) {

        try {
            if (employeeList != null) {
                employeeList.removeIf(e -> !e.getLastname().startsWith("C"));
            }
            return employeeList;
        }catch (Exception exception)
        {
            return null;
        }
    }

}