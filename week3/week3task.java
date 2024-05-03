package week3;
import java.util.Scanner;
public class week3task {
    public static void main(String[] args) {
        /*1.Write a JAVA program to find the maximum between three numbers */
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = scan.nextInt();
        System.out.println("Enter the second Number");
        int b = scan.nextInt();
        System.out.println("Enter the third number");
        int c = scan.nextInt();
        int max;
        if (a>b && a>c) {
            max = a;
        } else if (b>a && b>=c) {
            max = b;
        } else {
            max = c;
        }
        System.out.printf("%d is maximum",max);



        // 2. Write a JAVA program to check whether a number is negative, positive, or zero. 
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("The number is positive");
        }else if (num < 0) {
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is Zero");
        }



        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        System.out.println("Enter the number");
        int x = scan.nextInt();
        if (x%5==0 && x%11==0) {
            System.out.println("The number is divisible by 5 and 11");
        }else{
            System.out.println("The number is not divisible by 5 and 11");
        }



        
        // 4. Write a JAVA program to check whether a number is even or odd.
        System.out.println("Enter a number:");
        int numb = scan.nextInt();

        if(numb % 2 == 0){
            System.out.println(numb + " is even.");
        }else{
            System.out.println(numb + " is odd.");
        }



        // 5. Write a JAVA program to check whether a year is a leap year or not. 
        // Hint: if year%4==0; if year%100!==0 ; year%400==0; 
        System.out.println("Enter year");
        int y = scan.nextInt();
        if (y%4==0) {
            System.out.println("The year is leap year");
        }else if (y%100==0) {
            System.out.println("The year is leap year");
        }else if (y%400 == 0) {
            System.out.println("The year is leap year");
        }else{
            System.out.println("The year is not leap year");
        }




        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        System.out.println("Enter any alphabet:");
        String s = scan.nextLine();
        char ch = s.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The alphabet is a vowel.");
        } else {
            System.out.println("The alphabet is a consonant.");
        }

        
 
    }
}
