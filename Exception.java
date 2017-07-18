import java.util.*;
import java.lang.*;
class Exception
{
    public static void main(String args[])
    {
        try{
        int a[]=new int[10];
        a[11]=10/7;
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
     }
    }