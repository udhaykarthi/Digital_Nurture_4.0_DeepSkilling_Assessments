public class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("Logger created");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance  = new Logger();
        }
        return instance;
    }
    public void log(String msg){
        System.out.println("Logged message: " + msg);
    }
}