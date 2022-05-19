package inheritance1;
class a{
	public void print_a() {
		System.out.println("sha");
	}
}

class b extends a{
	public void print_b() {
		System.out.println("rah");
	}
}

class c extends a{
	public void print_c() {
		System.out.println("shahid");
	}
}

class d extends a{
	public void print_d() {
		System.out.println("shahi");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		b obj_s =  new b();
		obj_s.print_a();
		obj_s.print_b();
		
		c obj_f =  new c();
		obj_f.print_a();
		obj_f.print_c();
		obj_s.print_b();
		
		d obj_c =  new d();
		obj_c.print_a();
		obj_c.print_d();
		obj_s.print_b();
		obj_f.print_c();

	}

}
