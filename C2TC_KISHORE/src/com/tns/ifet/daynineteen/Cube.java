//Program to demonstrate Functional Interface

package com.tns.ifet.daynineteen;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}