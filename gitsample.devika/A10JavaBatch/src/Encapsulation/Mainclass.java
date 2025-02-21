package Encapsulation;

class SBI
{
	private int mpin=1234;
	public int getpin()
	{
		return mpin;
	}
	public void setpin(int mpin)
	{
		this.mpin=mpin;
	}
	}
public class Mainclass
{
	public static void main(String[] args)
	{
		SBI s=new SBI();
		   System.out.println(s.getpin());
		   s.setpin(7800);
		   System.out.println(s.getpin());
		}	
	} 
	
  

