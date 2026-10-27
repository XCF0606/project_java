package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        /*
        Collection系列集合三种通用的遍历方式：
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历


        迭代器遍历相关的三个方法
                Iterator<E> iterator()  ：  获取一个迭代器对象
                boolean hasNext()       ：  判断当前指向的位置是否有元素
                E next()                ：  获取当前指向的元素并移动指针
         */

        //1.
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        Iterator<String> iterator = coll.iterator();
        //遍历coll所有元素
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        //1.当上面 循环结束之后，迭代器的指针已经指向了最后没有元素的位置
        //System.out.println(iterator.next());    //NoSuchElementException

        //2.迭代器遍历完毕，指针不会复位
        //System.out.println(iterator.hasNext()); //NoSuchElementException

        //如果想要第二次遍历集合，只能再获取一个新的迭代器对象
        Iterator<String> iterator1 = coll.iterator();
        while (iterator1.hasNext()){
            String str2 = iterator1.next();
            System.out.println(str2);
        }

    }
}
