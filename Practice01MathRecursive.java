public class Practice01MathRecursive implements Practice01Math{
	//factorial seq checker 
	public int fact(int n) throws Exception{
		if (n<0)
		{
			throw new Exception("Negative number");
		}
		if (n == 0){
			return 1;
		} else {
			return n*fact(n-1);	
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
			return fib(n-1) + fib(n-2);	
		}
	}
}