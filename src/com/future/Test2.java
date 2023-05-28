package com.future;

public class Test2 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        String str="a234Asd3214df45";
        for (int i = 0; i < str.length(); i++) {
           char c= str.charAt(i);
           if ((c<='z' && c>='a')||(c<='Z'&&c>='A')){
               a++;
               if (a==1) {
                   b=i+1;
               }
           }
        }
        System.out.println(a);
        System.out.println(b);
    }
}

