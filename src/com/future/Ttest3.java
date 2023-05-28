package com.future;

import java.io.StringReader;

public class Ttest3 {
    public static void main(String[] args) {
        String str="Hello";

        String one=str.concat(str);
        one=one.concat(str);

        System.out.println(one);
    }
}
