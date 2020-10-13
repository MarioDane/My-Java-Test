public class Test {
    public static void main(String[] args) {
        // 创建类的对象
        DataClass dc = new DataClass();
        // 对象名.变量名调用实例变量（全局变量）
        System.out.println(dc.name);
        System.out.println(dc.age);

        // 对象名.变量名调用静态变量（类变量）
        System.out.println(dc.website);
        System.out.println(dc.URL);

        // 类名.变量名调用静态变量（类变量）
        System.out.println(DataClass.website);
        System.out.println(DataClass.URL);
    }
}