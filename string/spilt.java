public class spilt {
    public static void main(String[] args) {
        String Colors = "Red,Black,White,Yellow,Blue";
        String[] arr1 = Colors.split(","); // ������Ԫ�ظ�����ֱ��ȫ���ָ�Ϊֹ
        String[] arr2 = Colors.split(",", 3); // ����Ԫ�ظ���Ϊ3,�ָ������ָ�����ٷָ�
        System.out.println("������ɫΪ��");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("ǰ������ɫΪ��");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }
}
