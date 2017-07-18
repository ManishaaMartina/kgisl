class Outer
{
    private int num=10;
    public void display1()
    {
         class Inner
    {
        void display()
        {
            System.out.println(" hai nagulan" +num);
        }
    }
    Inner i=new Inner();
    i.display();
        System.out.println(" hai athai");
    }
   
    public static void main(String args[])
    {
        Outer o=new Outer();
     //   Inner i=o.new Inner();
        o.display1();
        //i.display();
    }
}