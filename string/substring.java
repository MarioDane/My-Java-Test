public class substring {
    
    public static void main(String[] args) {
    // ����洢���ű��������
    String[] news = new String[] { "��ο�������Java", "����������Java�е������", "ѧϰJava��ʮ���Ҹ�", "������֪����java�����̼��ɴ�ȫ", "Java�������ȫ" }; 
    String title = "************* �����б� *************";
    System.out.println(title.substring(10, 30));
    System.out.println("----------------------------------------------");
    /*
     * ѭ�����������ȡ����Ԫ���е�ǰ10���ַ���Ϊ�б�չʾ
     */
    for (int i = 0; i < news.length; i++) {
        // �ж�����Ԫ�صĳ����Ƿ����10��������ڣ����ȡ������ȫ����ʾ
        if (news[i].length() > 10) {
            System.out.println(news[i].substring(0, 10) + "��");
        } else {
            System.out.println(news[i]);
        }
    }
}
    
}
