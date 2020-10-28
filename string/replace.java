public class replace {
    public static void main(String[] args) {
        String words = "hello java,hello php";
        System.out.println("原始字符串是'" + words + "'");
        System.out.println("replace(\"l\",\"D\")结果：" + words.replace("l", "D"));
        System.out.println("replace(\"hello\",\"你好\")结果：" + words.replace("hello", "你好 "));
        words = "hr's dog";
        System.out.println("原始字符串是'" + words + "'");
        System.out.println("replace(\"r's\",\"is\")结果：" + words.replace("r's", "is"));
        words = "hello java，hello php";
        String newStr1 = words.replaceFirst("h*o", "你好 ");
        System.out.println(newStr1); // 输出：你好 java,hello php
        words = "hello java，hello php";
        String newStr2 = words.replaceAll("hel??o", "你好 ");
        System.out.println(newStr2); // 输出：你好 java,你好 php

    }
}
