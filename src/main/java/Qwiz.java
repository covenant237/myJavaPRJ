import java.util.Scanner;
public class Qwiz {
    public static void main(String[]args) {
        int a, b;

        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        a = s.nextInt();

        System.out.print("두번째 숫자 입력 : ");
        b = s.nextInt();

        if(a<b) {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        }
        else if(a>b) {
            for (int i=a ; i>b ; i--) {
                System.out.println(i);
            }
        }
    }
}
