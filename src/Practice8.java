
import java.util.Scanner;

public class Practice8 {

    public static void main(String[] args) {

        System.out.println("[과세 계산 프로그램]");

        Scanner sc = new Scanner(System.in);
        System.out.print("연소득을 입력해 주세요.:");
        int 연소득 = sc.nextInt();



        double 세금1 = 0;

        double a = 12000000 * 0.06;
        double b = 34000000 * 0.15;
        double c = 42000000 * 0.24;
        double d = 62000000 * 0.35;
        double e = 150000000 * 0.38;
        double f = 200000000 * 0.4;
        double g = 500000000 * 0.42;

        String s0 = String.format("%9d * %2d%% = %9d",12000000,6,720000);
        String s1 = String.format("%9d * %2d%% = %9d",34000000,15,5100000);
        String s2 = String.format("%9d * %2d%% = %9d",42000000,24,10080000);
        String s3 = String.format("%9d * %2d%% = %9d",62000000,35,21700000);
        String s4 = String.format("%9d * %2d%% = %9d",150000000,38,57000000);
        String s5 = String.format("%9d * %2d%% = %9d",200000000,40,80000000);
        String s6 = String.format("%9d * %2d%% = %9d",500000000,42,210000000);





        if (연소득 - 12000000 <= 0) {
            세금1 = 연소득 * 0.06;
            System.out.println("%9d * 6% =" + (int)세금1 );

        } else if (연소득 - 12000000 > 0 && 연소득 -46000000 <0) {
            세금1 = (연소득 - 12000000) * 0.15 + a;
            System.out.println(s0);
            int i = (int)Math.round((연소득 - 12000000) * 0.15);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 12000000, 15, i);



        } else if (연소득 - 46000000 > 0 && 연소득 - 88000000 <0) {
            세금1 = (연소득 - 46000000) * 0.24 + a + b ;
            System.out.println(s0);
            System.out.println(s1);
            int i = (int)Math.round((연소득 - 46000000) * 0.24);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 46000000,24,i);


        } else if (연소득 - 88000000 > 0 && 연소득 - 150000000 <0) {
            세금1 = (연소득 - 88000000) * 0.35 + a + b + c;
            System.out.println(s0);
            System.out.println(s1);
            System.out.println(s2);
            int i = (int)Math.round((연소득 - 88000000) * 0.35);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 88000000,35,i);


        } else if (연소득 - 150000000 > 0 && 연소득 - 300000000 <0) {
            세금1 = (연소득 - 150000000) * 0.38 + a + b + c + d;
            System.out.println(s0);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            int i = (int)Math.round((연소득 - 150000000) * 0.38);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 150000000,38,i);


        } else if (연소득 - 300000000 > 0 && 연소득 - 500000000 <0) {
            세금1 = (연소득 - 300000000) * 0.4 + a + b + c + d + e;
            System.out.println(s0);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            int i = (int)Math.round((연소득 - 300000000) * 0.40);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 300000000,40,i);


        } else if (연소득 - 500000000 > 0 && 연소득 - 1000000000 <0) {
            세금1 = (연소득 - 500000000) * 0.42 + a + b + c + d + e + f;
            System.out.println(s0);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            int i = (int)Math.round((연소득 - 500000000) * 0.42);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 500000000,42,i);


        } else if (연소득 > 1000000000 ) {
            세금1 = (연소득 - 1000000000) * 0.45 + a + b + c + d + e + f + g;
            System.out.println(s0);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            System.out.println(s6);
            int i = (int)Math.round((연소득 - 1000000000) * 0.45);
            System.out.printf("%9d * %2d%% = %9d",연소득 - 1000000000,45,i);

        }
        System.out.println();

        System.out.print("[세율에 의한 세금]:          " );


        System.out.println((int)세금1);



        System.out.print("[누진공제 계산에 의한 세금]:   ");

        double 세금2 = 0;

        if (연소득 <= 12000000) {
            세금2 = 연소득 * 0.06;

        } else if (연소득 <= 46000000) {
            세금2 = 연소득 * 0.15 - 1080000;

        } else if (연소득 <= 88000000) {
            세금2 = 연소득 * 0.24 - 5220000;

        } else if (연소득 <= 150000000) {
            세금2 = 연소득 * 0.35 - 14900000;

        } else if (연소득 <= 300000000) {
            세금2 = 연소득 * 0.38 - 19400000;

        } else if (연소득 <= 500000000) {
            세금2 = 연소득 * 0.4 - 25400000;

        } else if (연소득 <= 1000000000) {
            세금2 = 연소득 * 0.42 - 35400000;

        } else if (연소득 > 1000000000) {
            세금2 = 연소득 * 0.45 - 65400000;

        }

        System.out.println((int)세금2);


    }
}




