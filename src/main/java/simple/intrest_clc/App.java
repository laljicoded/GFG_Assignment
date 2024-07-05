package simple.intrest_clc;

import java.util.Scanner;

class BIC extends srcImp {

    @Override
    void hello() {
        System.out.println("NOTE: Enter Bank Name Option :  SBI , KOTAK ,ICICI ,YES , PNB");
    }

}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BIC b = new BIC();
        b.hello();
        System.out.println(" Enter bankName  amount  time to get simple intrest");
        String bankName = sc.nextLine();
        double amount = sc.nextInt();
        int time = sc.nextInt();

        double SI = b.simpleIntrestClc(bankName, amount, time);
        System.out.println(SI);

        sc.close();

    }
}
