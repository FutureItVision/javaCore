package com.condition;

public class TryCatchJava {




    public static void  main(String[]args){

        int banana=20;
        int lemon=10;
        int total=banana+lemon;
        String message=" Total price is $";

        try{
          int[] currency={10,20,30,40,50};
            System.out.println(currency[5]);

        }catch (Exception e){
            System.out.println(" having issue");


        }finally {
            System.out.println(" i am done");
        }



    }




}
