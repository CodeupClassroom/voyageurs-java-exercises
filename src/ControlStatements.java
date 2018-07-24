public class ControlStatements {

    public static void main(String[] args) {

        boolean isLoggedIn = false;
        boolean isAdmin = false;

        if (isLoggedIn && isAdmin){
            System.out.println("Show the admin menu");
        }else if (isLoggedIn || isAdmin){
            System.out.println("Show the index page");
        } else {
            System.out.println("You are not allowed to se this page");
        }

        if(!isLoggedIn){
            System.out.println("Redirect to the login page");
        }

        String name = "fer";

        if(name.equals("fer")){
            System.out.println("Your name matches");
        }else {
            System.out.println("Your name doesnt match");
        }

        String lname = "mendoza";

        if("mendoza".equals(lname)){
            System.out.println("Your last name matches");
        }else {
            System.out.println("Your last name doesnt match");
        }

//
        int grade = 60;
        switch (grade){
            case 50:
                System.out.println("You need to practice more");
                break;
            case 70:
                System.out.println("You pass");
                break;
            case 80:
                System.out.println("Good job");
                break;
            default:
                System.out.println("Not a valid grade");
        }

        boolean condition = true;
        int number = 1;

        while( condition ){
            if(number == 10){
                condition = false;
            }
            System.out.println(number);
            number++;
        }

        number = 1;
        condition = true;

        do{
            if(number == 10){
                condition = false;
            }
            System.out.println(number);
            number++;
        }while(condition);
        
        for (int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
        }

        for (int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
            if(i == 5){
                break;
            }
        }

        System.out.println("Continue example");
        for (byte i = 1; i <= 10; i++){
            if(i == 8 || i == 4){
                continue;
            }
            System.out.println("i = " + i);
        }


    }

}
