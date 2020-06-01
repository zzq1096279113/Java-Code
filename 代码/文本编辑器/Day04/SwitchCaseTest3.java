import java.util.Scanner;

class SwitchCaseTest3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	

		System.out.print("��������ݣ�");
		int year = scan.nextInt();
		System.out.print("�������·ݣ�");
		int month = scan.nextInt();
		System.out.print("���������ڣ�");
		int day = scan.nextInt();

		int sumDays = 0;
		
		switch(month){
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			if((year % 4 == 0 && year % 100 != 0 ) ||(year % 400 == 0)){
				sumDays += 29;
			}else{
				sumDays += 28;
			}
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}

		System.out.println(year + "��" + month + "��" + day + "���ǵ���ĵ�" + sumDays + "��");	
	}
}