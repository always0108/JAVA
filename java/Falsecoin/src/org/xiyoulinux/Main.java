package org.xiyoulinux;

import java.util.Scanner;
//一个袋子里有若干硬币，其中一枚是假币，并且和假币和真币一模一样，目前只知道假币币真币轻一点。
public class Main {

    public static int Falsecoin(double[] coin, int low, int high) {

        double left = 0, right = 0;
        if (low + 1 == high) {
            if (coin[low] < coin[high]) {
                return low + 1;
            } else if(coin[low] > coin[high]){
                return high + 1;
            }else{
                return  -1;
            }
        } else {
            if ((high - low + 1) % 2 == 0) { //数组中为偶数个数据
                for (int i = low; i <= (high + low) / 2; i++) {
                    left += coin[i];
                }
                for (int i = (high + low) / 2 + 1; i <= high; i++) {
                    right += coin[i];
                }

                if (left < right) {
                    return Falsecoin(coin, low, (high + low) / 2);//假币在左边
                } else if (left > right) {
                    return Falsecoin(coin, (high + low) / 2 + 1, high);//假币在右边
                } else {
                    return -1;//不存在假币
                }
            } else {                //数组中为奇数个数据
                for (int i = low; i < (high + low) / 2; i++) {
                    left += coin[i];
                }
                for (int i = (high + low) / 2 + 1; i <= high; i++) {
                    right += coin[i];
                }

                if (left < right) {
                    return Falsecoin(coin, low, (high + low) / 2);//假币在左边
                } else if (left > right) {
                    return Falsecoin(coin, (high + low) / 2 + 1, high);//假币在右边
                } else {
                    if (coin[(high + low) / 2] < coin[low])//假币在中间
                        return (high + low) / 2 + 1;
                    else
                        return -1;//假币不存在
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] coin = new double[30];
        System.out.println("分治算法求假币问题: ");
        System.out.println("请输入硬币总的个数: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("请输入所有硬币权值: ");
        for ( int i = 0; i < n; i++ ) {
            coin[i] = in.nextDouble();
        }
        int position = Main.Falsecoin(coin, 0, n-1);
        if (position > 0 && position < n)
            System.out.println("假币在 " + position + "个位置 ");
        else
            System.out.println("不存在假币");
    }
}
