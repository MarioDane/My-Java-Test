public class inttostring {
    public static void main(String[] args) {
        int num = 10;
        // ��һ�ַ�����String.valueOf(i);
        num = 10;
        String str = String.valueOf(num);
        System.out.println("str:" + str);
        // �ڶ��ַ�����Integer.toString(i);
        num = 10;
        String str2 = Integer.toString(num);
        System.out.println("str2:" + str2);
        // �����ַ�����"" + i;
        String str3 = num + "";
        System.out.println("str3:" + str3);
    }
}
