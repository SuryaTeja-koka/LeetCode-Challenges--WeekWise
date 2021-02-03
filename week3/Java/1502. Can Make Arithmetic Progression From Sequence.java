class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int[] surya = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            surya[i] = arr[i];
        }
        Arrays.sort(surya);
        int d = surya[1]-surya[0];
        int d1 = 0;
        for (int i=2;i<arr.length;i++){
            d1=surya[i]-surya[i-1];
            if(d!=d1)
                return false;
        }
        return true;
    }
}

