package classes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collections:操作Collection、Map的工具类
 *
 * 面试题：Collection 和 Collections的区别？
 *
 * @author zzq
 * @creat 2020-05-30 9:50
 */
public class CollectionsTest {
    /*
        reverse(List)：反转 List 中元素的顺序
        shuffle(List)：对 List 集合元素进行随机排序
        sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

        Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        Object min(Collection)
        Object min(Collection，Comparator)
        int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        void copy(List dest,List src)：将src中的内容复制到dest中
        boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
    */
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println(list);

        //reverse(List)
        Collections.reverse(list);
        System.out.println(list);

        //shuffle(List)
        Collections.shuffle(list);
        System.out.println(list);

        //sort(List)
        Collections.sort(list);
        System.out.println(list);

        //swap(List，int， int)
        Collections.swap(list,2,3);
        System.out.println(list);

        //int frequency(Collection，Object)
        int frequency = Collections.frequency(list, 765);
        System.out.println(frequency);

        //void copy(List dest,List src)
        //报异常：IndexOutOfBoundsException("Source does not fit in dest")
//        ArrayList arrayList = new ArrayList();
//        Collections.copy(arrayList,list);
//        System.out.println(arrayList);
        List objects = Arrays.asList(new Object[list.size()]);
        Collections.copy(objects,list);

    }



    //Collections类中提供了多个synchronizedXxx()方法，该方法可使将指定集合包装成线程同步的集合，从而解决多线程并发访问集合时的线程安全问题
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);

        List list1 = Collections.synchronizedList(list);////返回的list1即为线程安全的List

    }
}

