public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
	 List<Integer> list=new ArrayList<Integer>();
	 List<ArrayList<Integer>> finalresult = new ArrayList<ArrayList<Integer>>();

	 for(int i=0;i<inputArray.size();i++) {
	 	list.clear();
	 	int temp=targetSum-inputArray.get(i);
	 	if(inputArray.contains(temp)) {
	 		list.add(temp);
	 		list.add(inputArray.get(i));
	 		finalresult.add(list);
	 	}

	 }
	 return finalresult;
}
