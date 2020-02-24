class Test {
	public static boolean test() {
		int[] array = new int[]{1,2,3,3,4};
		int duplicate = FindDuplicate.findDuplicate(array);
		if(duplicate == 3) {
			return true;
		}
		return false;
	}
}