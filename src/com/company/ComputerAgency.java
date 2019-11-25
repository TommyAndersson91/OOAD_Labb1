package com.company;


import java.util.ArrayList;
import java.util.List;

public class ComputerAgency implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private Computer computer;

    @Override
    public void attach(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyUpdate(Computer computer) {
        this.computer = computer;
        for (Observer o: this.observers) {
            o.update(this.computer);
        }
    }
}
