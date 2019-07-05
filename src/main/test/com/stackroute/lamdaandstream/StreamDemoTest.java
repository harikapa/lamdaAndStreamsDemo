package com.stackroute.lamdaandstream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamDemoTest {

    public static StreamDemo streamDemo;

    @BeforeClass
    public static void setUp()
    {
        streamDemo = new StreamDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        streamDemo = null;
    }

    @Test
    public void givenListShouldReturnPlacesOfNepal()
    {
        List<String> places = new ArrayList<>();

        places.add("Nepal,kathmandu");
        places.add("Nepal,Pokhara");
        places.add("India,Delhi");
        places.add("USA,Newyork");

        List<String> resultList = new ArrayList<>();

        resultList.add("kathmandu");
        resultList.add("Pokhara");

        assertEquals(resultList, streamDemo.findPlaces(places,"Nepal"));
    }

}