public class replaceall {
    public static void main(String[] args) {
        // ����ԭʼ�ַ���
        String intro = "����ʱ�����죬����ʱ�����졣����ȥ����ˣ�©���ڼ�д��ҵ��" + "������ҵʱ���䡱д 5 �У���ѧʹ�� 10 ҳ��";
        // ���ı��е�����"ʱ"��"ʹ"���滻Ϊ"��"
        String newStrFirst = intro.replaceAll("[ʱʹ]", "��");
        // ���ı��е�����"����"��Ϊ"����"
        String newStrSecond = newStrFirst.replaceAll("����", "����");
        // ���ı��е�����"©��"��Ϊ"����"
        String newStrThird = newStrSecond.replaceAll("©��", "����");
        // ���ı��е�һ�γ��ֵ�"��"��Ϊ"��"
        String newStrFourth = newStrThird.replaceFirst("[��]", "��");
        // ��������ַ���
        System.out.println(newStrFourth);
    }

}
