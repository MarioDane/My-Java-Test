import java.util.Calendar;
public class calender {public static void main(String[] args) {
    String weekDate = "";
    Calendar calendar = Calendar.getInstance();  // ��ȡ��ǰʱ��
    int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;  // ��ȡ���ڵĵڼ���
    switch (week) {
        case 0:
            weekDate = "������";
            break;
        case 1:
            weekDate = "����һ";
            break;
        case 2:
            weekDate = "���ڶ�";
            break;
        case 3:
            weekDate = "������";
            break;
        case 4:
            weekDate = "������";
            break;
        case 5:
            weekDate = "������";
            break;
        case 6:
            weekDate = "������";
            break;
    }
    System.out.println("������ " + weekDate);
}
    
}
