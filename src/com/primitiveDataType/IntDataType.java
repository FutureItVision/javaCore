package com.primitiveDataType;

public class IntDataType {


    static int banana=2;
    static int lemon=3;
    static int TotalPrice=banana+lemon;
    static String Memo ="Total Price: $";

    static String total ="Total Price: $";


    public static void main(String[]args){
        grocery();

    }

    public static void grocery(String fish){
        System.out.println(total+TotalPrice);
    }

    public static void grocery(){
        System.out.println(total+TotalPrice);
    }


}
