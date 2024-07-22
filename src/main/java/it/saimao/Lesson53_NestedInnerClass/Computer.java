package it.saimao.Lesson53_NestedInnerClass;

public class Computer {
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Nested inner class
    public class Cpu {
        String processor;
        public void printCpuInfo() {
            System.out.printf("Computer Brand - %s%n", brand);
            System.out.printf("CPU Processor - %s%s", processor);
        }
    }
}
