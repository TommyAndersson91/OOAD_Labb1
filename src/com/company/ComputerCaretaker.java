package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class ComputerCaretaker {


    final Deque<ComputerMemento> mementos = new ArrayDeque<>();

    public ComputerMemento getMemento() {
        ComputerMemento computerMemento = mementos.pop();
        return computerMemento;
    }

    public void addMemento(ComputerMemento memento) {
        mementos.push(memento);
    }
}
