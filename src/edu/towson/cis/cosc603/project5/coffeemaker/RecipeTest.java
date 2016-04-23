package edu.towson.cis.cosc603.project5.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	
	Recipe r;

	@Before
	public void setUp() throws Exception {
		r = new Recipe();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAmtChocolate() {
		assertEquals(r.getAmtChocolate(), 0);
	}

	/**
	 * Set chocolate success
	 */
	@Test
	public void testSetAmtChocolate() {
		r.setAmtChocolate(5);
		assertEquals(r.getAmtChocolate(), 5);
	}
	
	/**
	 * Set chocolate fail
	 */
	@Test
	public void testSetAmtChocolateFail() {
		r.setAmtChocolate(-5);
		assertEquals(r.getAmtChocolate(), 0);
	}

	@Test
	public void testGetAmtCoffee() {
		assertEquals(r.getAmtCoffee(), 0);
	}

	/**
	 * Set coffee success
	 */
	@Test
	public void testSetAmtCoffee() {
		r.setAmtCoffee(5);
		assertEquals(r.getAmtCoffee(), 5);
	}
	
	/**
	 * Set coffee fail
	 */
	@Test
	public void testSetAmtCoffeeFail() {
		r.setAmtCoffee(-5);
		assertEquals(r.getAmtCoffee(), 0);
	}

	@Test
	public void testGetAmtMilk() {
		assertEquals(r.getAmtMilk(),0);
	}

	/**
	 * Set milk success
	 */
	@Test
	public void testSetAmtMilk() {
		r.setAmtMilk(5);
		assertEquals(r.getAmtMilk(), 5);
	}
	
	/**
	 * Set milk fail
	 */
	@Test
	public void testSetAmtMilkFail() {
		r.setAmtMilk(-5);
		assertEquals(r.getAmtMilk(), 0);
	}

	@Test
	public void testGetAmtSugar() {
		assertEquals(r.getAmtSugar(), 0);
	}

	/**
	 * Set sugar success
	 */
	@Test
	public void testSetAmtSugar() {
		r.setAmtSugar(5);
		assertEquals(r.getAmtSugar(), 5);
	}
	
	/**
	 * Set sugar fail
	 */
	@Test
	public void testSetAmtSugarFail() {
		r.setAmtSugar(-5);
		assertEquals(r.getAmtSugar(), 0);
	}

	@Test
	public void testGetName() {
		r.setName("Espresso");
		assertEquals(r.getName(), "Espresso");
	}

	@Test
	public void testSetName() {
		r.setName("Espresso");
		assertEquals(r.getName(), "Espresso");
	}

	@Test
	public void testGetPrice() {
		r.setPrice(50);
		assertEquals(r.getPrice(), 50);
	}

	@Test
	public void testSetPrice() {
		r.setPrice(50);
		assertEquals(r.getPrice(), 50);
	}



}
