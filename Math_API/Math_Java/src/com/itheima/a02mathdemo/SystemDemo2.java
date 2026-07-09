package com.itheima.a02mathdemo;

public class SystemDemo2 {
    public static void main(String[] args) {
        //public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)  数组拷贝
        //细节：
        //1.如果数组源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3.如果数组源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型

        Student s1 = new Student("迪迦", 3000);
        Student s2 = new Student("郭德纲", 56);
        Student s3 = new Student("加坦杰厄", 3100);

        Student[] arr1 = {s1, s2, s3};
        Student[] arr2 = new Student[3];
        //把arr1中对象的地址赋值给arr2中

        //正常赋值
        System.arraycopy(arr1, 0, arr2, 0, 3);
        for (int i = 0; i < arr2.length; i++) {
            Student stu = arr2[i];
            System.out.println(stu.getName() + " " + stu.getAge());
        }

        System.out.println("-------------------------------------------------------");

        //如果接受的是父类呢
        Person[] arr4 = new Person[3];
        System.arraycopy(arr1, 0, arr4, 0, 3);
        for (int i = 0; i < arr4.length; i++) {
            Student stu = (Student) arr4[i];    // 需要强转
            System.out.println(stu.getName() + " " + stu.getAge());
        }




    }
}


class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }



}
