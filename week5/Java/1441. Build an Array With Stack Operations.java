class Solution {
 public List<String> buildArray(int[] target, int n) {
	List<String> res = new ArrayList<>();
       // stack vaadatam laedu -- using arraylist -- because it is easy in an arraylist
      // teller antae aaekadaunnamou chaeppatam kosam -- target array lopala
     
	int teller = 0;
	for (int i = 1; i < n+1; i++) {
		if (target[teller] != i){
			res.add("Push");
			res.add("Pop");
		}
		else if (target[teller] == i){
			res.add("Push");
			teller ++;
		}
		if (teller == target.length){
			break;
		}
	}
	return res;
}
      
 
}

