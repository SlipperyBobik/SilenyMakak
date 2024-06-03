package k;

import java.util.Scanner;

public class Lampashop {

    Scanner s = new Scanner(System.in);

        int lampy;
        final int prodlampa = 250;
        final int kouplampa = 100;
        int balance;

        public Lampashop (int lampy, int balance){
            this.balance = balance;
            this.lampy = lampy;
        }

        void prodej(int lampy){
            if (this.lampy >= lampy) {
                this.lampy -= lampy;
                balance += prodlampa * lampy;
            }else {
                System.out.println("Nicht");
            }
        }
        void koupe (int lampy){
            if (balance >= kouplampa * lampy){
                balance -= kouplampa * lampy;
                this.lampy += lampy;
            }else {
                System.out.println("No many kys broke ass niggar");
            }
            System.out.println(balance);
        }


        package k;

public class Lampakod {
    public static void main(String[] args) {
        Lampashop lampas = new Lampashop(10, 5000);
        lampas.koupe(10);
        lampas.prodej(20);

    }
}
    }


