import java.util.Arrays;
public class Q09 {
    public static void main(String[] args) {
        String myStr = "I'm a JaVa PrOgRaMmmmEr";
        StringBuffer newstr=new StringBuffer();
        int x = 1;
        char[] charArr = myStr.toCharArray();
        for (char i: charArr) {
            if (!(i == 'M' | i == 'm' )){
            newstr.append(i);
            }
            else {
                if (x<=3){
                    x++;
                }
                else {
                    newstr.append(i);
                }
            }
        }
        System.out.println(newstr);
    }
}
