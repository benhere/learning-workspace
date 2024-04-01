public class SplitDemo 
{
    public static void main(String[] args) 
    {
        String str = "Paper has more patience than people";
        String[] s1 = str.split("\\s");

        for(String s:s1){
            System.out.println(s);
        }
    }
}
