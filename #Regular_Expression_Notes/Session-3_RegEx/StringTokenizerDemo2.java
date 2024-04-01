import java.util.StringTokenizer;

public class StringTokenizerDemo2 
{
    public static void main(String[] args) 
    {
        StringTokenizer st = new StringTokenizer("04-12-2022", "-");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
