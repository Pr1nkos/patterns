package ru.pr1nkos.creational.builder;

public class Computer {
    private String CPU;
    private String GPU;
    private String RAM;
    private String HDD;

    private Computer (Builder builder){
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
    }

    public static class Builder{
        private String CPU;
        private String GPU;
        private String RAM;
        private String HDD;

        public Builder CPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder GPU(String GPU){
            this.GPU = GPU;
            return this;
        }

        public Builder RAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder HDD(String HDD){
            this.HDD = HDD;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                '}';
    }
}
