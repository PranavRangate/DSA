public class rem_ele {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String[] args){
        rem_ele s = new rem_ele();
        int[] nums={3,2,2,3};
        int length=s.removeElement(nums,3);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
