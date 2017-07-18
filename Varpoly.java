
    class A
    {
        double val=10;
    }
    class B extends A
    {
        int val=20;
    }
    class Varpoly{
        public static void main(String arg[])
        {
            A a=new A();
            System.out.println(a.val);
           B aa=new B();
            System.out.println(aa.val);
        } 
    }
