class rem_dup_r_arr {

    public int removeDuplicates(int[] num) {
        if(num.length==0) return 0;
        int k=1;
        for(int i=1;i<num.length;i++){
            if(num[i]!=num[i-1]){
            num[k]=num[i];
            k++;
        }
        }
        
        return k;
    }
    
    public static void main(String[] args){
        rem_dup_r_arr s = new rem_dup_r_arr();
        int[] nums = {1,1,2,2,3,4,4,5};
        int length = s.removeDuplicates(nums);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
