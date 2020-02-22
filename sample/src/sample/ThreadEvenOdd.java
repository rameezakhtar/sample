package sample;

public class ThreadEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEvenOdd print = new PrintEvenOdd();
		
		Thread t=new Thread(new EvenOdd(print, 10, true));
		Thread t2=new Thread(new EvenOdd(print, 10, false));
		
		t.start();
		t2.start();


	}

}
