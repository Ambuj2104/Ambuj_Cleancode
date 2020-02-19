package com.epam.Clean_code;
import java.lang.Math;
public class Interest {
	public float simple_interest(float principal,float rate,float time) {
		float si;
		si=(principal*rate*time)/100;
		return si;
	}
	public double compound_interest(double principal,double rate,double time){
		double ci;
		ci=(Math.pow(1+(rate/100),time)-1)*principal;
		return ci;
	}

}
