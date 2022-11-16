import java.util.Scanner;

public class Question 
{
	Scanner sc = new Scanner(System.in);
	
	int qno;
	String ques,opt[]=new String[4];
	int yourans,rightans;
	
	void readQuestion()
	{
		System.out.println("enter the question number ");
		qno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter question ");
		ques = sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter "+opt.length+" options ");
		for(int i =0; i<opt.length;i++)
		{
			opt[i] = sc.nextLine();
		}
		
		System.out.println("enter right answer ");
		rightans = sc.nextInt();
	}
	
	void showQuestion()
	{
		System.out.println("Q" + qno + "\t" + ques);
		for(int i =0;i<opt.length;i++)
		{
			System.out.println((i+1)+"\t"+opt[i]);
		}
		System.out.println("enter your answer ");
		yourans = sc.nextInt();
	}
	
	int getRightAns()
	{
		return rightans;
	}
	
	int getYourAns()
	{
		return yourans;
	}
	
}
