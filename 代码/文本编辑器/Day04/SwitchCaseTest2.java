import java.util.Scanner;

class SwitchCaseTest2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		System.out.print("�������·ݣ�(0-12)");
		int season = scan.nextInt();
		switch (season){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
		}
		*/

		System.out.print("������2019����·ݣ�");
		int month = scan.nextInt();
		System.out.print("������2019������ڣ�");
		int day = scan.nextInt();

		int sumDays = 0;//����һ������������������

		/*
		//��ʽһ������
		if(month == 1){
			sumDays = day;
		}else if(month == 2){
			sumDays = 31 + day;
		}else if(month == 3){
			sumDays = 31 + 28 + day;
		}else if(month == 4){
			sumDays = 31 + 28 + 31 + day;
		}
		//...
		else{
			//sumDays = ..... + day;
		}
		*/

		/*
		//��ʽ��������
		switch(month){
		case 1:
			sumDays = day;
			break;
		case 2:
			sumDays = 31 + day;
			break;
		case 3:
			sumDays = 31 + 28 + day;
			break;
		...
		}
		*/

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
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}

		System.out.println("2019��" + month + "��" + day + "���ǵ���ĵ�" + sumDays + "��");
		
	}
}
