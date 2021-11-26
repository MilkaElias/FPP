package com.company;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
	    Person [] p=new Person[4];
        p[0]=new Person("Anil", 25, 'M');
        p[1]=new Person("Maya", 26, 'F');
        p[2]=new Person("Bella", 18, 'F');
        p[3]=new Person("Bob", 19, 'M');

        for(Person person:p){
            if(person.getName().equals("Bob")){
                System.out.println("Found");
                break;
            }
            else continue;
        }


    }
}
