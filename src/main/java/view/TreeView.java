package view;

import model.Person;
import model.ITree;

public class TreeView {
    public void displayTree(ITree<Person> tree) {
        for (Person person : tree) {
            System.out.println("Name: " + person.getName() + ", Birth Date: " + person.getBirthDate());
            for (Person child : person.getChildren()) {
                System.out.println("  Child: " + child.getName() + ", Birth Date: " + child.getBirthDate());
            }
        }
    }
}


