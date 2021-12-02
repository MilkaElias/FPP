package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"Money","1574se","lambda","arr","ea","657","umli"};
        StringSort stringSort = new StringSort(new StringSort.LengthCompare(){
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return  (s1.length() >= s2.length())?  1: -1;
            }
        });
        Arrays.stream(stringSort.stringSort(strings)).forEach(x->{
            System.out.print(x + " ");
        });
    }
	 }



