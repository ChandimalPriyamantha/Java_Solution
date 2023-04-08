import java.util.*;
class Solution {

        public int[] towSum(int[] A, int target){
            int N = A.length;
            int []out = new int[2];

            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<N; i++){
                int b = target - A[i];

                if(map.containsKey(b)){
                    out[0] = Math.min(i, map.get(b));
                    out[1] = Math.max(i, map.get(b));
                    return out;
                }else{
                    map.put(A[i], i);
                }
            }

            return null;
        }

}



