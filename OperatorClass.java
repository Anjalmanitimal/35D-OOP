public class OperatorClass {
    public static void main(String[] args) {
        /* Arithmetic operators */
        int a = 10, b = 10;
        int sum = a+b; //here the "+" is an arithmetic operators
        System.out.println("Addition for a+b is" + sum);
        System.out.println("Difference for a-b is"+ (a-b));
        System.out.println("Multiplication for a*b is" +(a*b));
        System.out.println("division for a/b is" + (a/b));
        System.out.println("modulo for a and b is " + (a%2));


        /* Assignment Operators */
        int aNumber1;
        aNumber1 = 10;
        /* or declare and assign */
        int aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with +=" + (aNumber1+=10));
        aNumber2 -= 30; //same as aNumber2 = aNumber2 - 30;
        System.out.println("Assignment with -=" + aNumber2);

        /* Relational Operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2" + (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than rNumber2?" + (rNumber1> rNumber2));
        System.out.println("rNumber1 lessthan or equals to rNumber2?" + (rNumber1<=rNumber2));
        System.out.println("rnumber not equals to rNumber2? " + (rNumber1!=rNumber2));

        /*logical Operators*/
        int lnumber1 = 10, lnumber2 = 12;
        boolean lExpression1 = lnumber1 == lnumber2;
        boolean lExpression2 = lnumber1 <= lnumber2;
        System.out.println("amd operator uses &&"+ (lExpression1 && lExpression2));
        System.out.println("Or operator uses || " + (lExpression1 || lExpression2));
        System.out.println("Not operator uses ! " + !lExpression1);

        /*Unary operator */
        int uNumber1 = 10;
        uNumber1++; //meaning uNumber1 = uNumber1 + 1;
        System.out.println("Unary for increament is ++" + uNumber1);
        uNumber1--;
        System.out.println("Unary for decreament is --" + uNumber1);


        /* Ternary operator */
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * One line if else, see the given example in if else 
         * string output;
         * if(tExpression == true){
         * *  output = "True statement";
         * }else{
         *  output = "False statement";
         * }
         */
        String output = tExpression ? "True Statement" : "False Statement";
        /* Here we can assign a string out with one expression
         * if expression is true it will return the value after the "?"
         * if the expression is false it will return the value after the ":"
         */
        int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);
    }
}
 
/* Task1
 * Write a program to print wheather a variable is greater or equal to 18
 */

        int zNumber1 = 18, zNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2" + (zNumber1 == zNumber2));
        System.out.println("rNumber1 greater than rNumber2?" + (zNumber1> zNumber2));

 /*Task2
  * Write a program to print simple internet from variables
  * Make 3 variables for amount, time and rate and save the calculation into a variable
  * Formula:
  * si = amount = time = rate/100; 
  */
        int Amount=

  /* Task3
   * Write a program to print the area and perimeter of rectangle 
   * a = l*b
   * p=2(l + b)
   */

   /*Task4
    * Complete the task 1 using ternary operaions
    */


