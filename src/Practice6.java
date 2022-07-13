import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;




public class Practice6 {
    static void perm(char[] arr, char[] output, boolean[] visited, int depth, int n, int r,
                     List<String>saveList) {
        if (depth == r) {
            // System.out.println(new String(output));
            saveList.add(new String(output));

            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r, saveList);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;
            }
        }


    }
    public static boolean solution(String s1, String s2){

        char[] chars = s1.toCharArray();
        char[] output = new char[s1.length()];
        boolean[] visited = new boolean[s1.length()];
        
        List<String> saveList = new ArrayList<>();

        perm(chars,output, visited,0,s1.length(),s1.length(), saveList);

        for (String data : saveList) {
           if(s2.contains(data)) {
               return true;
           }
            
        }

        return false;


    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "adbak";
        System.out.println(solution(s1, s2));

        System.out.println();

        s1 = "ac";
        s2 = "car";
        System.out.println(solution(s1, s2));

        System.out.println();

       s1 = "ak";
       s2 = "aabbkk";
       System.out.println(solution(s1, s2));











    }
}

