package text_02;

import java.util.Scanner;

public class XH_demo_01 {
	public static void main(String[] args)
	{
		int sum=0;
		int j=0;
		System.out.println("要累加到：");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		while(j<i)
		{
			if(j%2==0)
			sum+=j;
			j++;
		}
		System.out.println("累加和："+sum);
	}

}
