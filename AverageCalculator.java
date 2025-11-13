// Michael A. Nyanga  NCE/SCI/280/23

import java.util.Scanner; // kulowetsa Scanner class

public class AverageCalculator {
    public static void main(String[] args) {

        // kupanga Scanner wa object kuti awerenge manambala apa keyboard
        Scanner input = new Scanner(System.in);

        // Mukufunsidwa kulowetsa nambala yoyamba
        System.out.print("Lowetsani nambala yoyamba: ");
        double num1 = input.nextDouble(); // kuwerenga nambala yoyamba

        //Mukufunsidwa kulowetsa nambala yachiwiri
        System.out.print("Lowetsani nambala yachiwiri: ");
        double num2 = input.nextDouble(); // kuwerenga nambala yachiwiri

        //Mukufunsidwa kulowetsa nambala yachitatu
        System.out.print("Lowetsani nambala yachitatu: ");
        double num3 = input.nextDouble(); // kuwerenga nambala yachitatu

       //Mukufunsidwa kulowetsa nambala yachinayi
        System.out.print("Lowetsani nambala yachinayi: ");
        double num4 = input.nextDouble(); // kuwerenga nambala yachinayi

        // kupeza average yamanambala anayi onse
        double average = (num1 + num2 + num3 + num4) / 4;

        // kuwonetsa zotsatira
        System.out.println("The average of the four numbers is: " + average);

        // kutseka porogaramu
        input.close();
    }
}

