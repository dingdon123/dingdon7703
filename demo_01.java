package text_05;
import java.util.Scanner;

public class demo_01 {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("����ɼ�");
		  int mark = sc.nextInt();
		  if(mark >= 90)
		  {
		   System.out.println("A��");
		  }
		  else if (mark >= 80)
		  {
		   System.out.println("B��");
		  } 
		  else if (mark >= 70)
		  {
		   System.out.println("C��");
		  }
		  else if (mark >= 60)
		  {
		   System.out.println("D��");
		  }
		  else if (mark>=0) 
		  {
		   System.out.println("E��");
		  }
		  else
		  {
		   System.out.println("���ϸ�");
		  } 
		 }

		}