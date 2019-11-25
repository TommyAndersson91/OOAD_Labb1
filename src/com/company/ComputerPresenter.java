package com.company;

public class ComputerPresenter implements Observer {

    @Override
    public void update(Computer computer) {
        System.out.println("The computer is specced as follows: \n" +computer);
    }
}
