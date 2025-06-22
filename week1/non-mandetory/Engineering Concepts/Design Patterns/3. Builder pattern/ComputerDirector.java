public class ComputerDirector {
    private ComputerBuilder builder;
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer(){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
    public Computer getComputer() {
        return builder.getComputer();
    }
}
