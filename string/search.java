public class search {
    public static void main(String[] args) {
        String words = "today,monday,sunday";
        System.out.println("ԭʼ�ַ�����'" + words + "'");
        System.out.println("indexOf(\"day\")�����" + words.indexOf("day"));
        System.out.println("indexOf(\"day\",5)�����" + words.indexOf("day", 5));
        System.out.println("indexOf(\"o\")�����" + words.indexOf("o"));
        System.out.println("indexOf(\"o\",6)�����" + words.indexOf("o", 6));// ������0��ʼ
        System.out.println("lastindexOf(\"day\")����ǣ�" + words.lastIndexOf("day"));// last��ָ�������������Ĭ�ϴ����������
        System.out.println(words.charAt(0)); // �����t
        System.out.println(words.charAt(1)); // �����o   �ַ��������ַ����飬������0��ʼ
    }
}
