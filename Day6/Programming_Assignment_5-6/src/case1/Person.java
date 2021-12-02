package case1;

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
        return (GregorianCalendar) dateOfBirth.clone();
    }

    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (!(ob instanceof Person)) return false;
        Person p = (Person) ob;
        return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
    }

    public int hashCode() {
        int seed = 17;
        int result = 31 * seed + name.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    public static void main(String[] args) {
        PersonWithJob pwj1 = new PersonWithJob("Milka", new GregorianCalendar(2021, 9, 25, 16, 16, 47), 4800);
        PersonWithJob pwj2 = new PersonWithJob("Milka", new GregorianCalendar(2018, 8, 20, 16, 16, 47), 5680);
        PersonWithJob pwj3 = new PersonWithJob("Milka", new GregorianCalendar(2020, 3, 19, 15, 1, 22), 7200);
        System.out.println(pwj1.equals(pwj2));
    }
}
