class ArrayMaxValue{
	
	public static void main(String[] args) {
		int[][] source = { {1},{2} };
		int max = maxOf2DArray(source);
		int[] maxLocation = findLocationOfMax(source, max);
		System.out.println(max);
		System.out.println(maxLocation);
	}
	
	public static int maxOf2DArray(int[][] source) {
		int max = source[0][0];
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source[0].length; j++) {
				if (source[i][j] > max)
					max = source[i][j];
			}
		}
		return max;
	}
	
	public static int[] findLocationOfMax(int[][]source, int maxValue) {
		int[] location = {0,0};
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source[0].length; j++) {
				if (source[i][j] == maxValue) {
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}
}