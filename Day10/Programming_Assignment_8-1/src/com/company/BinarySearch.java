package com.company;

public class BinarySearch {
    public static boolean search(MyStringList list, String val){
            if (list == null || list.size() == 0)
                return false;
            int lower = 0;
            int upper = list.size() - 1;
            while (true) {
                if (lower > upper)
                    return false;
                int mid = (lower + upper) / 2;
                if (val.compareTo(list.get(mid)) == 0)
                    return true;
                if (val.compareTo(list.get(mid)) < 0) { // search left
                    upper = mid - 1;
                } else { // val > list[mid], search right
                    lower = mid + 1;
                }
            }
        }

    }


