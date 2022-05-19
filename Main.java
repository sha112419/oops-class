package array;
// Java program to illustrate the
// concept of single inheritance
class one {
	public void print_geek()
	{
		System.out.println("hello");
	}
}

class two extends one {
	public void print_for() { System.out.println("iam"); }
}
// Driver class
class three extends two{
	public void print_if() {
		System.out.println("sha");
	}
}
public class Main {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_geek();
		g.print_for();
		g.print_geek();
		g.print_for();
		g.print_for();
		g.print_if();
		
		
		
	}
}

