package com.itheima.a07mysetdemo;

//如果集合中存储的是自定义对象，则必须重写compareTo方法
public class Student implements Comparable<Student>{
    //姓名
    private String name;
    //年龄
    private int age;
    //语文成绩
    private int Chinese;
    //数学成绩
    private int math;
    //英语成绩
    private int english;


    public Student() {
    }

    public Student(String name, int age, int Chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    // 获取总成绩
    public int getScore(){
        return this.getChinese() + this.getMath() + this.getEnglish();
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", math = " + math + ", english = " + english + "}";
    }



      /*
        需求：创建5个学生对象
        属性：（姓名、年龄、语文成绩、数学升级、英语成绩）
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文成绩一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英语成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一学生，不存
         */
    @Override
    public int compareTo(Student o) {
        //当前对象的成绩
        int score1 = this.getChinese() + this.getMath() + this.getEnglish();
        //已存在红黑树中的成绩
        int score2 = o.getChinese() + o.getMath() + o.getEnglish();
        int i = score1 - score2;

        //如果总分一样，就按照语文成绩进行排序
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        //如果语文成绩一样，则按照数学成绩进行排序
        i = i == 0 ? this.getMath() - o.getMath() : i;
        //如果数学成绩一样，则按照英语成绩进行排序
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        //如果英语成绩一样，则按照年龄进行排序
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //如果年龄一样，则按照姓名字母进行排序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        //如果年龄都一样，则返回0
        return i;
    }



}