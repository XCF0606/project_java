package com.itheima.a05test;

public abstract class Cat extends Animal {
    // 1.继承抽象类，重写里面所有的抽象方法
    // 2.本身Cat也是一个抽象的，让Cat的子类再实现抽象方法

    /**
     *  因为猫的两个子类中eat的方法提还是不一样的。
     *  方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
     *  方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
     *  方法体不一样，没有共性
     */

}
