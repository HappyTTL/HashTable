import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Tingting on 10/4/16.
 */
public class HashTable {
    /**
     * Intersection of Two Arrays: Given two arrays, write a function to compute their intersection.

     Example:
     Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

     Note:
     Each element in the result must be unique.
     The result can be in any order.
     Show Tags
     Show Similar Problems

     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[0];
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                set.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int i = 0;
        int[] finalResult = new int[result.size()];
        for (int x : result) {
            finalResult[i++] = x;
        }
        return finalResult;
    }

    /**
     * Two Sum II -Input array is sorted: Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

     The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

     You may assume that each input would have exactly one solution.

     Input: numbers={2, 7, 11, 15}, target=9
     Output: index1=1, index2=2
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(numbers[i])) {
                map.put(target - numbers[i], i + 1);
            } else {
                result[0] = map.get(numbers[i]);
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}
