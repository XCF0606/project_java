package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
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

        Iterator<String> it = coll.iterator();

        Iterator<String> it2 = coll.iterator();
        //遍历coll所有元素
        while (it2.hasNext()){
            //System.out.println(iterator.next());
            String str = it2.next();
            if ("bbb".equals(str)){
                it2.remove();
            }

            //NoSuchElementException 为何报错：因为你轮到最后一个元素时，虽然判断有元素存在，但是执行到第二个next()会报找不到元素
            //如果想要删除的话，使用remove()方法
            //System.out.println(iterator.next());
        }
        System.out.println(coll);

    }
}
