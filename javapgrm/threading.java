class even extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i=i+2)
        {
            System.out.println(i+"From first thread");
            try{
                Thread.sleep(2000);
            }
            catch( Exception e){

            }
        }
    }
}
class odd extends Thread
{
public void run()
{
    for(int i=1;i<10;i=i+2)
    {
        System.out.println(i+"second");
    try{
        Thread.sleep(2000);
    }
    catch(Exception e)
    {
    }
}
}
}

public class threading 
{
    public static void main(String args[])
    {
        even e=new even();
        e.start();
        odd o=new odd();
        o.start();
    }
}



/*class even extends Thread{
    public void run()
    {
        for(int i=0;i<10;i=i+2)
        {
            System.out.println(i);
            try{Thread.sleep(2000);
            }
            catch(Exception e){
    
            }
        }
    }
}
class odd extends Thread{
    public void run()
    {
        for(int i=1;i<10;i=i+2)
        {
            System.out.println(i);
            try{Thread.sleep(2000);
            }
            catch(Exception e){
    
            }
        }
    }
}

public class threading {
    public static void main(String args[])
    {
        odd o=new odd();
        even e=new even();
        o.start();
        e.start();
    }
}
    */