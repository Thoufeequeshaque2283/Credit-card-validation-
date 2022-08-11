package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.demo.Card.CardType;

@Component
public class Mainpojo {
	private String id; 
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	 public CardType main() {      
		 Mainpojo p = new Mainpojo();
	        Card c = new Card(id); 
	        
	   return c.getCardType();
	    }
	public String validation()
	{
		 Card c = new Card(id); 
		if(c.isValid() == true )
		{
			String CardIs  = "Yes its a Valid Credit Card";
			return CardIs;
		}
		else 
		{
			String CardIS = "oh! no. its a INVALID CARD Please check your card number";
			return CardIS;
		}
		 
	
	}
}
