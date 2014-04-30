package jmockit;

import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.junit.Test;

public class Sample01Test {

	/** モック */
	@Mocked
	private Sample01 mockSample01;

	/**
	 * {@link jp.co.net.genesis.sample.Sample01#doTest(java.lang.String[])}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testDoTest() {
		new NonStrictExpectations() {
			{
				mockSample01.doTest();
				result = "モック";
			}
		};
		System.out.println(mockSample01.doTest());

	}

}