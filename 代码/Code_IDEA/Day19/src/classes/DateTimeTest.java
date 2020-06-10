package classes;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 *JDK 8之前日期和时间的API测试
 *
 * @author zzq
 * @creat 2020-05-26 10:17
 */
public class DateTimeTest {

    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();//返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        System.out.println(time);

    }


    /*
    java.util.Date类
           |---java.sql.Date类

    1.两个构造器的使用
        >构造器一：Date()：创建一个对应当前时间的Date对象
        >构造器二：创建指定毫秒数的Date对象
    2.两个方法的使用
        >toString():显示当前的年、月、日、时、分、秒
        >getTime():获取当前Date对象对应的毫秒数。（时间戳）
    3. java.sql.Date对应着数据库中的日期类型的变量
        >如何实例化
        >如何将java.util.Date对象转换为java.sql.Date对象
     */
    @Test
    public void test2(){
        Date date1 = new Date();//构造器一:创建一个对应当前时间的Date对象
        System.out.println(date1.toString());//toString():显示当前的年、月、日、时、分、秒
        System.out.println(date1.getTime());//获取当前Date对象对应的毫秒数  1590460110967

        Date date2 = new Date(1590460110967L);//构造器二：创建指定毫秒数的Date对象
        System.out.println(date2);

        java.sql.Date date3 = new java.sql.Date(1590460110960L);//创建java.sql.Date对象
        System.out.println(date3.toString());

        //如何将java.util.Date对象转换为java.sql.Date对象\
        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
        System.out.println(date5);

    }
}
