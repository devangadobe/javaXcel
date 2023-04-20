package com.test;

import java.util.Objects;

public class Money {

	public static void main(String[] args) {
		Money _this = new Money(10.0, "USD");
		Money _that = new Money(1.0, "USD");

		System.out.println(_this.minus(_that).getAmount());
		
		if(new Money(9.0,"USD").equals(_this.minus(_that))){
			System.out.println("Hello");
		}
	}
	
	 private final Double amount;
     private final String currency;

     public Money(Double amount, String currency) {
         this.amount = amount;
         this.currency = currency;
     }

     public Money minus(Money _that) {
         return new Money(this.amount - _that.amount, currency);
     }

     public Double getAmount() {
         return amount;
     }

     public String getCurrency() {
         return currency;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Money money = (Money) o;
         return Objects.equals(amount, money.amount) && Objects.equals(currency, money.currency);
     }

     @Override
     public int hashCode() {
         return Objects.hash(amount, currency);
     }
     

}
