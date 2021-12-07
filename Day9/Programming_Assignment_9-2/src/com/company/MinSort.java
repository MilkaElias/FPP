package com.company;

public class MinSort {

    public static void main(String[] args) {
        //System.out.println(sort(null));
        MinSort ms=new MinSort();
        String result=ms.sort("zwxuabfkafutbbbb");
	    System.out.println(result);
    }

    public String sort(String s){
        if(s==null) return null;
        if (s.length() < 2) return s;
        char ch=findMinChar(s);
        int minPos=s.indexOf(ch);
        return ch + sort(s.substring(0, minPos) + s.substring(minPos + 1));
    }

    public char findMinChar(String s){
        if(s.length()==1) return s.charAt(0);
        char ret=findMinChar(s.substring(1));
        char zeroTh=s.charAt(0);
        return ret<zeroTh?ret:zeroTh;
    }

}
