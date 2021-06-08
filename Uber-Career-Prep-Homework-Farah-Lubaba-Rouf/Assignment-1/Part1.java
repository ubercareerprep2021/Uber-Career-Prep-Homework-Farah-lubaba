public boolean isStringPermutation(String s1, String s2) {
	Map<Character,Integer> numbers=new HashMap<Character, Integer>();
	if(s1.length()!=s2.length()) {
		return false;
	} 
	for(int i=0;i<s1.length;i++) {
		if(numbers.containsKey(s1.charAt(i)){
			numbers.put(s1.charAt(i),numbers.get(s1.charAt(i))+1); 
		}
		else {
			numbers.put(s1.charAt(i),1);
		}
	}
	for(int i=0;i<s2.length;i++) {
		if(numbers.containsKey(s2.charAt(i)){
			numbers.put(s2.charAt(i),numbers.get(s1.charAt(i))-1); 
			if(numbers.get(s2.charAt(i))==0) {
				numbers.remove(s2.charAt(i));
			}
		}
		else {
			return false;
		}
	}
	return true;
}