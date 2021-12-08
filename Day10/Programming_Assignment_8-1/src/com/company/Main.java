package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] test={"big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};
        MinSort ss=new MinSort(test);
        ss.sort();
        System.out.println(Arrays.toString(ss.arr));

    }



}
