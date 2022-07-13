

import java.util.Calendar;
import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Scanner s1 = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int 연도 = s1.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int 월 =s1.nextInt();

        System.out.println();
        System.out.println();

        c1.set(Calendar.YEAR , 연도);
        c1.set(Calendar.MONTH, 월);

        System.out.printf("[" + 연도 + "년" + "%02d" + "월" + "]", 월);
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        c1.set(연도, 월-1, 0);

        int 마지막날 = c1.getActualMaximum(Calendar.DATE);
        int 요일 = c1.get(Calendar.DAY_OF_WEEK);


        for (int i = 1; i <= 요일; i++) {
            if (요일 % 7 == 0) {
                break;
            }
            System.out.print("\t");
        }

        for (int day = 1, n = 요일 + 1; day <= 마지막날; day++, n++) {
            System.out.printf("%s\t", day < 10 ? "0" + day : "" + day);
            if (n % 7 == 0) {
                System.out.printf("\n");
            }
        }
    }
}



















