package some.algo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Algor {

//    public List<String> getPersons() {
//        return persons;
//    }
//
//    public void setPersons(List<String> persons) {
//        this.persons = persons;
//    }

    public static void main(String[] args) {


        List<String> persons = new ArrayList<>();
        persons.add("Human");

        List<String> person1 = new ArrayList<>();
        person1.add("HUMAN");

        List<String> person2 = new ArrayList<>();
        person2.add("Human");

        System.out.println(persons);
        System.out.println(person1);
        System.out.println(persons.equals(person1));
        System.out.println(persons.equals(person2));
        System.out.println(person1.equals(person2));

        for (int i = 0; i < 101; i = i + 5) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();

        List<String> empls = new ArrayList<>();
        empls.add("A");
        empls.add("R");
        empls.add("O");
        empls.add("N");
        empls.add("Q");
        empls.add("S");
        empls.add("F");
        Collections.sort(empls);
        for (String a: empls) System.out.print(" " + a);
        System.out.println();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(-10);
        integers.add(9);
        integers.add(5);
        integers.add(6);
        integers.add(2);
        integers.add(23);
        integers.add(16);
        Collections.sort(integers);
        for (Integer s: integers) System.out.print(" " + s);
    }

}
