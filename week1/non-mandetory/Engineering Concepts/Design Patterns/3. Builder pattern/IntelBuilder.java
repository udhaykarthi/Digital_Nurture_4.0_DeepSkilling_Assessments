public class IntelBuilder implements ComputerBuilder {
    private Computer computer;

    public IntelBuilder(){
        this.computer = new Computer();
    }
    public void buildCPU() {
        computer.setCPU("Intel Core i9");
    }

    public void buildRAM() {
        computer.setRAM("32GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    public Computer getComputer() {
        return this.computer;
    
    }
}
