package text_05;
import java.util.Scanner;

public class demo_01 {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("输入成绩");
		  int mark = sc.nextInt();
		  if(mark >= 90)
		  {
		   System.out.println("A级");
		  }
		  else if (mark >= 80)
		  {
		   System.out.println("B级");
		  } 
		  else if (mark >= 70)
		  {
		   System.out.println("C级");
		  }
		  else if (mark >= 60)
		  {
		   System.out.println("D级");
		  }
		  else if (mark>=0) 
		  {
		   System.out.println("E级");
		  }
		  else
		  {
		   System.out.println("不合格");
		  } 
		 }

		}