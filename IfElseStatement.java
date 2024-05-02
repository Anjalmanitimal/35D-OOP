public class IfElseStatement {
    public static void main(String[] args) {
        /* Simple if example */
        if(true){
            System.out.println("True statement");
        }
        /* If takes an expression with boolen value */
        int num1 =10,num2=20;
        if(num1>num2){
            System.out.println("greater");
        }else{
            System.out.println("Lesser");
        }
        /*if else if , two condition */
        if(num1 ==num2){
            System.out.println("Equals");
        }else if(num1<num2){
            System.out.println("Lesser num2");
        }else{
            System.out.println("Grester");
        }
        /* If else if ladder multiple condition */
        if(num1 <0){
            System.out.println("Num1 is negative");
        }else if(num1 != num2){
            System.out.println("Num2 is negative");
        }else if(num1 > num2){
            System.out.println("greater");
        }else{
            System.out.println("default statement");
        }
        /*If any condition matches it will skip all the remaining
         * conition including else, condition will be checked from
         * top-bottom*/


         /*Nested if condition */
         if(num1 > 0){
            if(num1>num2){
                System.out.println("positive and greater");
            }else{
                System.out.println("positive and lesser");
            }
        }else{
            if(num1 > num2){
                System.out.println("negative and greater");
            }else{
                System.out.println("negative and lesser");
            }
        }
              
    }
}
