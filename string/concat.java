public class concat {
    public static void main(String[] args) {
        String info = "�������塢";
        info = info.concat("���μǡ�");
        info = info.concat("ˮ䰴���");
        info = info.concat("��¥��");
        System.out.println(info);
        String cn = "�й�";
        System.out.println(cn.concat("����").concat("������").concat("����԰"));
        sanguo();
    }

    public static void sanguo() {
        String book = "��������"; // �ַ���
        int price = 59; // ���ͱ���
        float readtime = 2.5f; // �����ͱ���
        System.out.println("������һ��ͼ�飬�����ǣ�" + book + "\n�۸��ǣ�" + price + "\n��ÿ���Ķ�" + readtime + "Сʱ");
    }

}
