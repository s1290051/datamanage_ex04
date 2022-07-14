import java.util.Random;
import java.util.Scanner;


public class ex04
{

    public static void main(String[] args)
    {
	String[] head = {"Heads","Tails"};

	Random ran = new Random();


	Scanner sc = new Scanner(System.in);
	
	int value;
	value = 0;


	System.out.println("Who are you?");
	System.out.print(">");


	String NAME = sc.nextLine();


	System.out.println("Hello, " + NAME + "!");

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

<<<<<<< HEAD




	System.out.println("Heads:" + value + ", Tails:" + number);

	if(value > number)
	    {System.out.println(NAME + " won!");}

	if(value < number)
	    {System.out.println(NAME + " lost.");}}}
=======
	System.out.println("Heads:" + value + ", Tails:" + number);

if(value > number)
    {System.out.println(NAME + " won!");}

if(value < number)
    {System.out.println(NAME + " lost!");}}}
>>>>>>> user_name
