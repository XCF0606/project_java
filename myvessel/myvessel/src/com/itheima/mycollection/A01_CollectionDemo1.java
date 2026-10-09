package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
        public boolean add(E e)                 添加
        public void clear()                     清空
        public boolean remove(E e)              删除
        public boolean contains(Object obj)     判断是否包含
        public boolean isEmpty()                判断是否为空
        public int size()                       集合长度


        注意点：
        Collection是一个接口，我们不能直接创建出它的对象.
        只能创建它实现类的对象
        实现类：ArrayList
         */

        Collection<String> coll = new ArrayList<>();
        //1.添加数据
        //细节1：如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列是允许元素重复的
        //细节2：如果我们要往Set系列集合中添加数据，如果要添加的元素不存在，那么返回true，表示添加成功
        //                                  如果存在，方法返回false，表示添加失败
        //                                  因为Set系列的集合不允许元素重复

        //add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        coll.clear();
        System.out.println(coll);

        //3.remove删除
        //注意：因为Collection里面定义的是共性的方法，所以remove不能通过索引进行删除，只能通过元素进行删除
        //成功返回true  失败返回flase
        //如果删除的元素不存在，就会删除失败
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        System.out.println(coll.remove("ccc"));
        System.out.println(coll);

        //4.判断元素是否包含contains
        //细节：底层就是调用equals方法进行判断是否存在的
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javaBean中，一定要重写equals方法

        Collection<Student> stu = new ArrayList<>();

        Student s1 = new Student("张三", 24);
        Student s2 = new Student("李四", 26);
        Student s3 = new Student("王五", 27);

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        //因为contains方法在底层依赖的是equals方法判断对象是一致的
        //如果存的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，而Object中的equals方法判断是依据地址值进行判断的
        Student s4 = new Student("张三", 24);
        System.out.println(stu.contains(s4));

    }
}
