public class Practice01MathIterative implements Practice01Math{
	//factorial seq checker 
	public int fact(int n) throws Exception{
		if (n<0)
		{
			throw new Exception("Negative number");
		}

		if (n == 0){
			return 1;
		} else {
			int facto = 1;
			for (int i = 1; i <= n; i++){
				facto *= i;
			}
			return facto;
		}
	}

	//fib seq checker
	public int fib(int n) throws Exception{
		if (n<0)
		{
			throw new Exception("Negative number");
		}
		if (n == 0 || n == 1){
			return n;
		} else {
			int prev = 1;
			int curr = 1;
			for (int x=2; x < n; x++){
				int next = curr + prev;
				prev = curr;
				curr = next;
			}
			return curr;
		}
	}
}