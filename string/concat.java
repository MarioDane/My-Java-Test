public class concat {
    public static void main(String[] args) {
        String info = "三国演义、";
        info = info.concat("西游记、");
        info = info.concat("水浒传、");
        info = info.concat("红楼梦");
        System.out.println(info);
        String cn = "中国";
        System.out.println(cn.concat("北京").concat("海淀区").concat("人民公园"));
        sanguo();
    }

    public static void sanguo() {
        String book = "三国演义"; // 字符串
        int price = 59; // 整型变量
        float readtime = 2.5f; // 浮点型变量
        System.out.println("我买了一本图书，名字是：" + book + "\n价格是：" + price + "\n我每天阅读" + readtime + "小时");
    }

}
