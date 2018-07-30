package com.evelynda.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.evelynda.entity.Address;
import com.evelynda.entity.Customer;

public class CustomerTest {
	
	@Test
	public void testAddress() {
		
		//Address a1 = new Address();
		
		Address a1 = new Address("Kellly Avenue", "Ohio", "12345", "USA");
		
		assertEquals("Kellly Avenue", a1.getStreet());
		assertEquals("Ohio", a1.getState());
		assertEquals("12345", a1.getZip());
		assertEquals("USA", a1.getCountry());
		
	}

	@Test
	public void testCustomer() {
		
		//Address a1 = new Address();
		
		Customer c1 = new Customer("Nancy", "Ochoa", 123456, 
				new Address("Kellly Avenue", "Ohio", "12345", "USA"), 
				new Address("Kellly Avenue", "Ohio", "12345", "USA"));
		
		assertEquals("Nancy", c1.getFirstName());
		assertEquals("Ochoa", c1.getLastName());
		assertEquals(123456, c1.getSocSecurityNum());
		
		assertEquals("Kellly Avenue", c1.getBillingAddres().getStreet());
		assertEquals("Ohio", c1.getBillingAddres().getState());
		assertEquals("12345", c1.getBillingAddres().getZip());
		assertEquals("USA", c1.getBillingAddres().getCountry());
		
		assertEquals("Kellly Avenue", c1.getShippingAddress().getStreet());
		assertEquals("Ohio", c1.getShippingAddress().getState());
		assertEquals("12345", c1.getShippingAddress().getZip());
		assertEquals("USA", c1.getShippingAddress().getCountry());
		
	}

}
