package collections.sortinglistsusingcomparators;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class ListHandler {

    public static List<String> fillAnimals() {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("cheetah");
        animals.add("dog");
        animals.add("hyennah");

        return animals;
    }

    public static List<Integer> fillNumbers() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(1);
        numbers.add(13);
        numbers.add(5);

        return numbers;
    }

    public static void showList(List<?> aList) {
        for (Object item : aList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}


/**
 * Shows how we can implement custom sorting
 * by implementing Comparator interface.
 */
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {

        int firstLength = first.length();
        int secondLength = second.length();

        if (firstLength < secondLength) {
            return -1;
        } else if (firstLength > secondLength) {
            return 1;
        }

        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    /**
     * compareTo returns:
     * 1: first > second i.e. first sorts alphabetically later than second
     * -1: first < second i.e. first sorts alphabetically before than second
     * 0: first = second i.e. first sorts alphabetically equal to second
     */
    @Override
    public int compare(String first, String second) {
        return -first.compareTo(second); // notice the minus (-) for reversing.
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%d : %s", id, name);
    }
}


public class App {

    public static void main(String[] args) {
        // sort numbers via normal sort method
        List<Integer> numbers = ListHandler.fillNumbers();
        Collections.sort(numbers);
        ListHandler.showList(numbers);

        // sort list based on length of each element
        List<String> animals = ListHandler.fillAnimals();
        // pass custom comparator to Collections.sort
        Collections.sort(animals, new StringLengthComparator());
        ListHandler.showList(animals);

        // sort list based on reverse alphabetical order
        List<String> wildAnimals = ListHandler.fillAnimals();
        Collections.sort(wildAnimals, new ReverseAlphabeticalComparator());
        ListHandler.showList(wildAnimals);

        // reverse sort list of numbers
        List<Integer> reverseNumbers = ListHandler.fillNumbers();
        Collections.sort(reverseNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        ListHandler.showList(reverseNumbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Dylan"));
        people.add(new Person(1, "Rob"));
        people.add(new Person(0, "Maggie"));
        people.add(new Person(4, "Sue"));

        System.out.println("Before sorting based on ids");
        ListHandler.showList(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId())
                    return 1;
                else if (p1.getId() < p2.getId())
                    return -1;
                return 0;
            }
        });

        System.out.println("After sorting based on ids");
        ListHandler.showList(people);
    }
}
