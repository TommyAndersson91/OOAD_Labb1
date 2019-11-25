package com.company;

import java.util.Stack;

public class ComputerMemento {

    private int ram;
    private String gpu;
    private String cpu;
    private Stack<Computer> redoStack;
    private Stack<Computer> undoStack;


    public ComputerMemento(int ram, String gpu, String cpu) {
        this.ram = ram;
        this.gpu = gpu;
        this.cpu = cpu;
    }




    public int getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Current memento state " + this.getGpu() + ", " + this.getCpu() + ", " + this.getRam();
    }
}
