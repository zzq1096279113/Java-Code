import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int positiveNum = 0, negativeNum = 0;

		while(true){//for(;;){
			System.out.print("������������");
			int num = scan.nextInt();
			if(num > 0){
				positiveNum++;
			}else if(num < 0){
				negativeNum++;
			}else{
				break;
			}
			System.out.println();
		}
		System.out.println("����������" + positiveNum);
		System.out.println("����������" + negativeNum);

	}
}
