package com.JUnit.util;

public class Math implements add, sub {

	@Override
	public long Add(long... ops) {
		long ret=0;
		for(long operand : ops) {
			ret=+operand;
		}
		return ret;
	}


	@Override
	public long Sub(long... ops) {
		long ret=ops[0];
		for(int aa=1; aa< ops.length ;aa++) {
			ret = ops[aa];
		}
		return 0;
	}
}
