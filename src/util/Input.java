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

}
