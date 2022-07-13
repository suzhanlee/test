
import java.util.Scanner;
import java.util.Random;

public class Practice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String 출생년도 = sc.nextLine();
        System.out.print("출생월을 입력해 주세요.(mm):");
        int 출생월 = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int 출생일 = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        char 성별 = sc.next().charAt(0);

        Random random = new Random();

        int 임의번호 = random.nextInt(1000000);


        출생년도 = 출생년도.substring(2);

        if (성별 == 'm') {
            성별 = '3';
        }
        if (성별 == 'f') {
            성별 = '4';
        }

        System.out.print(출생년도);
        System.out.printf("%02d", 출생월);
        System.out.printf("%02d", 출생일);
        System.out.print("-" + 성별);
        System.out.printf("%06d", 임의번호);


    }


}











