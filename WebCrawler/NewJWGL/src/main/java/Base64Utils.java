public class Base64Utils {

//    private static String codeStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxzy0123456789+/";
//    private static char[] code = codeStr.toCharArray();
//
//    public static String encode(String str) {
//        if(str == null) {
//            throw new NullPointerException();
//        }
//        StringBuffer result = new StringBuffer();
//        String binStr = str2Bin(str); // 字符串转为二进制
//        // 6bit 为一个单元，需要补0的位数
//        int tail = binStr.length() % 6;
//        if(tail != 0) {   //最后剩2bit，需要补4位，剩4位需要补2bit
//            tail = 6 - tail;
//        }
//        for(int i = 0; i < tail; i++) {
//            binStr += "0";
//        }
//        for(int i = 0; i < binStr.length() / 6; i++) {
//            int beginIndex = i * 6;
//            String s = binStr.substring(beginIndex, beginIndex+6);
//            int codePoint = Integer.valueOf(s, 2); // 二进制转十进制
//            char c = code[codePoint];   // 对应的字符
//            result.append(c);
//        }
//        int groupNum = binStr.length() / 6;  // 需要补=的位数6bit为一组
//        if((groupNum % 4) != 0) {
//            tail = 4 - groupNum % 4;
//        }
//        for(int i = 0; i < tail; i++) {
//            result.append("=");
//        }
//        return result.toString();
//    }
//
//    public static String decode(String str) {
//        if(str == null) {
//            throw new NullPointerException();
//        }
//        StringBuffer result =  new StringBuffer();
//        int index = str.indexOf("="); // 去除末尾的'='
//        if (index >= 0) {
//            str = str.substring(0, index);
//        }
//        // base64字符串转换为二进制
//        String binStr = base64Str2Bin(str);
//        // 将二进制按8bit一组还原成原字符
//        for(int i = 0; i < binStr.length() / 8; i++) {
//            int beginIndex = i * 8;
//            String s = binStr.substring(beginIndex, beginIndex+8);
//            String c = bin2Str(s);
//            result.append(c);
//        }
//        return result.toString();
//    }
//
//    private static String str2Bin(String str) {
//        StringBuffer sb = new StringBuffer();
//        char[] c = str.toCharArray();
//        for(int i = 0; i < c.length; i++) {
//            String s = Integer.toBinaryString(c[i]);// 将每个字符转换为二进制
//            int len = 8 - s.length();// 需要补0的长度
//            for(int j = 0; j < len; j++) {
//                s = "0" + s;
//            }
//            sb.append(s);
//        }
//        return sb.toString();
//    }
//
//    public static String base64Str2Bin(String str) {
//        int end = str.indexOf("="); // 去除末尾的'='
//        if (end >= 0) {
//            str = str.substring(0, end);
//        }
//        StringBuffer sb = new StringBuffer();
//        char[] c = str.toCharArray();
//        for(int i = 0; i < c.length; i++) {
//            int index = codeStr.indexOf(c[i]); // 将每个字符转换为二进制
//            String s = Integer.toBinaryString(index);
//            int len = 6 - s.length(); // 将每个字符转换为二进制
//            for(int j = 0; j < len; j++)
//                s = "0" + s;
//            sb.append(s);
//        }
//        return sb.toString();
//    }
//
//    private static String bin2Str(String binStr) {
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < binStr.length() / 8; i++) {
//            int beginIndex = i * 8;
//            String s = binStr.substring(beginIndex, beginIndex+8);
//            int codePoint = Integer.valueOf(s, 2); // 二进制转十进制
//            char c = Character.toChars(codePoint)[0];   // 对应的字符
//            sb.append(c);
//        }
//        return sb.toString();
//    }
}