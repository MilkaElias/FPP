package com.company;

public class MyStringStack {
        private MyStringLinkedList linkedList;
        public MyStringStack(){
            linkedList=new MyStringLinkedList();
        }
        public String pop(){
            String top=linkedList.get(0);
            linkedList.remove(0);
            return top;
        }
        public String peek(){
            return linkedList.get(0);
        }
        public void push(String s){
           linkedList.insert(s,0);
        }
        public static void main(String[] args){
            MyStringStack stack = new MyStringStack();
            stack.push("Bob");
            stack.push("Harry");
            stack.push("Alice");
            System.out.println("Popping…"+stack.pop());
            System.out.println("Peeking…."+stack.peek());
            System.out.println("Popping…"+stack.pop());
        }
}



