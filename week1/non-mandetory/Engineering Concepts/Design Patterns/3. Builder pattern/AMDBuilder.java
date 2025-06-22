public class AMDBuilder implements ComputerBuilder {
    private Computer computer;

    public AMDBuilder(){
        this.computer = new Computer();
    }
    public void buildCPU() {
        computer.setCPU("AMD Ryzen 9 5900X");
    }

    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("2TB SSD");
    }

    public Computer getComputer() {
        return this.computer;
    
    }
}
