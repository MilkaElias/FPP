package case3;

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
        if(!(ob instanceof Person)) return false;
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
        Person p1 = new Person("Bella", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
        Person p2 = new Person("Bella", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
        Person p3 = new Person("Bella", new GregorianCalendar(2020, 3, 12, 15, 1, 22));
        Person p4 = new Person("Bella", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
        Person p5 = new Person("Bella", new GregorianCalendar(2018, 6, 27, 16, 16, 47));

        PersonWithJob pwj1 = new PersonWithJob(p1, 4690);
        PersonWithJob pwj2 = new PersonWithJob(p2, 5490);
        PersonWithJob pwj3 = new PersonWithJob(p3, 6700);
        PersonWithJob pwj4 = new PersonWithJob(p4, 2450);
        PersonWithJob pwj5 = new PersonWithJob(p5, 2450);
        System.out.println(pwj5.equals(pwj4));

    }

}
