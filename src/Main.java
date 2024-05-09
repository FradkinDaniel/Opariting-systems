import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        out.println("enter number of cows must be at least 4");
        int n = input.nextInt();
        SharedResources ser = new SharedResources();
        Compound comp = new Compound();
        for(int i=0;i<n+1;i++){
           new CowThread(i,ser,comp).run();
        }

    }
}