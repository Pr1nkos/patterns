package ru.pr1nkos.creational.builder;

/**
 * The type Computer.
 */
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

    /**
     * The type Builder.
     */
    public static class Builder{
        private String CPU;
        private String GPU;
        private String RAM;
        private String HDD;

        /**
         * Cpu builder.
         *
         * @param CPU the cpu
         * @return the builder
         */
        public Builder CPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        /**
         * Gpu builder.
         *
         * @param GPU the gpu
         * @return the builder
         */
        public Builder GPU(String GPU){
            this.GPU = GPU;
            return this;
        }

        /**
         * Ram builder.
         *
         * @param RAM the ram
         * @return the builder
         */
        public Builder RAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        /**
         * Hdd builder.
         *
         * @param HDD the hdd
         * @return the builder
         */
        public Builder HDD(String HDD){
            this.HDD = HDD;
            return this;
        }

        /**
         * Build computer.
         *
         * @return the computer
         */
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
