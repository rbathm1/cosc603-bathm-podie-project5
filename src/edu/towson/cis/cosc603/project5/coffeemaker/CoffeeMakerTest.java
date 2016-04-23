package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	@Before
	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(1);
	}

	/**
	 * Test adding r1
	 */
	@Test
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	/**
	 * Test deleting r1
	 */
	@Test
	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	/**
	 * Test editing r1
	 */
	@Test
	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	/**
	 * Test adding inventory
	 */
	@Test
	public void testaddInventory1(){
		cm.addInventory(5, 5, 5, 5);
		assertTrue(cm.checkInventory().getChocolate() == 20 &&
				cm.checkInventory().getCoffee() == 20 &&
				cm.checkInventory().getMilk() == 20 &&
				cm.checkInventory().getSugar() == 20);
	}
	
	/**
	 * Test adding inventory with zero case
	 */
	@Test
	public void testaddInventory2(){
		assertTrue(cm.addInventory(0, 0, 0, 0));
	}
	
	/**
	 * Test checking the inventory
	 */
	@Test
	public void testCheckInventory1(){
		assertTrue(cm.checkInventory().getChocolate() == 15 &&
				cm.checkInventory().getCoffee() == 15 &&
				cm.checkInventory().getMilk() == 15 &&
				cm.checkInventory().getSugar() == 15);
	}
	
	/**
	 * Test purchasing a beverage successfully
	 */
	@Test
	public void testPurchaseBeverage1(){
		assertEquals(cm.makeCoffee(r1, 60),10);
		
		assertTrue(cm.checkInventory().getChocolate() == 14 &&
				cm.checkInventory().getCoffee() == 9 &&
				cm.checkInventory().getMilk() == 14 &&
				cm.checkInventory().getSugar() == 14);
	}
	
	/**
	 * Test purchasing a beverage without enough ingredients
	 */
	@Test
	public void testPurchaseBeverage2(){
		cm.makeCoffee(r1, 50);
		cm.makeCoffee(r1, 50);
		assertEquals(cm.makeCoffee(r1, 60),60);
	}
	
	/**
	 * Test purchasing a beverage without enough money
	 */
	@Test
	public void testPurchaseBeverage3(){
		assertEquals(cm.makeCoffee(r1, 40),40);
	}
}