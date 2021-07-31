package ua.pp.kris.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for(;;) {
            System.out.println("Select a command:\n 1. Converter degrees Celsius to Fahrenheit \n 2. Sum of digits" +
                    "\n Exit: press X");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            if(answer.equals("1")) {
                System.out.println("You chose coverter.\n Enter degress Celsius:");
                double celsius = in.nextDouble();
                System.out.println("Fahrenheit: " + (celsius*1.8+32));
            } else if (answer.equals("2")){
                System.out.println("You chose sum \n Enter digit:");
                int sum = 0;
                for (int digit = in.nextInt(); digit!=0; digit/=10){
                    sum += (digit%10);
                }
                System.out.println(sum);
            } else if(answer.equalsIgnoreCase("x")) break;
            else continue;
        }
    }
}
