import java.util.regex.Pattern;

class RegExpDemo1
{
    public static void main(String[] args) 
    {
        Pattern pt = Pattern.compile("\\s");
        String[] s = pt.split("Java is one of the best language");

        for(String st : s){
            System.out.println(st);
        }
    }
}