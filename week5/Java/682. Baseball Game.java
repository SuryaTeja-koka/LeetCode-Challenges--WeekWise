class Solution {
    public int calPoints(String[] ops) {
        int i=0;
        int[] res = new int[ops.length];
        int ans = 0;
        for(int j=0;j<ops.length;j++,i++){
          String value = ops[j];
          if("C".equals(value)){
            Integer op1 = Integer.valueOf(res[i-1]);
            i-=2;
          }else if("D".equals(value)){
            Integer op1 = Integer.valueOf(res[i-1]);
            res[i] = op1*2;
          }else if("+".equals(value)){
            Integer op1 = Integer.valueOf(res[i-1]);
            Integer op2 = Integer.valueOf(res[i-2]);
            res[i] = op1+op2;
          }else
            res[i] = Integer.valueOf(value); 
        }
      
        while(i--!=0)
          ans+=res[i];
      return ans;
    }
}
