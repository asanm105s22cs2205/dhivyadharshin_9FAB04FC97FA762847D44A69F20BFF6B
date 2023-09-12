class NumberPrinter extends Thread{
private int start;
private int end;
public NumberPrinter(int  start,int  end)
{
this.start=start;
this.end=end;
}
public void run()
{
for(int i=start;i<=end;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
} }}
public class Main2
{
public static void main(String[]args)
{
NumberPrinter thread1=new 
NumberPrinter(1,5);
NumberPrinter thread2=new 
NumberPrinter(6,10);
thread1.start();
thread2.start();
try
{
thread1.join();
thread2.join();
}catch (InterruptedException e){
e.printStackTrace();
}
System.out.println("Both threads have finished.");
}
}
