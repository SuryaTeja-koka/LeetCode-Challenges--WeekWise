class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int even[]=new int[A.length/2];
        int odd[]=new int[A.length/2];
        int e=0,o=0;
        for(int i : A)
        {
            if(i%2==0)
            {
                even[e]=i;
                e++;
            }
            else
            {
                odd[o]=i;
                o++;
            }
        }
        e=0;
        o=0;
        for(int i=0;i<A.length;i++)
        {
            if(i%2==0)
            {
                A[i]=even[e];
                e++;
            }
            else
            {
                A[i]=odd[o];
                o++;
            }
        }
        return A;
    }
}
