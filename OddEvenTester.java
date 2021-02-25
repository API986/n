package com.tester;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.codes.*;
class OddEvenTester {
	OddEven obj = new OddEven();
	@Test
	void test1() {
		Assertions.assertTrue(obj.fun(2));
		System.out.println("success");
	}
	@Test
	void test2() {
		Assertions.assertFalse(obj.fun(7));
		System.out.println("success");
	}
}
  