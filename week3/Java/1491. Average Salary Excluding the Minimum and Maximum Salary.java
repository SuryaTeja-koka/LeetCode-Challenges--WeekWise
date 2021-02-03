class Solution {
public double average(int[] salary) {
Arrays.sort(salary);
double s=0;
for(int i=1;i<salary.length-1;i++)
s=s+salary[i];
return (s/(salary.length-2));
}
}
