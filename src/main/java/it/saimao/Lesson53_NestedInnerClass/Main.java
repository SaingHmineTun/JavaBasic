package it.saimao.Lesson53_NestedInnerClass;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setBrand("Lenovo G50-30");
        // Create inner class's object
        Computer.Cpu cpu = computer.new Cpu();
        cpu.processor = "Intel Pentium";
        cpu.printCpuInfo();
    }
}
