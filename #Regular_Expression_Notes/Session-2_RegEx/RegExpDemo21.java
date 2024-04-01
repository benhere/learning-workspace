import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo21 
{

    public static void main(String[] args) {
        Pattern pt = Pattern.compile("a?");
        Matcher m = pt.matcher("abaabaaab");
        
        while(m.find())
        {
            System.out.println(m.start()+"..."+m.group());
        }
    }
}
