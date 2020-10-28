public class search {
    public static void main(String[] args) {
        String words = "today,monday,sunday";
        System.out.println("原始字符串是'" + words + "'");
        System.out.println("indexOf(\"day\")结果：" + words.indexOf("day"));
        System.out.println("indexOf(\"day\",5)结果：" + words.indexOf("day", 5));
        System.out.println("indexOf(\"o\")结果：" + words.indexOf("o"));
        System.out.println("indexOf(\"o\",6)结果：" + words.indexOf("o", 6));// 索引从0开始
        System.out.println("lastindexOf(\"day\")结果是：" + words.lastIndexOf("day"));// last不指定索引的情况下默认从右往左查找
        System.out.println(words.charAt(0)); // 结果：t
        System.out.println(words.charAt(1)); // 结果：o   字符串就是字符数组，索引从0开始
    }
}
