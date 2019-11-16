package parameter_constructor;

/**
 * Simple Java program for Parameter Constructor
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Ex1 
{
	int r;
	String n;
	Ex1(int r,String n)
	{
		this.r=r;
		this.n=n;
	}
	void display()
	{
		System.out.println(r+" "+n);
	}

	public static void main(String[] args) 
	{
	Ex1 e=new Ex1(1,"GK");
	Ex1 ee=new Ex1(2,"HK");
	e.display();
	ee.display();

	}

}
