import java.util.Scanner;

public class equalstr {
    public static void main(String[] args) {
        String sys = "学生信息管理";
        System.out.println("欢迎进入《" + sys + "》系统");
        System.out.println("请设置一个管理员密码：");
        Scanner input = new Scanner(System.in);
        String pass = input.next(); // 设置密码
        System.out.println("重复管理员密码：");
        input = new Scanner(System.in);
        String pass1 = input.next(); // 确认密码
        if (pass.equals(pass1)) { // 比较两个密码
            System.out.println("已生效，请牢记密码：" + pass);
        } else {
            System.out.println("两次密码不一致，请重新设置。");
        }//使用equalsIgnoreCase（）方法可以不区分大小写比较字符串
    
  
}


}
