import java.util.ArrayList;
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

        ArrayList result = new ArrayList<>();

        for(int i = 0; i < cnt; i++) {

            int num = sc.nextInt();

            int x = 0;
            int y = 0;
            int n = 0;
            boolean xPrime = true;
            boolean yPrime = true;

            for (int a = 2; a <= num / 2; a++) {
                x = a;
                y = num - a;

                xPrime = true;
                yPrime = true;

                for (int j = 2; j < x; j++) {
                    if (x % j == 0) {
                        xPrime = false;
                        break;
                    }
                }

                for (int k = 2; k < y; k++) {
                    if (y % k == 0) {
                        yPrime = false;
                        break;
                    }
                }

                if ((xPrime == true) && (yPrime == true)) {
                    n++;
                }
            }
            result.add(n);

        }

        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

        sc.close();

    }
}
