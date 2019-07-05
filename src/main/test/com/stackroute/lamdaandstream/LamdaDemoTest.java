package com.stackroute.lamdaandstream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LamdaDemoTest {

    public static LamdaDemo lamdaDemo;

    @BeforeClass
    public static void setUp()
    {
        lamdaDemo = new LamdaDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        lamdaDemo= null;
    }

    @Test
    public void givenListShouldReturnSortedList()
    {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Harika", "Pabbisetty", 22);
        Employee employee2 = new Employee("Poornima", "Velusuri", 23);
        Employee employee3 = new Employee("Pravallika", "Manthenna", 21);
        Employee employee4 = new Employee("Harika", "Boddu", 22);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<Employee> sortedEmployeeList = new ArrayList<>();

        sortedEmployeeList.add(employee4);
        sortedEmployeeList.add(employee3);
        sortedEmployeeList.add(employee1);
        sortedEmployeeList.add(employee2);

        assertEquals(sortedEmployeeList,lamdaDemo.sort(employeeList));
    }

    @Test
    public void givenListShouldReturnFilteredList()
    {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Harika", "Pabbisetty", 22);
        Employee employee2 = new Employee("Poornima", "CVelusuri", 23);
        Employee employee3 = new Employee("Pravallika", "Manthenna", 21);
        Employee employee4 = new Employee("Harika", "CBoddu", 22);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<Employee> filteredEmployeeList = new ArrayList<>();

        filteredEmployeeList.add(employee2);
        filteredEmployeeList.add(employee4);

        assertEquals(filteredEmployeeList,lamdaDemo.filter(employeeList));
    }

    @Test
    public void givenNullShouldretrunNull()
    {
        assertNull(lamdaDemo.sort(null));
        assertNull(lamdaDemo.filter(null));
    }

    @Test
    public void givenListWithNullElementShouldReturnNull()
    {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee2 = new Employee("Poornima", "CVelusuri", 23);
        Employee employee3 = new Employee("Pravallika", "Manthenna", 21);
        Employee employee4 = new Employee("Harika", "CBoddu", 22);

        employeeList.add(null);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        assertNull(lamdaDemo.filter(employeeList));
        assertNull(lamdaDemo.sort(employeeList));
    }

    @Test
    public void givenEmptyListShouldReturnNull()
    {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("", "", 0);
        Employee employee2 = new Employee("Pravallika", "Manthenna", 21);
        Employee employee3 = new Employee("Harika", "", 22);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        List<Employee> sortedEmployeeList = new ArrayList<>();

        sortedEmployeeList.add(employee1);
        sortedEmployeeList.add(employee3);
        sortedEmployeeList.add(employee2);

        List<Employee> filteredEmployeeList = new ArrayList<>();

        assertEquals(sortedEmployeeList,lamdaDemo.sort(employeeList));
        assertEquals(filteredEmployeeList,lamdaDemo.filter(employeeList));
    }

}