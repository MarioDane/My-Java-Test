public class integer {
    public static void main(String[] args) {
    String str = "123";
    int n = 0;
    // ��һ��ת��������Integer.parseInt(str)
    n = Integer.parseInt(str);
    System.out.println("Integer.parseInt(str) : " + n);
    // �ڶ���ת��������Integer.valueOf(str).intValue()
    n = 0;
    n = Integer.valueOf(str).intValue();
    System.out.println("Integer.parseInt(str) : " + n);
}

}
