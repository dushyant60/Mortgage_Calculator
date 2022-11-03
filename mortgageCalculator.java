import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

           Scanner s = new Scanner(System.in);
            System.out.print("Principle Amount:");
            double principle = s.nextDouble();
            
            System.out.print("Annual Interest Rate:");
            float annualInterest = s.nextFloat();
            float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR ;

            System.out.print(" Time Period:");
            int time = s.nextInt();
            int yearlyTime = time * MONTHS_IN_YEAR;

            double mortgage = (principle*monthlyInterest) / (1- Math.pow(1 + monthlyInterest, - yearlyTime));

            System.out.println("Payment is:" + mortgage);
        }
        
    }
