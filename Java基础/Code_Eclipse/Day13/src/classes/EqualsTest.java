package classes;
/*
 * == 与 equals 的区别
 * 
 * 一、回顾 == 的使用：
 * 1. 可以使用在基本数据类型变量和引用数据类型变量中
 * 2. 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
 *    如果比较的是引用数据类型变量：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体
 * 	补充： == 符号使用时，必须保证符号左右两边的变量类型一致。
 * 
 * 二、equals()方法的使用：
 * 1. 是一个方法，而非运算符
 * 2. 只能适用于引用数据类型
 * 3. Object类中equals()的定义：
 *    public boolean equals(Object obj) {
 *    		return (this == obj);
 *    }
 *    说明：Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体
 * 
 * 4. 像String、Date、File、包装类等都重写了Object类中的equals()方法。重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
 *    
 * 5. 通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们
 *    就需要对Object类中的equals()进行重写.
 *    重写的原则：比较两个对象的实体内容是否相同.
 */
public class EqualsTest {
	public static void main(String[] args) {
		
		//基本数据类型
		int i = 10;
		double j = 10.0;
		System.out.println(i == j);//true
		//引用数据类型
		Customer c1 = new Customer("Tom", 21);
		Customer c2 = new Customer("Tom", 21);
		String name1 = new String("张志秋");
		String name2 = new String("张志秋");
		System.out.println(name1 == name2);//false
		
		//******************************************************
		System.out.println(c1.equals(c2));//flase
		System.out.println(name1.equals(name2));//true
		
	}
}
