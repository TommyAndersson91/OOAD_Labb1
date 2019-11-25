package com.company;

public class Main {

    public static void main(String[] args) {

        //BUILDER PATTERN
	Computer computer = new Computer.ComputerBuilder()
            .setRam(4)
            .build();




        //MEMENTO PATTERN
        ComputerMemento computerMemento = computer.saveToMemento();

        ComputerCaretaker computerCaretaker=new ComputerCaretaker();

        computerCaretaker.addMemento(computerMemento);

        System.out.println("\n Original Computer");

        System.out.println(computer);

        System.out.println("\nComputer after upgrading CPU");

        computer.setCpu("MEGA X");

        computerMemento=computer.saveToMemento();

        computerCaretaker.addMemento(computerMemento);

        System.out.println(computer);

        System.out.println("\nComputer after upgrading CPU");

        computer.setCpu("ULTRA X");

        computerMemento=computer.saveToMemento();

        computerCaretaker.addMemento(computerMemento);

        System.out.println(computer);

        System.out.println("\nComputer after updating GPU");

        computer.setGpu("TITAN 123");

        computerMemento=computer.saveToMemento();

        computerCaretaker.addMemento(computerMemento);

        System.out.println(computer);

        System.out.println("\nComputer after undoing GPU update");

        computerMemento=computerCaretaker.getMemento();

        computer.undoFromMemento(computerMemento);

        computerMemento=computerCaretaker.getMemento();

        computer.undoFromMemento(computerMemento);

        System.out.println(computer);

        System.out.println("\nOriginal Computer restored");

        computerMemento=computerCaretaker.getMemento();

        computer.undoFromMemento(computerMemento);

        computerMemento=computerCaretaker.getMemento();

        computer.undoFromMemento(computerMemento);

        System.out.println(computer);


        //OBSERVER PATTERN

        //Kopplar på en lyssnare som presenterar computer.
        ComputerAgency computerAgency = new ComputerAgency();
        ComputerPresenter computerPresenter = new ComputerPresenter();
        computerAgency.attach(computerPresenter);

        computerAgency.notifyUpdate(computer);
        computer.setGpu("Observed Change");
        computerAgency.notifyUpdate(computer);

        //Kopplar av lyssnaren.
        computerAgency.detach(computerPresenter);
        computerAgency.notifyUpdate(computer);


    }
}
