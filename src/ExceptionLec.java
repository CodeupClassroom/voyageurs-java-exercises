import util.Input;

public class ExceptionLec {

    static Input input = new Input();

    public static void main(String[] args) throws Exception {

        String answer = getIndentationPreference();
        System.out.println(answer);

        int[] numbers = {1, 2, 3};

        System.out.println("before the exception");

        try {
            System.out.println("Step 1:");
            System.out.println(numbers[999]);
            System.out.println("Step 2: requires step 1 to be completed");
        } catch (Exception e){
            System.out.println("User list is smaller than the request");
        } finally {
            System.out.println("after the exception");
        }



        try {
//            System.out.println( 5 / 0 );
            int i = input.getInt();
            System.out.println(i);
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0 on java");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("A general error");
        } finally {
            System.out.println("I'm still working");
        }

    }

    // Unchecked exception
    public static String getIndentationPreference() throws Exception {

        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = input.getString();

        if(indentationPreference.equals("tabs")){
            WrongIndentationTypeException myException;
            myException = new WrongIndentationTypeException("Spaces are better");
            throw myException;
        }

        return indentationPreference;
    }


}
