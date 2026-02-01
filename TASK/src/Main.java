import java.util.*;

public class Main {

    public static List<List<Integer>> DifferenceBetweenTwoList(int[] nums1, int[] nums2) {

        Set<Integer> FirstList = new HashSet<>();
        Set<Integer> SecandList = new HashSet<>();
        List<Integer> FirstListdiff = new ArrayList<>();
        List<Integer> SecandListdiff = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {//1 2 3 3
            FirstList.add(nums1[i]); // 1 2 3
        }

        for (int i = 0; i < nums2.length; i++) {  // 1 1 2 2
            SecandList.add(nums2[i]);//1 2
        }


        for (int i = 0; i < nums1.length; i++) { //1 2 3 3
            if (!SecandList.contains(nums1[i])//1 x   2 x  3
                    && !FirstListdiff.contains(nums1[i])) {
                FirstListdiff.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) { //1 1 2 2
            if (!FirstList.contains(nums2[i])//1 x  2x
                    && !SecandListdiff.contains(nums2[i])) {
                SecandListdiff.add(nums2[i]);
            }
        }

        List<List<Integer>> result = new ArrayList<>();// [[],[]]
        result.add(FirstListdiff);
        result.add(SecandListdiff);

        return result;
    }

    public static void main(String[] args) {

        int[] List1 = {1, 2, 3,3};
        int[] List2 = {1,1,2,2};

        List<List<Integer>> result = DifferenceBetweenTwoList(List1, List2);

        System.out.println(result);
    }
}
