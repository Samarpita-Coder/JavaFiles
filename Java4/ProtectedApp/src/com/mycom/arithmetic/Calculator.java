package com.mycom.arithmetic;

import com.mycom.calculation.Addition;

public class Calculator extends Addition {
	public void showSum() {
		int sum=addNum(20,30);
		System.out.println(sum);
	}
}
