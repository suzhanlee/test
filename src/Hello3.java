
class solution {
    public int solution(int n, int m) {
        int answer = 0;
        boolean isPali = true;

        for(int i = n; i <= m; i++){
            String s = Integer.toString(i);
            int[] arr = new int[s.length()];
            for(int k = 0; k < s.length(); k++){
                arr[k] = s.charAt(k) - '0';
            }



            for(int j=0; j < arr.length ; j++){

                if(arr[j] != arr[arr.length -1 - i]){
                    isPali = false;
                    break;
                }
            }




            if(isPali == true){
                answer++;
            }
        }
        return answer;
    }
}


