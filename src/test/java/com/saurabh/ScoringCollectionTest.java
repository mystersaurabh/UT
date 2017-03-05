package com.saurabh;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.Test;

public class ScoringCollectionTest {

	@Test
	public void testAdd() {
		
		//arrange
		ScoringCollection collection=new ScoringCollection();
		collection.add(()->8);
		collection.add(()->8);
		
		//act
		int numberOfElements=collection.getScoreList().size();
		
		//assert
		assertThat(numberOfElements,equalTo(2));
		assertNotSame(numberOfElements, 3);
	}

	@Test
	public void testGetMeanScore() {
		//arrange
		ScoringCollection collection = new ScoringCollection();
		collection.add(()->7);
		collection.add(()->5);
		
		//act
		double actual=collection.getMeanScore();
		
		//assert
		assertThat(actual, is(6d));
		assertThat(actual,not(7d));
		assertThat(actual, equalTo(6d));
		
	}

}
