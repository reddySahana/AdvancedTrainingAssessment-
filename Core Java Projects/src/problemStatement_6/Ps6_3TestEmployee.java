package problemStatement_6;

import java.util.Vector;

public class Ps6_3TestEmployee {
	
	private static final Ps6_3Employee[] v = null;
	public static void main(String[] args) {
		Vector<Ps6_3Employee> v= addInput();
		display(v);
	}
	private static Vector<Ps6_3Employee> addInput() {
		
		return null;
	}
	private static void display(Vector<Ps6_3Employee> v) {
		
	}
	
	public static Vector<Ps6_3Employee> main1() {
		
		Ps6_3Employee e1=new Ps6_3Employee(101, "nagesh", "ganesh");
		Ps6_3Employee e2=new Ps6_3Employee(102, "nichitha", "gopal");
		Ps6_3Employee e3=new Ps6_3Employee(103, "mallesh", "mahesh");
		Vector<Ps6_3Employee> v=new Vector<Ps6_3Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
		
	}
	public static void main2(String[] args) {
		
		for (Ps6_3Employee e :v) {
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			
		}
	}
}
