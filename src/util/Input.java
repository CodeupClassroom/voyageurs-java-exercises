package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    // Original version with params
    public String getString(String prompt){
        System.out.println(prompt);
        return this.sc.nextLine().toLowerCase().trim();
    }

    // Another version without params
    public String getString(){
        return this.getString("Type: ");
    }

    // YesNo reuses some code from getString
    public boolean yesNo(){
        String result = this.getString("Type yes or no (y/n)");
        return (result.equals("y") || result.equals("yes"));
    }

    public int getInt(int min, int max){

        int userInput = Integer.parseInt(this.getString("Give me a number between " + min + " and " + max));

        if(userInput < min || userInput > max){
            System.err.println("Number our of range");
            getInt(min, max);
        }

        return userInput;
    }

    public int getInt(){
        return Integer.parseInt(this.getString("Give me a number"));
    }

    public double getDouble(double min, double max){
        double userInput = Double.parseDouble(this.getString("Give me a decimal number between " + min + " and " + max));

        if(userInput < min || userInput > max){
            System.err.println("Decimal number out of range");
            userInput = getDouble(min, max);
        }

        return userInput;
    }

    public double getDouble(){
        return Double.parseDouble(this.getString("Give me a decimal number"));
    }

}
