package com.future;

import javax.swing.plaf.BorderUIResource;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class Test1 {
    static String userName=" ";
    static String passWorld=" ";
    static int code=0;
    static boolean ff=false;
    static boolean con=true;
    Scanner sc =new Scanner(System.in);
    Random r=new Random();
    public static void main(String[] args) {

    while (con){
        Myprint();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入对应数字");
        int a=sc.nextInt();
        myprint1(a);
    }

    }
    public static void Myprint(){
        System.out.println("1,注册");
        System.out.println("2,登录");
        System.out.println("3,退出登录");
        System.out.println("4,抽奖");
        System.out.println("5,退出登录");
    }
    public static void myprint1(int a){
        switch (a){
            case 1:
                myprint2();
                break;
            case 2:
               lonon();
                break;
            case 3:
                cheak();
                break;
            case 4:
                raffle();
                break;
            case 5:
                quit();
                System.out.println("你个老毕等终于退出了");
                break;
            default:
                System.out.println("error");
        }
    }
    public static void myprint2(){
        System.out.println("欢迎来到注册界面");
        System.out.println("请按任意键开始");
        Scanner sc=new Scanner(System.in);
        String not=sc.nextLine();
        System.out.println("请输入用户名");
        userName=sc.nextLine();
        System.out.println("请输入密码");
        passWorld=sc.nextLine();
        Random r=new Random();
        code=(r.nextInt(10000)+1000);
    }
    public static void lonon(){
        boolean gg=false;
        while (!gg) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的用户名");
            String inname = sc.nextLine();
            System.out.println("请输入密码");
            String inpassworld = sc.nextLine();
            if (inname.equals(userName) && inpassworld.equals(passWorld)) {
                System.out.println("登陆成功");
                System.out.println(code);
                gg=true;
                ff=true;
            }else
                System.out.println("请重新输入");
        }
    }
    public static void cheak(){
        if (ff){
            System.out.println("已经处于登录状态");
        } else{
                System.out.println("您还未登录");
            }
        }
    public static void raffle(){
        Random r=new Random();
        boolean hh=false;
        for (int i = 0; i < 4; i++) {
            int num=(r.nextInt(10000)+1000);
            System.out.print(num+"  ");
            if (code==num)
                hh=true;
        }
        System.out.println("你的code是  "+code);
        if (!hh){
            System.out.println("你没中奖");
        }else{
            System.out.println("呵呵呵呵你中奖了");
        }

    }
    public static void quit(){
        con=false;
    }

}

