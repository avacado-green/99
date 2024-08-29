package model;

import java.util.List;

public interface ITree<T> extends Iterable<T> {
    void addMember(T member);
    List<T> getMembers();
}

