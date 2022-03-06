import java.util.Scanner;

public class baekjoon_1978 {

    /* 수학 - 소수 찾기
    주어진 N개 중 소수가 몇 개인지 찾아서 출력
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if(num == 1){
                cnt++;
                continue;
            }

            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(n - cnt);

        sc.close();

    }

}
