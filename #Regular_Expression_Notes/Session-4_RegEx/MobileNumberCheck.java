import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// to check whether given number is a valid mobile number or not
class MobileNumberCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        Pattern pt = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        Matcher m = pt.matcher(number);

        if(m.find() && m.group().equals(number)) 
        {
            System.out.println("Valid Mobile Number");
        }
        else{
            System.out.println("Invalid Mobile Number!!!");
        }
        sc.close();
    }
}