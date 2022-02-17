import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_10845 {

    /* 자료구조 - 큐
    push : 정수를 큐에 넣는 연산
    pop : 가장 앞에 있는 정수를 빼고, 그 수를 출력. 큐에 들어있는 정수가 없는 경우에는 -1 출력
    size : 큐에 들어있는 정수의 개수 출력
    empty : 큐가 비어있으면 1, 아니면 0 출력
    front : 가장 앞에 있는 정수 출력. 큐에 들어있는 정수가 없는 경우에는 -1 출력
    back : 가장 뒤에 있는 정수 출력. 큐에 들어있는 정수가 없는 경우에는 -1 출력
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList que = new ArrayList<>();

        int num = sc.nextInt();
        sc.nextLine();

        while (num > 0){
            String str = sc.nextLine();
            String exe = str.split(" ")[0];

            switch (exe){
                case "push":
                    que.add(str.split(" ")[1]);
                    break;
                case "pop":
                    if(que.size() == 0){
                        System.out.println("-1");
                    } else {
                        System.out.println(que.get(0));
                        que.remove(0);
                    }
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    if(que.size() == 0){
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front":
                    if(que.size() == 0){
                        System.out.println("-1");
                    } else {
                        System.out.println(que.get(0));
                    }
                    break;
                case "back":
                    if(que.size() == 0){
                        System.out.println("-1");
                    } else {
                        System.out.println(que.get(que.size() -1));
                    }
            }

            num--;
        }

        sc.close();

    }
}
