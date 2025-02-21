package Method_Overloading;

public class Whatsapp
{
  void send(String e, int f)
  {
	  System.out.println(e+" "+f);
  }
  void send(int e, String d)
  {
	  System.out.println(e+" "+d);
  }
  void send(String b)
  {
	  System.out.println(b);
  }
  void send(int a)
  {
	  System.out.println(a);
  }
	public static void main(String[] args) 
	{
	 Whatsapp w=new Whatsapp();
	 w.send(4);
	 w.send("Hi");
	 w.send(17,"Hello");
	 w.send("Bye",48);
	}

}
