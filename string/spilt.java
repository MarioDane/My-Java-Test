public class spilt {
    public static void main(String[] args) {
        String Colors = "Red,Black,White,Yellow,Blue";
        String[] arr1 = Colors.split(","); // 不限制元素个数，直到全部分割为止
        String[] arr2 = Colors.split(",", 3); // 限制元素个数为3,分割两个分割符后不再分割
        System.out.println("所有颜色为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("前三个颜色为：");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }
}
