package com.itheima.a04objectDemo1;

import java.util.StringJoiner;

//克隆细节：

//Cloneable
/**
 * 如果一个接口里面没有抽象方法
 * 表示当前接口是一个标记性接口
 * 现在Cloneable表示一旦实现了，那么当前类的对象就可以被克隆
 * 如果没有实现，当前类的对象就不能克隆
 */
public class User implements Cloneable {
    private int id; //游戏角色
    private String user;   //用户名
    private String password; //密码
    private String path; //游戏图片
    private int[] data; //游戏进度


    public User() {
    }

    public User(int id, String user, String password, String path, int[] data) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{角色编号 = " + id + ", 用户名 = " + user + ", 密码 = " + password + ", 图片 = " + path + ", 游戏进度 = " + arrToString() + "}";
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 调用父类方法自动完成克隆,浅克隆，直接重新方法即可

        //深克隆，先把被克隆对象中的数组获取出来
        int[] data = this.data;
        //再创建新数组
        int[] newData = new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        User u = (User) super.clone();
        //因为父类中的方法是浅克隆，替换克隆出来对象中的数组地址值
        //u.data 我当前调用的是u也就是浅克隆的数据，u中的data数组地址值还是浅克隆地址值，还没有变成新的，所以
        //我需要将新的数组地址值赋值给浅克隆中的数组地址
        u.data = newData;
        return u;
        /**
         * 劣势：无法进行二维数组的克隆，很麻烦
         * 这里推荐其他大佬写的工具类 gson-2.6.2.jar
         */

    }
}
