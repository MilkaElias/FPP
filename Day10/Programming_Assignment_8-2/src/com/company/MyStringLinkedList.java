package com.company;
import java.util.ListIterator;

public class MyStringLinkedList {
    Node header;
    MyStringLinkedList(){
        header = new Node(null, null,null);
    }
    //adds to the front of the list
    public void addFirst(String item){
        Node node = new Node(item,null,null);
        node.next = header.next;
        node.previous = header;
        if(header.next != null){
            header.next.previous = node;
        }
        header.next = node;
    }

    public void addLast(String item) {
        Node n = new Node(item,null,null);
        Node last = header; // the last element
        while(last.next != null) {
            last = last.next;
        }
        last.next = n;
        n.previous = last;
    }

    public void removeLast( ) {
        if(header.next == null) return; // is Empty
        Node current = header;
        while(current.next != null) // traverse until we reach the last element
        {
            current = current.next;
        }
        Node previous = current.previous;
        previous.next = null;
        current.previous = null;
    }

    //determines whether the input string is in the list
    public boolean search(String s) {
        Node next = header.next;
        while(next != null && !next.value.equals(s)) {
            next = next.next;
        }
        if(next == null) return false;
        else {
            return true;
        }
    }

    @Override
    public String toString() {

        var sb = new StringBuffer();
        Node next = header.next;
        while(next != null) {
            sb.append(next.toString() + ", ");
            next = next.next;
        }
        var result = sb.toString().trim();
        if(result.length() == 0) return "<empty list>";
        if(result.charAt(result.length()-1) == ',') {
            return result.substring(0,result.length()-1);
        }
        return result;
    }


    void insert(String data, int pos) {
        if(data == null || pos<0) return;
        Node newNode = new Node(data,null,null);
        Node currentNode = header;
        for(int i=0; i<pos; i++) {
            if(currentNode.next == null) return;
            currentNode = currentNode.next;
        }
        newNode.previous = currentNode;
        newNode.next = currentNode.next;
        currentNode.next.previous = newNode;
        currentNode.next = newNode;
    }
    boolean remove(String data) {
        if(header.next == null) return false;
        Node currentNode = header;
        while(currentNode != null) {
            if(currentNode.value != null && currentNode.value.equals(data)) {
                currentNode.previous.next = currentNode.next;
                if(currentNode.next != null)
                    currentNode.next.previous = currentNode.previous;
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    /******* sorting methods ********/
    public void minSort(){
        Node currentNode = header.next;
        Node minNode;
        while(currentNode.next != null) {
            minNode = minNode(currentNode);
            swap(currentNode, minNode);
            currentNode = currentNode.next;
        }
    }

    // swap two nodes
    void swap(Node n1, Node n2){
        String tempValue = n1.value;
        n1.value = n2.value;
        n2.value = tempValue;
    }

    // finds a Node with minimum value
    Node minNode(Node startNode) {
        if(startNode.next == null) return startNode;
        Node currentNode = startNode;
        Node minNode = startNode;
        while(currentNode.next != null && currentNode.next.value != null) {
            if( minNode.value.compareTo(currentNode.next.value)>0) {
                minNode = currentNode.next;
            }
            currentNode = currentNode.next;
        }
        return minNode;
    }

    class Node {
        String value;
        Node next;
        Node previous;
        Node(String value, Node next, Node previous){
            this.value = value;
            this.next=next;
            this.previous=previous;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }
}
