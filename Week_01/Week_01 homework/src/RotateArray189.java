public class RotateArray189 {
    //方法一：
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
    //方法二：
    
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7};
        rotate(test,3);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}

