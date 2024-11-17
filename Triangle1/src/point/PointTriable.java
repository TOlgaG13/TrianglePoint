package point;
import java.util.Scanner;
public class PointTriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input x");
	    double x=sc.nextDouble();
	    System.out.println("input y");
	    double y=sc.nextDouble();
		
		double a=(0 - x) * (4 - 0) - (4 - 0) * (0 - y);
		double b=(4 - x) * (1 - 4) - (6 - 4) * (4 - y);
		double c=(6 - x) * (0 - 1) - (0 - 6) * (1 - y);
		
		if(((a < 0) && (b < 0) && (c < 0)||((a>0)&&(b>0)&&(c>0)))){
			System.out.println("Point inside triable");
		
		}else if(((a == 0) || (b == 0) || (c == 0))) {
			System.out.println("Point on the side of the triangle");
		}
		else {
			System.out.println("point outside triable");
		}
	
		}
	}


