package com.thoughtworks.collection;


import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        Integer result;
        List<Integer> resultList = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                result = i;
                resultList.add(result);
            }
        } else {
            for (int i = left; i >= right; i--) {
                result = i;
                resultList.add(result);
            }
        }
        return resultList;


    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        Integer result;
        List<Integer> resultList = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                result = i;
                if (result % 2 == 0) {
                    resultList.add(result);
                }
            }
        } else {
            for (int i = left; i >= right; i--) {
                result = i;
                if (result % 2 == 0) {
                    resultList.add(result);
                }

            }
        }
        return resultList;
    }


    public List<Integer> popEvenElments(int[] array) {
//        List<Integer> resultList = (List<Integer>) Arrays.stream(array).filter(a -> a % 2 == 0).collect(Collectors.toList());
//
//        return resultList;
        return null;
    }

    public int popLastElment(int[] array) {

        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                int firstResult = firstArray[i];
                int secondResult = secondArray[j];
                if (firstResult == secondResult) {
                    resultList.add(firstResult);
                }
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            int firstResult = firstArray[i];
            resultList.add(firstResult);
        }
        for (int j = 0; j < secondArray.length; j++) {
            int secondResult = secondArray[j];
            if (!resultList.contains(secondResult)) {
                resultList.add(secondResult);
            }
        }

        return resultList;
    }
}


