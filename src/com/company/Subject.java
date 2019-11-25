package com.company;


public interface Subject {

    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Computer computer);
}
