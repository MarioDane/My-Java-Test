public class constr {
    public static void main(String[] args) {
    int[] no = new int[] { 501, 101, 204, 102, 334 }; // ����ѧ������
    String[] names = new String[] { "�ų�", "������", "�����", "�Ϻ�ϼ", "����" }; // ������������
    String[] classes = new String[] { "��ѧ", "����", "��ѧ", "Ӣ��", "Ӣ��" }; // ����γ�����
    System.out.println("���ο���ѧ����Ϣ���£�");
    // ѭ���������飬�����ַ���
    for (int i = 0; i < no.length; i++) {
        System.out.println("ѧ�ţ�" + no[i] + "|������" + names[i] + "|�γ̣�" + classes[i] + "|�༶��" + "������������");
    }
}
    
}