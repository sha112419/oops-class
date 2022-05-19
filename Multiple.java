package inheritance1;

interface one{
	public void print_geek();
		
}
interface two{
	public void print_for();
}

interface three extends one,two {
	public void print_geek();
}

class shahid implements three{
	public void  print_geek() {
		System.out.println("sha");
	}
	public  void print_for() {System.out.println("rah");}
}
public class Multiple {

	public static void main(String[] args) {
		shahid s = new shahid();
		s.print_geek();
		s.print_for();
		s.print_geek();

	}

}
