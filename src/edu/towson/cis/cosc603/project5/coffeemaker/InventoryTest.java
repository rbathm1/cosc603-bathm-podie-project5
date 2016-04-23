package edu.towson.cis.cosc603.project5.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
	
	Inventory i;

	@Before
	public void setUp() throws Exception {
		i = new Inventory();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInventory() {
		assertTrue(i.getChocolate() == 15 &&
				i.getCoffee() == 15 &&
				i.getMilk() == 15 &&
				i.getSugar() == 15);
	}

	@Test
	public void testGetChocolate() {
		assertEquals(i.getChocolate(), 15);
	}

	/*
	 * Success case for setting chocolate
	 */
	@Test
	public void testSetChocolate() {
		i.setChocolate(20);
		assertEquals(i.getChocolate(), 20);
	}
	
	/*
	 * Fail case for setting chocolate
	 */
	@Test
	public void testSetChocolateFail() {
		i.setChocolate(-20);
		assertEquals(i.getChocolate(), 0);
	}

	@Test
	public void testGetCoffee() {
		assertEquals(i.getCoffee(), 15);
	}

	/**
	 * Success case for setting coffee
	 */
	@Test
	public void testSetCoffee() {
		i.setCoffee(20);
		assertEquals(i.getCoffee(), 20);
	}
	
	/**
	 * Fail case for setting coffee
	 */
	@Test
	public void testSetCoffeeFail() {
		i.setCoffee(-20);
		assertEquals(i.getCoffee(), 0);
	}

	@Test
	public void testGetMilk() {
		assertEquals(i.getMilk(), 15);
	}

	/**
	 * Success case for setting milk
	 */
	@Test
	public void testSetMilk() {
		i.setMilk(20);
		assertEquals(i.getMilk(), 20);
	}
	
	/**
	 * Fail case for setting milk
	 */
	@Test
	public void testSetMilkFail() {
		i.setMilk(-20);
		assertEquals(i.getMilk(), 0);
	}

	@Test
	public void testGetSugar() {
		assertEquals(i.getSugar(), 15);
	}

	/**
	 * Success case for setting sugar
	 */
	@Test
	public void testSetSugar() {
		i.setSugar(20);
		assertEquals(i.getSugar(), 20);
	}
	
	/**
	 * Fail case for setting sugar
	 */
	@Test
	public void testSetSugarFail() {
		i.setSugar(-20);
		assertEquals(i.getSugar(), 0);
	}
	
	@Test
	public void testEnoughIngredientsEnough() {
		Recipe r = new Recipe();
		
		assertTrue(i.enoughIngredients(r));
		
	}

	@Test
	public void testEnoughIngredientsNotEnough() {
		Recipe r = new Recipe();
		r.setAmtChocolate(20);
		r.setAmtCoffee(20);
		r.setAmtMilk(20);
		r.setAmtSugar(20);
		
		assertFalse(i.enoughIngredients(r));
		
	}
	
	@Test
	public void testToString() {
		assertNotNull(i.toString());
		
	}

}
