import java.util.Scanner;

public class baekjoon_1145 {
    /* 수학 - 적어도 대부분의 배수
    다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세개로 나누어지는 가장 작은 자연수
    서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        String str = sc.nextLine();

        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(str.split(" ")[i]);
        }

        int min = num[0];
        int count = 0;

        // 최솟값 찾기
        for(int i = 0; i < num.length; i++){
            if(min > num[i]){
                min = num[i];
            }
        }

        while(true) {
            for (int i = 0; i < num.length; i++) {
                if (min % num[i] == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.println(min);
                break;
            } else {
                min++;
                count = 0;
            }
        }

        sc.close();

    }
}
