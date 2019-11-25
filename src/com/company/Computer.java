package com.company;


public class Computer  {


    private int ram;
    private String gpu;
    private String cpu;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public ComputerMemento saveToMemento()
    {
        ComputerMemento computerMemento = new ComputerMemento(this.ram, this.gpu, this.cpu);
        return computerMemento;
    }

    public void undoFromMemento (ComputerMemento computerMemento) {
        this.ram = computerMemento.getRam();
        this.gpu = computerMemento.getGpu();
        this.cpu = computerMemento.getCpu();
    }



    @Override
    public String toString() {
        return "Computer \n" +
                "RAM: " + this.ram + "\n" +
                "GPU: " + this.gpu + "\n" +
                "CPU: " + this.cpu;
    }

    private Computer() {

    }

    public static class ComputerBuilder  {

        private int ram = 4;
        private String gpu = "Default GPU";
        private String cpu = "Default CPU";

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();
            computer.gpu = this.gpu;
            computer.cpu = this.cpu;
            computer.ram = this.ram;
            return computer;
        }


    }


}
