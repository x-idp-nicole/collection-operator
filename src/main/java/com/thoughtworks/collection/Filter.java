package com.thoughtworks.collection;


import java.lang.reflect.Array;
import java.util.*;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultList = new ArrayList<>();
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                resultList.add(integer);
            }
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> tripleList = new ArrayList<>();
        for (Integer integer : array) {
            if (integer % 3 == 0) {
                tripleList.add(integer);
            }
        }
        return tripleList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> commonList = new ArrayList<>();
        for (Integer integer : firstList) {
            for (Integer value : secondList) {
                if (integer == value) {
                    commonList.add(integer);
                }
            }
        }
        return commonList;
    }

    public List<Integer> getDifferentElements() {

        List<Integer> resultList = new ArrayList<>(array.size());
        for (Integer result : array) {
            if (!resultList.contains(result)) {
                resultList.add(result);
            }
        }
        return resultList;
    }
}