package com.xiaoxin;

import java.util.Random;

public class EvenNumberApp {
    public static Boolean isevennumber(int number){
        if((number & 1) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int randomInt =rand.nextInt(100);//生成一个随机整数
        System.out.println("Random Integer"+ randomInt);
        Boolean flag= isevennumber(randomInt);
        String result="";
        if(flag){
            result="偶数";
        }
        else{
           result="奇数";
        }  
    System.out.println("生成的随机数:"+randomInt+"为"+result);
    }

}
