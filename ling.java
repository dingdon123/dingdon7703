package pic;

public class ling {
	public static void main(String[] args) {
		  for (int j = 1; j <= 5; j++) {
		            for (int x = 4; x >= j; x--) {
		                System.out.print("  ");
		            }
		            for (int i = 1; i <= j; i++) {
		                System.out.print("* ");
		            }
		            for (int x =1; x <= j-1;x++) {
		                System.out.print("* ");

		            }
		            System.out.println();
		        }
		        for(int a=1;a<=4;a++){
		            for(int b=1;b<=a;b++){
		                System.out.print("  ");
		            }
		            for(int c=4;c>=a;c--){
		                System.out.print("* ");
		            }
		            for(int c=3;c>=a;c--){
		                System.out.print("* ");
		            }
		            
		            
		            System.out.println();
		        }
		    }
		}