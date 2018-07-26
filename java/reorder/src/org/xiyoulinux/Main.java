package org.xiyoulinux;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public void reOrderArray(int[] array) {
        if (array.length == 0) {
            return;
        }

        int begin = 0, from;
        while (begin < array.length) {
            while (begin < array.length && (array[begin] & 0x1) == 1) {
                begin++;
            }
            from = begin + 1;
            while (from < array.length && (array[from] & 0x1) != 1) {
                from++;
            }
            if (from < array.length) {
                int temp = array[from];
                for (int i = from - 1; i >= begin; i--) {
                    array[i + 1] = array[i];
                }
                array[begin++] = temp;
            } else {// 查找失敗
                break;
            }
        }
    }
}

