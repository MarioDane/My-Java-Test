import java.util.Scanner;

public class equalstr {
    public static void main(String[] args) {
        String sys = "ѧ����Ϣ����";
        System.out.println("��ӭ���롶" + sys + "��ϵͳ");
        System.out.println("������һ������Ա���룺");
        Scanner input = new Scanner(System.in);
        String pass = input.next(); // ��������
        System.out.println("�ظ�����Ա���룺");
        input = new Scanner(System.in);
        String pass1 = input.next(); // ȷ������
        if (pass.equals(pass1)) { // �Ƚ���������
            System.out.println("����Ч�����μ����룺" + pass);
        } else {
            System.out.println("�������벻һ�£����������á�");
        }//ʹ��equalsIgnoreCase�����������Բ����ִ�Сд�Ƚ��ַ���
    
  
}


}