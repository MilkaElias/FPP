package com.company;

public class Main {

    public static void main(String[] args) {
        String[] testInput = {"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};

        MyStringLinkedList words = new MyStringLinkedList();
        words.addFirst(testInput[0]);
        for(int k=1; k<testInput.length; k++)
            words.addLast(testInput[k]);

        //System.out.println("Before sorting");
        System.out.println(words);
        words.minSort();
        //System.out.println("\nAfter sorting");
        System.out.println(words);


    }
}
