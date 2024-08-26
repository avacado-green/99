package genealogy_tree;

import model.Person;
import model.Tree;
import model.FileHandler;
import presenter.TreePresenter;
import view.TreeView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tree<Person> tree = new Tree<>();
        TreeView view = new TreeView();
        FileHandler<Tree<Person>> fileHandler = new FileHandler<>();
        TreePresenter presenter = new TreePresenter(tree, view, fileHandler);

        Person parent = new Person("John Doe", new Date(1980, 1, 1));
        Person child = new Person("Jane Doe", new Date(2005, 5, 15));
        parent.addChild(child);

        presenter.addPerson(parent);
        presenter.displayTree();

        presenter.saveTree("family_tree.ser");
        presenter.loadTree("family_tree.ser");
        presenter.displayTree();
    }
}

