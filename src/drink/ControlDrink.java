package drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ControlDrink {
	private String nameOfDistributor;
	private List<Drink> listOfDrinks = new ArrayList<>();
	private List<CreditCard> listOfCreditCard = new ArrayList<>();

	private Map<String, Column> column = new TreeMap<>();
	
	public ControlDrink(String nameOfDistributor) {

		this.nameOfDistributor = nameOfDistributor;

	}

	public Map<String, Column> getColumn() {
		return column;
	}

	public void setColumn(Map<String, Column> column) {
		this.column = column;
	}

	public String getNameOfDistributor() {
		return nameOfDistributor;
	}

	public void setNameOfDistributor(String nameOfDistributor) {
		this.nameOfDistributor = nameOfDistributor;
	}

	public void addColumn(String numOfColumn, String drinkName, int quantity) {
		Column co = new Column(numOfColumn, drinkName, quantity);
		column.put(numOfColumn, co);

	}

	public void addDrink(int drinkCode, String drinkName, int drinkPrice) {
		Drink target;
		target = getDrinkByCode(drinkCode);
		if (target == null) {
			Drink q = new Drink(drinkCode, drinkName, drinkPrice);

			listOfDrinks.add(q);
		} else {
			System.out.println("THIS DRINK REGISTERED BEFOR");

		}
	}

	public CreditCard getCreditCardByCode(int cardCode) {
		CreditCard creditCard = null;
		for (CreditCard cr : listOfCreditCard) {
			if (cr.getCreditCardCode() == cardCode) {
				creditCard = cr;
			}
		}

		return creditCard;
	}
	// public int reminingCredit(int cardCod) {
	// int credit=0;
	// for (CreditCard crd : listOfCreditCard) {
	// if (crd.getCreditCardCode() == cardCod) {
	// credit = crd.getCredit();
	// }
	// }
	//
	// return credit;
	// }

	public String getDrinkByName(int drinkCodeForName) {

		String drink = null;

		for (Drink x : listOfDrinks) {
			if (x.getDrinkCode() == drinkCodeForName) {
				drink = x.getDrinkName();
			}
		}

		return drink;
	}

	public Drink getDrinkByCode(int drinkCode) {
		Drink drink = null;

		for (Drink x : listOfDrinks) {
			if (x.getDrinkCode() == drinkCode) {
				drink = x;
			}
		}

		return drink;
	}

	

	public List<Drink> getListOfDrinks() {
		return listOfDrinks;
	}

	public void setListOfDrinks(List<Drink> listOfDrinks) {
		this.listOfDrinks = listOfDrinks;
	}

	public List<CreditCard> getListOfCreditCard() {
		return listOfCreditCard;
	}

	public void setListOfCreditCard(List<CreditCard> listOfCreditCard) {
		this.listOfCreditCard = listOfCreditCard;
	}

	public void addToListOfCredit(int creditCardCode, int credit) {

		CreditCard target;
		target = getCreditCardByCode(creditCardCode);

		if (target == null) {
			CreditCard newCard = new CreditCard(creditCardCode, credit);
			listOfCreditCard.add(newCard);
		} else {
			System.out.println("THIS DRINK REGISTERED BEFOR");
		}

	}

	public int setAmountOfCredit(int creditCardcode) {
		int amountOfCredit = 0;

		if (getCreditCardByCode(creditCardcode) != null) {
			amountOfCredit = getCreditCardByCode(creditCardcode).getCredit();
		}

		return amountOfCredit;
	}

	public int quantityAvailable(int drinkCode) {
		String drinkname = null;
		int sum = 0;
		if (getDrinkByName(drinkCode) != null) {
			drinkname = getDrinkByName(drinkCode);

			for (Column c : column.values()) {
				if (drinkname.equals(c.getNameOfDrink())) {
					sum += c.getQuantity();
				}
			}
		}
		return sum;
	}

	//public String supply(int creditCardCode, int drinkCode) {
//		String drinkName = null;
//		int price;
//		int a;
//		String numOfColumn = null;
//		if ((getDrinkByName(drinkCode) != null) && (getCreditCardByCode(creditCardCode) != null)) {
//			drinkName = getDrinkByName(drinkCode);
//			price = getDrinkByCode(drinkCode).getDrinkPrice();
//			for (Column c : column.values()) {
//				if (drinkName.equals(c.getNameOfDrink())) {
//					if (c.getQuantity() >= 1) {
//						c.setQuantity(c.getQuantity() - 1);
//						for (CreditCard credit : listOfCreditCard) {
//							if (credit.getCredit() >= price) {
//								a = credit.getCredit() - price;
//								credit.setCredit(a);
//								numOfColumn = c.getNumOfColumn();
//							} else {
//								System.out.println("CREDIT IS NOT ENOUGH ");
//								return null;
//							}
//						}
//					} else {
//						System.out.println(" QUANTITY IS NOT ENOUGH");
//						return null;
//
//					}
//					break;
//
//				}
//				
//			}
//
//		}
//
//		return numOfColumn;
//
//	}
	public String supply(int creditCardCode, int drinkCode) {
	      Drink drink=getDrinkByCode(drinkCode);
	      CreditCard creditCard=getCreditCardByCode(creditCardCode);  
	    if (drink!=null && creditCard!=null &&  (drink.getDrinkPrice()<=creditCard.getCredit()) ) {
	      for (Column c : column.values()) {
	        if (drink.getDrinkName().equals(c.getNameOfDrink()) && c.getQuantity() >= 1) {          
	            c.setQuantity(c.getQuantity() - 1);
	             creditCard.setCredit( creditCard.getCredit() - drink.getDrinkPrice());
	             return c.getNumOfColumn();
	          } 
	        }        
	      }
	    
	    return null;

	  }
		

}
