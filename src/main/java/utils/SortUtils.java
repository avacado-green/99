package utils;

import model.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtils {
    public static void sortByName(List<Person> people) {
        Collections.sort(people, Comparator.comparing(Person::getName));
    }

    public static void sortByBirthDate(List<Person> people) {
        Collections.sort(people, Comparator.comparing(Person::getBirthDate));
    }
}

