import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int number1, number2; // ������������������������
        System.out.print("�������һ������(number1)��");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt(); // �����һ����
        System.out.print("������ڶ�������(number2)��");
        input = new Scanner(System.in);
        number2 = input.nextInt(); // ����ڶ�����
        System.out.printf("number1=%d,number2=%d\n", number1, number2); // �����������
        // �ж��û�������������Ƿ����
        if (number1 == number2) {
            System.out.println("number1 �� number2 ��ȡ�");
        }
        // �ж��û���������������Ƿ����
        if (number1 != number2) {
            System.out.println("number1 �� number2 ����ȡ�");
            // �ж��û��������1�Ƿ������2
            if (number1 > number2) {
                System.out.println("number1 ���� number2��");
            }
            // �ж��û��������1�Ƿ�С����2
            if (number1 < number2) {
                System.out.println("number1 С�� number2��");
            }
        }
    }
}
