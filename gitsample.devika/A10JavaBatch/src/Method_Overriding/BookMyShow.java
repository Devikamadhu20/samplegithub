package Method_Overriding;

class BookMyShow_V1
{
 void Book()	
 {
	 System.out.println("can book movie tickets");
 }
}
class BookMyShow_V2 extends BookMyShow_V1
{
 void Book()	
 {
	 System.out.println("can book movie tickets, concerts,events");
 }
}
class BookMyShow_V3 extends BookMyShow_V2
{
 void Book()	
 {
	 System.out.println("can book movie tickets,concerts,places, events, sports");
 }
}
 class BookMyShow
{

	public static void main(String[] args)
	{
		BookMyShow_V3 b=new BookMyShow_V3();
		b.Book();
	}

}
