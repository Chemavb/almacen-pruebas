package com.iprsw.cajondesastre.exceptions1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomThrowableGenerator {

	public void generate() throws Throwable{
		int numeroAleatorio = (int)(Math.random()*10);
		switch(numeroAleatorio){
		
			case 0: 
				throw new ArithmeticException();
			case 1:
				throw new Exception();
			case 2:
				throw new RuntimeException();
			case 3:
				throw new IOException();
			case 4:
				throw new FileNotFoundException();
			case 5:
				throw new Error();
			case 6:
				throw new StackOverflowError();
			case 7:
				throw new Throwable();
			case 8:
				throw new IndexOutOfBoundsException();
			case 9:
				throw new ArrayIndexOutOfBoundsException();
			case 10:
				throw new StringIndexOutOfBoundsException();
			default:					
		}
	}
}
