public class maxTriple {

  public int maxTriple(int[] nums) {
    int middle = nums.length / 2;
    int len = nums.length;
    if (nums[0] > nums[middle] && nums[0] > nums[len - 1]) {
      return nums[0];
    } else if (nums[0] < nums[middle] && nums[middle] > nums[len - 1]) {
      return nums[middle];
    } else {
      return nums[len - 1];
    }
  }
/* more concise but harder to read
return Math.max(nums[0], Math.max(nums[nums.length /2], nums[nums.length -1]));
*/

}
