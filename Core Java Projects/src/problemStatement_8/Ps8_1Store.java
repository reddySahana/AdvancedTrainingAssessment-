package problemStatement_8;

import java.lang.Runnable;
public class Ps8_1Store {

	private int x;

	public Ps8_1Store(int X) { x=X; }

	public int GetX() { return(x); }



	public Ps8_1Store(Ps8_1Store s) { this.x = s.GetX(); }

	}



	class Print implements Runnable

	{

	private Ps8_1Store storage;



	Print(Ps8_1Store s) { storage = new Ps8_1Store(s); }



	public void run()

	{

	System.out.println(storage.GetX());

	}



	}



	class Counte implements Runnable

	{

	private int N;



	public Counte(int n) { N=n; }

	public int GetN() { return(N); }



	public void run()

	{

	for (int iLoop=1; iLoop<=N; iLoop++)

	{

	Ps8_1Store storage = new Ps8_1Store(iLoop);

	Print print = new Print(storage);

	Thread.yield();

	print.run();

	}



	}



	}
