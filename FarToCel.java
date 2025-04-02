import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int F = s.nextInt();
        //int C = (5/9)*(F-32);   //here(5/9) becomes 0.
        //int C = (5*(F-32))/9;
        int C = (int)((5.0/9)*(F-32));

        System.out.println(C);
    }
}
