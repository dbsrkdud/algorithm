import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1158 {

    /* 자료구조 - 요세푸스
    1번부터 N번까지 사람이 원을 이뤄 앉아있고, 양의 정수 K(<=N)이 주어진다.
    순서대로 K번째 사람을 제거한다. 남은 사람들오 이루어진 원을 따라 과정을 반복한다.
    N명의 사람들이 제거될 때까지 계속된다.
    원에서 사람들이 제거되는 순서를 (N,K)-요세푸스 순열이라고 한다
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int k = Integer.parseInt(str.split(" ")[1]);

        ArrayList list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(k - 1));
            k += 3;
        }


    }

}
