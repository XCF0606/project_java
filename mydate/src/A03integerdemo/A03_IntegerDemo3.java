package A03integerdemo;

public class A03_IntegerDemo3 {
    public static void main(String[] args) {
        //在JDK5的时候提出了一个机制：自动装箱和自动拆箱
        //自动装箱：把基本数据类型会自动变成其对应的包装类
        //自动拆箱：把包装类自动的变成其对象的基本数据类型

        //在底层，此时还是会调用valueof得到一个Integer对象，只不过这个动作不需要我们自己去操作了
        Integer i = 10;

        Integer i2 = new Integer(10);

        //自动拆箱操作
        int i3 = i2;

        //在JDK5以后，int和Integer可以看作是同一个东西，因为在内部都可以自动转化

    }
}
