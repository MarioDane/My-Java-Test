public class replace {
    public static void main(String[] args) {
        String words = "hello java,hello php";
        System.out.println("ԭʼ�ַ�����'" + words + "'");
        System.out.println("replace(\"l\",\"D\")�����" + words.replace("l", "D"));
        System.out.println("replace(\"hello\",\"���\")�����" + words.replace("hello", "��� "));
        words = "hr's dog";
        System.out.println("ԭʼ�ַ�����'" + words + "'");
        System.out.println("replace(\"r's\",\"is\")�����" + words.replace("r's", "is"));
        words = "hello java��hello php";
        String newStr1 = words.replaceFirst("h*o", "��� ");
        System.out.println(newStr1); // �������� java,hello php
        words = "hello java��hello php";
        String newStr2 = words.replaceAll("hel??o", "��� ");
        System.out.println(newStr2); // �������� java,��� php

    }
}
