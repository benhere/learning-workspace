import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExpDemo2
{
    public static void main(String[] args) {
        Pattern pt = Pattern.compile(".");
        Matcher m = pt.matcher("a7b k@9z");
        
        while(m.find())
        {
            System.out.println(m.start()+"..."+m.group());
        }
    }
}