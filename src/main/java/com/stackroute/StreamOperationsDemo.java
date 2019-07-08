package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsDemo {

    public StreamOperationsDemo()
    {

    }

    public List<String> getListStartsWith(List<String> inputList, String letter)
    {
        if(inputList != null) {
         inputList = inputList.stream().filter(x -> x.startsWith(letter)).collect(Collectors.toList());
        }
        return inputList;
    }

    public List<String> changeAsUppercase(List<String> inputList)
    {
        if(inputList != null) {
            inputList = inputList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        }
        return inputList;
    }

    public List<String> filterNamesEndsWith(List<String> inputList, String letter)
    {
        if(inputList != null) {
            inputList = inputList.stream().filter(x -> x.endsWith(letter)).map(x -> x.toUpperCase()).collect(Collectors.toList());
        }
        return inputList;
    }

    public int filterNamesEndsWithletterCount(List<String> inputList, String letter)
    {
        if(inputList != null) {
            inputList = inputList.stream().filter(x -> x.endsWith(letter)).collect(Collectors.toList());
            return inputList.size();
        }
        return 0;
    }

    public String getFirstNameStartsWithletter(List<String> inputList, String letter)
    {
        try {
            String name = null;
            if (inputList != null) {
                name = inputList.stream().filter(x -> x.startsWith(letter)).findFirst().get();
            }
            return name;

        }catch (Exception exception)
        {
            return null;
        }
    }

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        if (list != null) {
            list = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        }
        return list;
    }

}
