import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1373 {

    /* 수학 - 2진수 8진수
    2진수를 8진수로 변환
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();

        if (len % 3 == 1){
            str = "00" + str;
        } else if (len % 3 == 2){
            str = "0" + str;
        }

        String[] result = new String[str.length()];
        result = str.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < result.length; i += 3){
            sb.append((Integer.parseInt(result[i]) * 4) + (Integer.parseInt(result[i + 1]) * 2) + (Integer.parseInt(result[i + 2]) * 1));
        }

        System.out.println(sb);

        sc.close();

    }
}
