package com.itheima.a03mygenericsDemo1;

public class GenericsDemo2 {
    public static void main(String[] args) {


        MyArrayList<String> arr = new MyArrayList<>();

        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");


        System.out.println(arr.toString());

    }
}
