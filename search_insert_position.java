public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        search_insert_position obj = new search_insert_position();
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        int result = obj.searchInsert(nums, target);
        System.out.println(result);
    }
}
