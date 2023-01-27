package Giris;
import java.util.Scanner;

public class yildizelmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tempnumber=0, number;

        System.out.println("Bir Sayı Giriniz :");
        number = inp.nextInt();

        for (int i=1;i<=number;i++){
            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i=1;i<=number-1;i++){
            for (int m=1;m<=i;m++){
                System.out.print(" ");
            }
            for (int l=1;l<=2*(number-i)-1;l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}





