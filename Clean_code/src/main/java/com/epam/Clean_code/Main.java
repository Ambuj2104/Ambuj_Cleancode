package com.epam.Clean_code;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		float principal,rate,time;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Enter principle:");
		bw.flush();
		principal = Float.parseFloat(br.readLine());
		bw.write("Enter rate:");
		bw.flush();
		rate = Float.parseFloat(br.readLine());
		bw.write("Enter time:");
		bw.flush();
		time = Float.parseFloat(br.readLine());
		Interest ob1=new Interest();
		bw.write("Simple Interest=" +ob1.simple_interest(principal,rate,time)+ "\n");
		bw.write("Compound Interest:" +ob1.compound_interest(principal,rate,time)+ "\n");
		bw.flush();
	}
}		



