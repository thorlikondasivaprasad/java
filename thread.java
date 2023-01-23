class thread
{
public static void main(String args[]) 
{
Thread t = Thread.currentThread();
System.out.println("Current thread: " + t);
// change the name of the thread
t.setName("SIVAPRASAD");
System.out.println("After name change: " + t);
try
{
for(int n=10;n>0;n--) 
{
System.out.println(n);
Thread.sleep(100);
}
} 
catch (InterruptedException e) 
{
System.out.println("Main thread interrupted");
}
}
}
