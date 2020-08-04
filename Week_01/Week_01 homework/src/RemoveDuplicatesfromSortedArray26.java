public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int[] test = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(test);
        for (int i = 0; i < length; i++) {
            System.out.println(test[i]);
        }
    }
    //方法一：
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    //方法二:
}

