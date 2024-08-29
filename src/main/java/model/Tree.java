package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree<T extends Person> implements ITree<T>, Serializable {
    private List<T> members;

    public Tree() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(T member) {
        members.add(member);
    }

    @Override
    public List<T> getMembers() {
        return members;
    }

    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }
}


