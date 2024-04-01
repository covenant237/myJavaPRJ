import java.util.Scanner;
public class 과제 {
    public static void main(String[]agrs) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.print("정수를 입력하세요 : ");
        select = s.nextInt();
        if(select % 3 ==0 && select % 5 ==0) {
            System.out.print("3의 배수와 5의배수 모두 만족합니다.");
        }
        else if(select % 3 ==0) {
            System.out.print("3의 배수 입니다.");
        }
        else if(select % 5 ==0) {
            System.out.print("5의 배수 입니다.");
        }
        s.close();
    }

}
