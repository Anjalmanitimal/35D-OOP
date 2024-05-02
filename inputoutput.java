import java.util.Scanner;
/*Or
*import java.until.*;
*/




public class inputoutput {
    public static void main(String[] args) {
        /*User Output */
        System.out.println("This sentence will have line break");
        /*System.out.print */
        System.out.println("This will not have break");
        System.out.println("This line will continue.\n");
        /*String formatting using System.out.print
         * %s String, %d Integral, %f floating point, %b boolean
         * this line will also not break line
         */
        System.out.printf("Hello %s,good morning","world");
        System.out.printf("the number is %d",10);
        /*can use multiple formatter */
        System.out.printf("\nThe floating %f and boolean %b",10.3f, false);
        /*User Input
         * import 
          */
          Scanner scan = new Scanner(System.in);
          System.out.println("The following take whole sentence");
          String wholeOutput = scan.nextLine();
          System.out.println("The input taken is "+ wholeOutput);
          System.out.println("The following takes integer");
          int intInput = scan.nextInt();
          System.out.println("The input taken is" + intInput);
          System.out.println("The folllowing take double");
          double doubleInput = scan.nextDouble();
          System.out.println("The input taken is "+ doubleInput);
          System.out.println("The following takes boolean");
          boolean booleanInput = scan.nextBoolean();
          System.out.println("The input taken is "+ booleanInput);
          scan.close();// you must close the scanner once all input is taken 

          /*task
           * Make a new scanner object scan1
           * Prompt the following and take input
           * Whta is your name? save the input to string -> name
           * Are you over 18? save the input to boolean ->status
           * How many sibling? save the input to integer -> sibling
           * print the following 
           * Hello name,
           * Over 18?,status
           * You have sibling number of sibling
           */
           
           Scanner scan1= new Scanner(System.in);
           System.out.println("what is your name?");
           String name = scan1.nextLine();
           System.out.println("Over 18 ?");
           boolean status = scan1.nextBoolean();
           System.out.println("How many siblings?");
           int sibling = scan1.nextInt();
           System.out.println("hello"+ name);
           System.out.println("over 18?"+ status);
           System.out.println("you have "+ sibling + "siblings");
           scan1.close();




        


    }
    
}
