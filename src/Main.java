import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        SharedResources res = new SharedResources();
        Compound comp = new Compound();

        System.out.println("Enter number of cows (minimum 4)");
        // minimum 4 cows required to execute walk();
        int n = input.nextInt();

        for(int i=1;i<n+1;i++){
           new Thread(new CowThread(i,res,comp)).start();
        }
    }
}