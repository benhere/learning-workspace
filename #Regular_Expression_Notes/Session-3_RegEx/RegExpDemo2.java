import java.util.regex.Pattern;

public class RegExpDemo2 
{
    public static void main(String[] args) 
    {
        Pattern pt = Pattern.compile("[.]");
        String[] s = pt.split("www.naukari.com");

        for(String st : s){
            System.out.println(st);
        }
    }
}
