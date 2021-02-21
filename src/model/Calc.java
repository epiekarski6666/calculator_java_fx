package model;

public class Calc implements CalcInterface {
	
    @Override
    public double calc(double firstNumber, double secondNumber, String sign ) {
    	switch (sign) {
    	case "+":
    		return firstNumber + secondNumber;
    	case "-":
    		return firstNumber - secondNumber;
    	case "x":
    		return firstNumber * secondNumber;
    	case "÷":
    		if(secondNumber == 0)
    			return 0;
    		return firstNumber / secondNumber;
    		
    	default:
    			return 0;
    	}
    }
}
