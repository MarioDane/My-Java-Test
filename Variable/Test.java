public class Test {
    public static void main(String[] args) {
        // ������Ķ���
        DataClass dc = new DataClass();
        // ������.����������ʵ��������ȫ�ֱ�����
        System.out.println(dc.name);
        System.out.println(dc.age);

        // ������.���������þ�̬�������������
        System.out.println(dc.website);
        System.out.println(dc.URL);

        // ����.���������þ�̬�������������
        System.out.println(DataClass.website);
        System.out.println(DataClass.URL);
    }
}