package A03integerdemo;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
        //jdk5以前获取对象的区别
        //底层原理：
        //因为在实际开发中，-128~127之间的数据，用的比较多
        //如果每次使用new对象，太浪费内存了
        //所以，提前把这个范围之内的每一个数据都创建好对象
        //如果要用到了不会创建新的，而是返回已经创建好的对象
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        System.out.println(i1 == i2); //true

        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println(i3 == i4); //false

        //因为看到了New关键字，在Java中，每一次new都是创建了一个新的对象
        //所以下面的两个对象都是new出来，地址值不一样
        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        System.out.println(i5 == i6); //false

        Integer i7 = new Integer(128);
        Integer i8 = new Integer(128);
        System.out.println(i7 == i8); //false
    }
}
