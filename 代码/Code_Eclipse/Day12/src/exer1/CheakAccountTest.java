package exer1;
/*
 * 写一个用户程序测试CheckAccount类。
 * 在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款3000元，并打印账户余额和可透支额。 
 */
public class CheakAccountTest {
	public static void main(String[] args) {
		CheckAccount acct = new CheckAccount(112, 20000, 0.045, 5000);
		
		acct.withdraw(5000);
		System.out.println("账户余额：" + acct.getBalance() + "， 可透支额：" + acct.getOverdraft());
		acct.withdraw(18000);
		System.out.println("账户余额：" + acct.getBalance() + "， 可透支额：" + acct.getOverdraft());
		acct.withdraw(3000);
		System.out.println("账户余额：" + acct.getBalance() + "， 可透支额：" + acct.getOverdraft());
	}
}
