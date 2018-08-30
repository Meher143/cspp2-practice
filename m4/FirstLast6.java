import java.util.Scanner;
class FirstLast6{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arra1[];
	arra1 = new int[size];
	for(int i = 0;i<arra1.length;i++){
		arra1[i] = sc.nextInt();
	}
		if(arra1[0]==6 || arra1[arra1.length - 1] == 6){
			System.out.println("True");
		}else{
		    System.out.println("False");
	   }
    }
}



