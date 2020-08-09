public class TwoSum {
    public static void main(String[] args) {
        int[] testArr = {2,7,11,15};
        int target = 9;
        int[] res = {0,0};
        res = twoSum(testArr,target);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    //解法一：
    public static int[] twoSum(int[] nums, int target) {
        int[] res = {0,0};
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
    //解法二：
}
