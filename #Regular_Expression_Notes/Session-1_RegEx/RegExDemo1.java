import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExDemo1{
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("ab");

        Matcher m = pt.matcher("abbabbba");

        int cnt = 0;
        while(m.find()){
            cnt++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
        System.out.println("The total no. of occurrences: " + cnt);
    }
}