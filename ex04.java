import java.util.Random;

public class ex04
{

    public static void main(String[] args)
    {
	String[] head = {"Heads","Tails"};

	Random ran = new Random();
	
	int value;
	value = 0;


	System.out.println("Tossing a coin...");
	int x;
	
	
	for(x = 0;x < 3;++x)
	    {
	int y;
	y = x+1;
	String status;
	status = head[ran.nextInt(2)];
		    
		    System.out.println("Round" + y + ":" + status);

		if(status == head[0])value++;

	    }



	int number;
	number = 3-value;

	System.out.println("Heads:" + value + ", Tails:" + number);}}
