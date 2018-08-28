import java.util.Scanner;

class AreaOfCircle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		double a = areaOfCircle(radius);
		System.out.println(a);

	}
	public static double areaOfCircle(int radius){
		return pi()*radius*radius;
		//System.out.println(a);
	}
	public static double pi(){
		return 3.14;
	}
}