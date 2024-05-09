import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        out.println("enter number of cows must be at least 4");
        int n = input.nextInt();
        SharedReasources ser = new SharedReasources();
        Compond comp = new Compond();
        for(int i=0;i<n+1;i++){
            new CowThread = new CowThread(i,ser,comp).start();
        }

    }
}