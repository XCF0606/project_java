package com.xcf.a02mymaptest;

import java.util.*;

public class A02_MapTest2 {
    public static void main(String[] args) {
        //需求：
        /*
        某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D），每个学生只能选择一个景点
        请统计出最终那个景点想去的人数最多
         */

        //1.创建四个景点
        String[] arr = {"A", "B", "C", "D"};

        //2.利用随机数模拟80个学生的投票，并把投票结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            //2.1随机遍历出所有选项
            int i1 = r.nextInt(arr.length);
            list.add(arr[i1]);
        }

        //3.使用HashMap统计每个景区投票的次数
        HashMap<String, Integer> hsp = new HashMap<>();

        //3.1获取list集合中所有的景区名字
        for (String JQname : list) {
            //其实第一次不会走这里，因为我还没有添加数据，景区名字、票数都没有
            //第一次走的是else
            if (hsp.containsKey(JQname)){
                //3.2 如果景区存在，那么我直接获取票数即可
                //这里的Values就是获取出来的值
                Integer Values = hsp.get(JQname);
                //票数 + 1
                Values++;
                //添加完成后，再把票数和名字重新添加回去
                hsp.put(JQname, Values);
            }else{
                //3.3如果景区不存在，我先添加
                //因为是不存在，所以是第一次有人投票，需要把景区名字与1票通通写进去
                hsp.put(JQname, 1);
            }
        }
        System.out.println(hsp);

        //4.设置最大值
        //为什么设置0 因为这四个景区很可能一票后获取不到，所以这四个景区没有参考价值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hsp.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            //获取到Value值
            Integer value = entry.getValue();
            if (value > max){
                //大于我就写进去，老夫只跟强者合作
                max = value;
            }
        }
        System.out.println(max);

        //5.最后再对比下有没有票数相同的景区
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value == max){
                System.out.println(entry.getKey());
            }
        }




    }
}
