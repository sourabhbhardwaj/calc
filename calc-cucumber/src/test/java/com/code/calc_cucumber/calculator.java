package com.code.calc_cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calculator {

	private calc cal;
	  private int res;
	@Given("^I have two numbers$")
	public void i_have_two_numbers(int num1, int num2) throws Throwable {
	    cal = new calc (num1,num2);
	}

	@When("^I ask it to say add$")
	public void i_ask_it_to_say_add() throws Throwable {
	    res=cal.add();
	}

	@Then("^it should answer with addition$")
	public void it_should_answer_with_addition(int exp) throws Throwable {
	   Integer.compare(exp, res);
	}

	@When("^I ask it to say subtract$")
	public void i_ask_it_to_say_subtract() throws Throwable {
	   cal.subtract();
	}

	@Then("^it should answer with subtraction$")
	public void it_should_answer_with_subtraction(int exp) throws Throwable {
		 Integer.compare(exp, res);
	}

	@When("^I ask it to say multiply$")
	public void i_ask_it_to_say_multiply() throws Throwable {
	    cal.multiply();
	}

	@Then("^it should answer with multiplication$")
	public void it_should_answer_with_multiplication(int exp) throws Throwable {
		Integer.compare(exp, res);
	}

	@When("^I ask it to say divide$")
	public void i_ask_it_to_say_divide() throws Throwable {
	   cal.divison();
	}

	@Then("^it should answer with division$")
	public void it_should_answer_with_division(int exp) throws Throwable {
		Integer.compare(exp, res);
	}


}
