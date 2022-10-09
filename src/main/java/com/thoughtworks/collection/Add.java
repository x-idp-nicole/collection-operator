package com.thoughtworks.collection;


import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int sum = 0;
        if (leftBorder < rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int sum = 0;
        if (leftBorder < rightBorder) {

            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        } else {
            for (int i = rightBorder; i <= leftBorder; i++) {

                if (i % 2 == 1) {
                    sum += i;
                }
            }
        }
        return sum;
    }


    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {


        for (int i = 0; i < arrayList.size(); i++) {
            int n = arrayList.get(i);
            if (n % 2 == 1) {
                arrayList.set(i, n * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int n : arrayList) {
            if (n % 2 == 1) {
                sum += n * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double median;
        List<Integer> resultList = new ArrayList<>();
        for (Integer integer : arrayList)
            if (integer % 2 == 0) {
                resultList.add(integer);
            }
        int index = resultList.size();
        if (resultList.size() % 2 == 0) {
            median = (resultList.get((index / 2) - 1) + resultList.get(index / 2)) / 2.0;
        } else {
            median = resultList.get((index - 1) / 2);
        }

        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {

        double average;

        int sum = 0;
        List<Integer> resultList = new ArrayList<>();

        for (Integer value : arrayList) {
            if (value % 2 == 0) {
                resultList.add(value);
            }
        }
        for (Integer integer : resultList) {
            sum += integer;
        }
        average = sum / resultList.size();
        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {

        for (Integer integer : arrayList) {

            if (integer % 2 == 0 && integer.equals(specialElment)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Set set = new HashSet<>();
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                set.add(integer);
            }
        }
        return new ArrayList<>(set);
    }


    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        List<Integer> oddList = new ArrayList<>();
//        List<Integer> evenList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for (Integer value : arrayList) {
            if (value % 2 == 0) {
                //evenList.add(arrayList.get(i));
                resultList.add(value);
                //Collections.sort(evenList);
            }
        }
        for (Integer integer : arrayList) {
            if (integer % 2 != 0) {
                resultList.add(integer);
                //Collections.reverse(oddList);
                //resultList.addAll(oddList);
            }
        }

        return resultList;
    }


    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {

            Integer result = 3 * (arrayList.get(i) + arrayList.get(i + 1));
            resultList.add(result);
        }
        return resultList;
    }
}

