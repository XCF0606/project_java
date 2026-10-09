package com.itheima;

public class LambdaDemo1 {
    public static void main(String[] args) {
        /*
        Lambda表达式的注意点：
         ● Lambda表达式可以用来简化匿名内部类的书写
         ● Lambda表达式只能简化函数式接口的匿名内部类的写法
         ● 函数式接口：
            有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@Functionalinterface注解（进行验证是否是函数式接口）
         */

//        method(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("我正在游泳，减大肥");
//            }
//        });

        //Lambda表达式
        method(()->{
                System.out.println("我正在游泳");
            }
        );


    }


    public static void method(Swim s){
        s.swimming();
    }


}

@FunctionalInterface
interface Swim{
    public abstract void swimming();
}
