import java.util.Scanner;
class Average{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arra1[];
		double sum = 0;
		arra1 = new int[size];
		for(int i = 0; i<arra1.length;i++){
			arra1[i] = sc.nextInt();
		}
		for(int j = 0; j<arra1.length;j++){
			sum  = sum + arra1[j];
		}
			double Average = sum/arra1.length;
			System.out.print("The average of the elemnts is :"+Average);
		}

		
	}
