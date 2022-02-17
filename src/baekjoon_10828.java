import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_10828 {

    /* 자료구조 - 스택
    push X : 정수 X를 스택에 넣는 연산
    pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1 출력
    size : 스택에 들어있는 정수의 개수 출력
    empty : 스택이 비어있으면 1, 아니면 0 출력
    top : 스택의 가장 위에 있는 정수 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1 출력
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> stack = new ArrayList();

        int num = sc.nextInt();

        if(num < 1 || num > 10000){
            return;
        }

        sc.nextLine();      // nextInt()는 개행문자 전까지만 입력을 받고 개행문자는
        // 다음 nextLine()이 읽기 때문에 nextLine()을 한번 더 사용해 개행문자 제거

        for(int i = 0; i < num; i++){
            String str = sc.nextLine();
            String exe = str.split(" ")[0];

            if(exe.equals("push")){
                stack.add(str.split(" ")[1]);
            } else if(exe.equals("pop")){
                if(stack.size() == 0){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.get(stack.size() - 1));
                    stack.remove(stack.size() - 1);
                }
            } else if(exe.equals("size")){
                System.out.println(stack.size());
            } else if(exe.equals("empty")){
                if(stack.size() == 0){
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if(exe.equals("top")){
                if(stack.size() == 0){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.get(stack.size() - 1));
                }
            }
        }

        sc.close();

    }
}
