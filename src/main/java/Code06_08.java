public class Code06_08 {
    public static void main(String[]args) {
        int hap = 0;
        for (int i=100 ; i<=2000 ; i+=2) {
            hap += i;

        }
        System.out.println("1000부터 2000까지 홀수의 합계 : " + hap);

    }
}
