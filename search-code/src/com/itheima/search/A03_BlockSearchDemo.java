package com.itheima.search;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        /*

        分块查找
        核心思想：
            块内无序，块间有序
        实现步骤：
            1.创建数组blockArr存放每一个块对象的信息
            2.先查找blockArr确定要查找的数据在那一块
            3.再单独便利这一块数据即可

            首先：将一堆数据有序分开，且每一块中的最大值不能大于第二个块中的最小值

         */

        int[] arr = {16, 5, 9, 12,
                21, 18, 32, 56, 26, 45, 34,
                78, 85, 94, 89, 103};



        //将arr数组中的17个数据分组，进行存放
        Block b1 = new Block(16, 0, 3);
        Block b2 = new Block(56, 4, 10);
        Block b3 = new Block(103, 11, 16);

        //将三组数组存放在新数组中，形成二维数组
        Block[] blockArr = {b1, b2, b3};

        //要查询的数据
        int number = 78;

        System.out.println(getIndex(blockArr, arr, number));


    }
    //获取在这个块中的那个索引位置
    public static int getIndex(Block[] blocks, int[] arr, int number){
        int blockIndex = getBlockIndex(blocks, number);
        int startIndex = blocks[blockIndex].getStartIndex();//起始索引
        int endIndex = blocks[blockIndex].getEndIndex();//结束索引

        //便利arr数组
        for (int i = startIndex; i <= endIndex; i++) {
            //与number进行比较，计算出number的位置
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }




    //查询number在哪一个块中
    public static int getBlockIndex(Block[] blockArr, int number){
        //便利blockArr数组，将Number与数组中的每一个max对比大小，进而获取到number在哪一个块中
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}


// 创建一个新类，用来获取块中的最大值，起始索引，结束索引
class Block{
    private int max;            //最大值
    private int startIndex;     //起始索引
    private int endIndex;       //结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }


    //生成javaBean

}
