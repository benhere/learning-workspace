import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ReadMobileNumber_File
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("output.txt");

        Pattern pt = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        String line = br.readLine();

        while(line != null)
        {
            Matcher m = pt.matcher(line);
            while(m.find()){
                pw.println(m.group());
            }
            line = br.readLine();
        }
        pw.flush();
    }
}