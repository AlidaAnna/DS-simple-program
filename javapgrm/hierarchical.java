 class parent
 {
    void display()
    {
System.out.println("I am parent");
    }
 }
 class child1 extends parent
 {
    void display1()
    {
        System.out.println("I am child1");  
    }
 }
 class child2 extends parent
 {
    void display2()
    {
        System.out.println("I am child2");  
    }
 }
 

class hierarchical
{
    public static void main(String args[])
    {
     child1 c1=new child1();
     c1.display();
     c1.display1();
     child2 c2=new child2();
     c2.display();
     c2.display2();
    }
}
