class Example
{
	protected int width;
	protected int height;
	public void setValue(int w,int h)
	{
		width=w;
		height=h;
	}
}
class Square extends Shape
{
	public int getArea()
	{
		return(width*height);
	}
}
public class SimpleInher
{
	public static void main(String args[])
	{
		System.out.println("Demonstrate of Simple Inheritance");
		Square s=new Square();
		s.setValue(10,20);
		System.out.println("Area of square is:" + s.getArea());
	}
}