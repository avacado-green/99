package presenter;

import model.Person;
import model.Tree;
import model.FileHandler;
import view.TreeView;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class TreePresenter {
    private Tree<Person> tree;
    private TreeView view;
    private FileHandler<Tree<Person>> fileHandler;

    public TreePresenter(Tree<Person> tree, TreeView view, FileHandler<Tree<Person>> fileHandler) {
        this.tree = tree;
        this.view = view;
        this.fileHandler = fileHandler;
    }

    public void addPerson(Person person) {
        tree.addMember(person);
    }

    public void displayTree() {
        view.displayTree(tree);
    }

    public void saveTree(String filename) {
        try {
            fileHandler.saveToFile(tree, filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadTree(String filename) {
        try {
            tree = fileHandler.readFromFile(filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sortByName() {
        Collections.sort(tree.getMembers(), Comparator.comparing(Person::getName));
    }

    public void sortByBirthDate() {
        Collections.sort(tree.getMembers(), Comparator.comparing(Person::getBirthDate));
    }
}

