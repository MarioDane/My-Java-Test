public class lupcase {
    public static void main(String[] args) {
        String en = "The Day You Went Away"; // ����ԭʼ�ַ���
        System.out.println("ԭʼ�ַ�����" + en);
        System.out.println("ʹ�� toLowerCase() ����֮��Ϊ��" + en.toLowerCase());
        System.out.println("ʹ�� toUpperCase() ����֮��Ϊ��" + en.toUpperCase());

        en = "  sun sun ��̫����ԲԲ���� SKY ��  "; // ����ԭʼ�ַ���
        System.out.println("ԭʼ�ַ�����" + en); 
        System.out.println("ʹ�� toLowerCase() ����֮��Ϊ��" + en.toLowerCase());
        System.out.println("ʹ�� toUpperCase() ����֮��Ϊ��" + en.toUpperCase());
        System.out.println("ʹ�� trim() ����֮��Ϊ��"+en.trim());//trim()ֻ��ȥ���ַ�����ǰ��İ�ǿո�
        System.out.println(en.substring(5));//substring(int beginIndex) �˷�ʽ������ȡ������λ�ÿ�ʼ����β�����ַ�������
        System.out.println(en.substring(5, 15));//�˷����е� beginIndex ��ʾ��ȡ����ʼ��������ȡ���ַ����а�����ʼ������Ӧ���ַ���endIndex ��ʾ������������ȡ���ַ����в���������������Ӧ���ַ�

        en = "select id,name,sex,address,birthday from students";
        System.out.println("ԭʼ�ַ�����" + en); // ����ԭʼ�ַ���
        System.out.println("ʹ�� toLowerCase() ����֮��Ϊ��" + en.toLowerCase());
        System.out.println("ʹ�� toUpperCase() ����֮��Ϊ��" + en.toUpperCase());
    }
}
