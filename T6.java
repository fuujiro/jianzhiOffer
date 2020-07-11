public class T6 {
    public class Solution {
        public int minNumberInRotateArray(int [] array) {
            if(array.length==0){
                return 0;
            } else {
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i]<min) {
                        min = array[i];
                    }
                }
                return min;
            }

        }
    }
}
