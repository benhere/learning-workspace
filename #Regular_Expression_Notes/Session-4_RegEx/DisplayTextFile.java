import java.io.*;
import java.util.regex.*;

public class DisplayTextFile 
{
    public static void main(String[] args)
    {
        Pattern pt = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt");

        File f = new File("C://Users//NARMISHR//Desktop");

        String[] fnames = f.list();

        int cnt=0;
        for(String str:fnames){
            Matcher m = pt.matcher(str);

            if(m.find() && m.group().equals(str)){
                cnt++;
                System.out.println(str);
            }
        }
        System.out.println("Total number of text file in given folder:"+cnt);
    }
}
