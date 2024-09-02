package org.Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Sample {
	
	@Test
	public void strictLevelComparison() {
		String expecteddata="raja";
		String actualData="Raja";
		
		Assert.assertEquals(actualData, expecteddata);
		System.out.println("strick comaprson passed!!");

	}
	
	@Test
	public void containsLevelComparison() {
		String expecteddata="raja";
		String actualData="maharaja";
		
		Assert.assertTrue(actualData.contains(expecteddata));
		System.out.println("contains Level comparison passed!!");
		
	}
}
