package ej08;

public class Ejercicio08 {

	public static void main(String[] args) {
		long f;
		try {
			f = fibo(40);
			System.out.println(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static long fibo(long num) throws Exception {
		long n;
		
		if (num < 1) {
			throw new Exception("No puede ser menor que 0");
		} else if (num == 1 || num == 2) {
			n = 1;
		} else {
			// 5 seria n = fibo(4) + fibo(3)
			n = fibo(num - 1) + fibo(num - 2);
		}
		
		return n;
	}

}
