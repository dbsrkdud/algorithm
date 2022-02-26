import java.util.Scanner;

public class baekjoon_17103 {
    /* 수학 - 골드바흐 파티션
    골드바흐의 추측 : 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
    짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다.
    짝수 N이 주어졌을 때 골드바흐 파티션의 개수
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        // 테스트 케이스 개수
        int[] arr = new int[cnt];

        for(int i = 0; i < cnt; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i ++){
            int test = arr[i];

            for(int j = 2; i < test / 2; j++){
                int k = test - j;

            }

        }
    }
}
