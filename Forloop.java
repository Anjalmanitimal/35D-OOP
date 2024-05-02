public class Forloop {
    public static void main(String[] args) {
        /* Use for loop when condition is fixed  */
        for(int index = 0;index <5; index ++){
            System.out.println("loop running"+index);
    }

    /* Decrement loop */
    for(int index =10; index >=0; index --){
        System.out.println("loop running "+index);
    }
    /*Make the loop table for this */
    
    /*task
     * make a multiplication table of 2
     * print like the following 
     * 2 x 1 = 2
     * 2 x 2 = 4
     * .
     * .
     * 2 x 10 = 20
     * Note : initilize 1
     * condition <=10, or <10
     * increment ++
     */
    for(int i = 1;i<=10; i++){
        System.out.println("2 x "+ i + "="+ i *2 );
    }

    /*  Nested loop  */
    for(int outer =0; outer <3; outer ++){
        for(int inner =2; inner >=0; inner --){
            System.out.println("Inner >=0, inner");
        }
        System.out.println("Outer"+ outer);
    }
    /* Task use nested loop to do the following 
     * eg:
     * multiplication of 1 
     * 1 x 1 = 1 
     * 1 x 2 = 2
     * .
     * 1 x 10 = 10 
     * .
     * .
     * multiplication of 10 
     * 10 x 1 = 10 
     * 10 x 2 = 20
     * .
     * 10 x 10 = 100
     */
    for ( int in = 1; in <=10; in ++){
        System.out.println("multiplication of "+ in);
        for(int num = 1; num<=10; num ++){
            System.out.println(in+"*"+ num +"="+ in * num);
        }
    }
}
}
