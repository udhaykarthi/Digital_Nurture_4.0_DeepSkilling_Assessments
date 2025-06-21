import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        double presentValue = sc.nextDouble();
        double growth = sc.nextDouble();
        System.out.println("Value in " + year + " years is: "+ recur(year,presentValue,growth));
        sc.close();
    }
    public static double recur(int year,double presentValue, double growth){
        if(year == 0){
        return presentValue;
    }
    return recur(year - 1, presentValue * (1 + growth / 100), growth);

    }
}