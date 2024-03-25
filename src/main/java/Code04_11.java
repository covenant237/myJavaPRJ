public class Code04_11 {
    public static void main(String[] args) {
        String str = " 한글   ABCD efgh ";
        String cutstr  = "";

        cutstr = str.trim();

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백제거 ==>[" + cutstr + "]");
    }
}
