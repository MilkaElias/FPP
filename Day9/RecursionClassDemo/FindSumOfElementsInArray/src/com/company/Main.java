package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(findSum(arr));
        System.out.println(findSumRecursive(arr));
    }

    public static int findSum(int [] arr){
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;

    }

    public static int findSumRecursive(int [] arr){
        return findSumRecursive(arr, 0);
    }

    public static int findSumRecursive(int [] arr, int start){
        if(start==arr.length) return 0;
        int ret=findSumRecursive(arr, start+1);
        return ret+arr[start];

    }

}
