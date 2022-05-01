package problemStatement_3;

public class Ps3_2Medicine{
	public void displayLabel(){
	System.out.println("Company : Globex Pharma");
	System.out.println("Address : Bangalore");
	}
	}
class Tablet extends Ps3_2Medicine{
	 
public void displayLabel(){
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends Ps3_2Medicine{
	public void displayLabel(){
	System.out.println("Consumption as directed by thephysician");
	}
	}
class Ointment extends Ps3_2Medicine{
	public void displayLabel(){
	System.out.println("for external use only");
}
}