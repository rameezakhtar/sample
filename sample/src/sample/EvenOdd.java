package sample;

public class EvenOdd implements Runnable {

	private PrintEvenOdd print;
	private int size;
	private boolean isEven;
	public EvenOdd(PrintEvenOdd print, int size, boolean isEven) {
		super();
		this.print = print;
		this.size = size;
		this.isEven = isEven;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int number=isEven?2:1;
		
		if(number<=size)
		{
			if(isEven)
			{
				print.printEven(number);
			}
			if(isEven)
			{
				print.printOdd(number);
			}
		}
		number=number+2;
		
	}

}
