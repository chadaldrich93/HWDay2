class SumCommandLine{
	
	public static void main(String[] args) {
		System.out.println(4);
		int sum = 0;
		int temp;
		for (String s : args) {
			temp = Integer.parseInt(s);
			sum += temp;
		}
		System.out.println(sum);
		System.out.println(4);
	}
}