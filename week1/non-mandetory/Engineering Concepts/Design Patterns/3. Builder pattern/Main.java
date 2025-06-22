public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new IntelBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructComputer();
        Computer computer = director.getComputer();
        System.out.println("Computer built with: " +computer.toString());

        ComputerBuilder amdBuilder = new AMDBuilder();
        ComputerDirector amdDirector = new ComputerDirector(amdBuilder);
        amdDirector.constructComputer();
        Computer amdComputer = amdDirector.getComputer();
        System.out.println("AMD Computer built with: " + amdComputer.toString());
    }
}
