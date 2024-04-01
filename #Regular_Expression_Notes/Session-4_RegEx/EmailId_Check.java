import java.util.Scanner;
import java.util.regex.*;

public class EmailId_Check 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String mailId = sc.nextLine();

        Pattern pt = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

        Matcher m = pt.matcher(mailId);

        if(m.find() && m.group().equals(mailId)) 
        {
            System.out.println("Valid Mail Id");
        }
        else{
            System.out.println("Invalid Mail Id!!!");
        }
        sc.close();        
    }
}
