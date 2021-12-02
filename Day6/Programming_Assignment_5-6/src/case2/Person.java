package case2;

import java.util.GregorianCalendar;

public class Person {

    private String name;
    private GregorianCalendar dateOfBirth;
    Person(String name, GregorianCalendar dob) {
        this.name = name;
        dateOfBirth = dob;
    }
    public String getName() {
        return name;
    }

    public GregorianCalendar getDateOfBirth() {
        return (GregorianCalendar)dateOfBirth.clone();
    }

    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        Person p = (Person)ob;
        return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
    }

    public int hashCode() {
        int seed = 17;
        int result = 31 * seed + name.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    public static void main(String[] args) {
        PersonWithJob pwj1 = new PersonWithJob("Adam", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 2400);
        PersonWithJob pwj2 = new PersonWithJob("Adam", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 5680);
        PersonWithJob pwj3 = new PersonWithJob("Adam", new GregorianCalendar(2020, 3, 12, 15, 1, 22), 2700);
        PersonWithJob pwj4 = new PersonWithJob("Bob", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 2400);
        PersonWithJob pwj5 = new PersonWithJob("Bob", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 2400);
        System.out.println(pwj5.equals(pwj4));
    }

}

