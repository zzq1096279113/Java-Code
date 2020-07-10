package classes1;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;


/**
 * Lambda表达式的使用
 *
 * 1. 举例： (o1,o2) -> Integer.compare(o1,o2);
 *
 * 2. 格式：
 *      -> :lambda 操作符或箭头操作符
 *      ->左边：lambda形参列表（其实就是接口中的抽象方法的形参列表）
 *      ->右边：lambda体（其实就是重写的抽象方法的方法体）
 *
 * 3. Lambda表达式的使用：（分为6种情况介绍）
 *      ->左边：lambda形参列表的参数类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
 *      ->右边：lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句），省略这一对{}和return关键字
 *
 * 4. Lambda表达式的本质：作为函数式接口的实例
 *
 * 5. 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口。
 *    我们可以在一个接口上使用 @FunctionalInterface注解，这样做可以检查它是否是一个函数式接口。
 *
 * 6. 所以以前用匿名实现类表示的现在都可以用Lambda表达式来写。
 *
 * @author zzq
 * @creat 2020-06-07 9:10
 */
public class LambdaTest1 {

    //语法格式一：无参，无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("***********************");
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }



    //语法格式二：需要一个参数，但是没有返回值。
    @Test
    public void test2() {
        Consumer<String> c1 = new Consumer<>(){

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        c1.accept("星期五");
        System.out.println("***********************");
        //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
        //语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
        //语法格式六：Lambda体若只有一条语句时，return与大括号若有，都可以省略
        Consumer<String> c2 = s -> System.out.println(s);
        c2.accept("星期日");
    }



    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test3() {
        Comparator<Integer> c1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = c1.compare(21, 12);
        System.out.println(compare1);
        System.out.println("***********************");
        Comparator<Integer> c2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1,o2);
        };
        int compare2 = c2.compare(12, 21);
        System.out.println(compare2);
    }

}
