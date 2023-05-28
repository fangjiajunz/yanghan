import java.util.Scanner;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name=null;
        String mima=null;
        boolean denglu=false;
        int cardNumber=0;
        String shuru = "否";
        do {
            System.out.println("*****欢迎进入幸运抽奖系统*****");
            System.out.println("1,注册");
            System.out.println("2,登录");
            System.out.println("3,退出登录");
            System.out.println("4,抽奖");
            System.out.println("5,退出系统");
            System.out.println("请选择：（请输入1~5）");
            System.out.println("*********************");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请先注册：");
                    System.out.println("请输入您的用户名：");
                    name=input.next();
                    System.out.println("请输入您的密码：");
                    mima=input.next();
                    cardNumber = (int) (Math.random() * (9999-1000));
                    System.out.println("注册成功！");
                    System.out.println("用户信息如下：");
                    System.out.println("用户名：" + name);
                    System.out.println("密码：" + mima);
                    System.out.println("会员号：" + cardNumber);
                    break;
                case 2:
                    for(int n=0;n<3;n++){
                        System.out.println("欢迎登录幸运会员抽奖系统！");
                        System.out.println("请输入您的用户名：");
                        String inputname = input.next();
                        System.out.println("请输入您的密码：");
                        String inputmima = input.next();
                        if (name.equals(inputname) && mima.equals(inputmima)) {
                            System.out.println("登陆成功！");
                            System.out.println("用户名：" + name);
                            System.out.println("密码：" + mima);
                            System.out.println("会员号：" + cardNumber);
                            denglu = true;
                            break;
                        } else {
                            System.out.println("您的输入有误，请重新输入");
                            while(n==2){
                                System.out.println("您已输错三次，请重新登陆！");
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("您是否退出登录：是/否？");
                    String answer = input.next();
                    if (answer.equals("是")&&denglu==true) {
                        System.out.println("退出登录成功！");
                    }
                    else {
                        System.out.println("您还未登录！");
                    }
                    break;
                case 4:
                    if(denglu==true) {
                        System.out.println("请抽奖!   祝您好运！  ");
                        System.out.println("请输入您的会员卡号：");
                        int num = input.nextInt();
                        int[] LuckNum = new int[5];
                        for (int i = 0; i < LuckNum.length; i++) {
                            LuckNum[i] = (int) (Math.random() * (9999 - 1000));
                            if (i == 4) {
                                System.out.println("本日幸运会员卡号为：" + Arrays.toString(LuckNum));
                                System.out.println("您的会员卡号为：" + num);
                                if (num == LuckNum[i]) {
                                    System.out.println("恭喜您成为本日幸运会员！");
                                    break;
                                } else {
                                    System.out.println("抱歉，您不是本日幸运会员！");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("您是否退出系统：是/否？");
                    shuru = input.next();
                    while (shuru.equals("是")) {
                        System.out.println("本程序已结束，退出系统！");
                        break;
                    }
                    break;
                default:
                    System.out.println("输入数字有误，请重新输入数字！");
            }
        }
        while (shuru.equals("否"));
    }
}
