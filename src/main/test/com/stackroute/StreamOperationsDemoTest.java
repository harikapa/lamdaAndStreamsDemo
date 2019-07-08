package com.stackroute;

import com.stackroute.lamdaandstream.StreamDemo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamOperationsDemoTest {

    public static StreamOperationsDemo streamOperationsDemo;

    @BeforeClass
    public static void setUp()
    {
        streamOperationsDemo = new StreamOperationsDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        streamOperationsDemo = null;
    }

    @Test
    public void givenListShouldReturnMembersStartsWith()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Harika");
        memberNames.add("Suhas");
        memberNames.add("Akirah");
        memberNames.add("Mahesh");

        List<String> membersStartsWithA = new ArrayList<>();

        membersStartsWithA.add("Amitabh");
        membersStartsWithA.add("Aman");
        membersStartsWithA.add("Akirah");

        assertEquals(membersStartsWithA, streamOperationsDemo.getListStartsWith(memberNames,"A"));
    }

    @Test
    public void givenListShouldReturnMembersInUpperCase()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");

        List<String> upperCaseList = new ArrayList<>();

        upperCaseList.add("AMITABH");
        upperCaseList.add("SHEKHAR");
        upperCaseList.add("AMAN");

        assertEquals(upperCaseList, streamOperationsDemo.changeAsUppercase(memberNames));
    }

    @Test
    public void givenListShouldReturnMembersEndsWith()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Harika");
        memberNames.add("Suhas");
        memberNames.add("Akirah");
        memberNames.add("Mahesh");

        List<String> membersEndsWithH = new ArrayList<>();

        membersEndsWithH.add("AMITABH");
        membersEndsWithH.add("AKIRAH");
        membersEndsWithH.add("MAHESH");

        assertEquals(membersEndsWithH, streamOperationsDemo.filterNamesEndsWith(memberNames,"h"));
    }

    @Test
    public void givenListShouldReturnMembersEndsWithCount()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Harika");
        memberNames.add("Suhas");
        memberNames.add("Akirah");
        memberNames.add("Mahesh");

        assertEquals(1, streamOperationsDemo.filterNamesEndsWithletterCount(memberNames,"a"));
    }

    @Test
    public void givenListShouldReturnFirstNameStartsWithletter()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Harika");
        memberNames.add("Suhas");
        memberNames.add("Akirah");
        memberNames.add("Mahesh");

        assertEquals("Amitabh", streamOperationsDemo.getFirstNameStartsWithletter(memberNames,"A"));
    }

    @Test
    public void givenListShouldReturnEvenNumbersList()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(213232132);
        list.add(5656567);

        List<Integer> resultList = new ArrayList<>();
        resultList.add(2);
        resultList.add(4);
        resultList.add(213232132);

        assertEquals(resultList,streamOperationsDemo.filterEvenNumbers(list));
    }
}