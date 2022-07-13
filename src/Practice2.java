import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int[] arr = new int[s1];

        for (int i = 0; i <s1 ; i++) {
            int s11 = sc.nextInt();
            arr[i] = s11;

        }
        int [] index = new int[2*s2+1];
        index[0] = 0;


        for (int i = 1; i <=2*s2 ; i+=2) {

            int s31 = sc.nextInt();
            int s32 = sc.nextInt();
            index[i] = s31;
            index[i+1] = s32;
        }
        int sum[] = new int[s2];
        for (int i = 1; i < s2 ; i++) {
            for (int j = index[i]; j<index[i+1]; j++) {
                sum[i] +=  arr[j];
            }

        }

        for(int item : sum){
            System.out.println(item);
        }

















    }


}
