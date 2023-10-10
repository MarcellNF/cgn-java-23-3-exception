package org.example;

public class Math {
	public int division(int a, int b) throws Exception {
		/*if(b == 0){
			throw new ArithmeticException("Division durch 0 nicht möglich");
		}*/
		/*try{
			System.out.println(a / b);
		} catch (ArithmeticException exception){
			System.out.println("Division durch 0 nicht möglich");
		} catch (Exception exception){
			System.out.println(exception.getMessage());
		}*/
		return a / b;
	}
}
