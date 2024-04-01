import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberCheckCmd 
{
    public static void main(String[] args) 
    {
        Pattern pt = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        Matcher m = pt.matcher(args[0]);

        if(m.find() && m.group().equals(args[0])) 
        {
            System.out.println("Valid Mobile Number");
        }
        else{
            System.out.println("Invalid Mobile Number!!!");
        }
    }
}
