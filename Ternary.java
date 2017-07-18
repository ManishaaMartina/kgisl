public class Ternary
{
    public static void main(String[] args)
    {
        Integer i=42.5;
        String s=(i<42)?"manis":(i>50)?"kishore":"no1";
        s+=(i<41)?"hai":(i<45)?(i>50):" be hapiee";
        System.out.println(s);
    }
}