import java.util.Scanner;
public class test {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a, b;

        System.out.print("첫번째 숫자 : ");
        a = s.nextInt();

        System.out.print("두번째 숫자 : ");
        b = s.nextInt();

        if(a<b) {
            System.out.println("b는 a보다 큽니다. ");
        }
        else if(a>b) {
            System.out.println("a는 b보다 큽니다.");
        }
        else if(a==b) {
            System.out.println("a와 b는 같습니다.");
        }
        s.close();
    }
}

