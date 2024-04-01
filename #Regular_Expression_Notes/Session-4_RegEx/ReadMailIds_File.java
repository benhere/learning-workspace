import java.io.*;
import java.util.regex.*;

public class ReadMailIds_File 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("output1.txt");

        Pattern pt = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

        BufferedReader br = new BufferedReader(new FileReader("input1.txt"));

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
