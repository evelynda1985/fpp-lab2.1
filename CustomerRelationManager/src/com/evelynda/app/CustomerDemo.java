package com.evelynda.app;

import java.util.ArrayList;
import java.util.List;

import com.evelynda.entity.Address;
import com.evelynda.entity.Customer;

public class CustomerDemo {

	public static void main(String[] args) {
		
		List<Customer> listCustomers = new ArrayList<>();
		
		//Create Customers
		Customer customer1 = new Customer("Nancy", "Ochoa", 123456, 
										new Address("Kellly Avenue", "Ohio", "12345", "USA"), 
										new Address("Kellly Avenue", "Ohio", "12345", "USA"));
		
		Customer customer2 = new Customer("Diana", "Ramirez", 123896, 
				new Address("Hamilton Avenue", "Chicago", "85598", "USA"), 
				new Address("Periodico Avenue", "Chicago", "784523", "USA"));
		
		Customer customer3 = new Customer("Esteban", "Dominguez", 78599, 
				new Address("Snider court", "Iowa", "87898", "USA"), 
				new Address("Snider court", "Iowa", "87898", "USA"));
		
		listCustomers.add(customer1);
		listCustomers.add(customer2);
		listCustomers.add(customer3);
		
		//print all customers		
		System.out.println("printing all the customers \n");
		loopCustomers(listCustomers);
		
		//print only customer who lives in Chicago	
		System.out.println("printing all the customers who lives in Chicago \n");
		getCustomersFromChicago(listCustomers);


	}
	
	//Method to loop and print only customer who lives in Chicago	
	private static void getCustomersFromChicago(List<Customer> listCustomers) {
		for (Customer tempCustomer : listCustomers) {

			if (tempCustomer.getBillingAddres().getState().toLowerCase().equals("chicago")) {
				System.out.println(tempCustomer + "\n");
			}
		}
	}
	
	//method to loop and print out all the customers
	private static void loopCustomers(List<Customer> listCustomers) {
		for (Customer tempCustomer : listCustomers) {
			
			System.out.println(tempCustomer + "\n");
			
		}
	}

}
