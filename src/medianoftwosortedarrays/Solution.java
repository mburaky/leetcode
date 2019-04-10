package medianoftwosortedarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Double> numList = new ArrayList();
        for(int i = 0; i < nums1.length; i++){
            numList.add(Double.valueOf(nums1[i]));
        }
        for(int i = 0; i < nums2.length; i++){
            numList.add(Double.valueOf(nums2[i]));
        }
        Collections.sort(numList);
        int listSize = numList.size();
        double result;
        if(listSize % 2 == 0){
            int i = listSize / 2;
            result = (numList.get(i-1) + numList.get(i)) / 2;
        }else{
            result = numList.get((listSize / 2));
        }
        return result;
    }
}
