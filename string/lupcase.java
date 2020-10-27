public class lupcase {
    public static void main(String[] args) {
        String en = "The Day You Went Away"; // 定义原始字符串
        System.out.println("原始字符串：" + en);
        System.out.println("使用 toLowerCase() 方法之后为：" + en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为：" + en.toUpperCase());

        en = "  sun sun 是太阳，圆圆挂在 SKY 上  "; // 定义原始字符串
        System.out.println("原始字符串：" + en); 
        System.out.println("使用 toLowerCase() 方法之后为：" + en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为：" + en.toUpperCase());
        System.out.println("使用 trim() 方法之后为："+en.trim());//trim()只能去掉字符串中前后的半角空格
        System.out.println(en.substring(5));//substring(int beginIndex) 此方式用于提取从索引位置开始至结尾处的字符串部分
        System.out.println(en.substring(5, 15));//此方法中的 beginIndex 表示截取的起始索引，截取的字符串中包括起始索引对应的字符；endIndex 表示结束索引，截取的字符串中不包括结束索引对应的字符

        en = "select id,name,sex,address,birthday from students";
        System.out.println("原始字符串：" + en); // 定义原始字符串
        System.out.println("使用 toLowerCase() 方法之后为：" + en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为：" + en.toUpperCase());
    }
}
