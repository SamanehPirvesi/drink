package drink;

public class Drink {
	private int drinkCode;
	private String drinkName;
	private int drinkPrice;

	public int getDrinkCode() {
		return drinkCode;
	}

	public void setDrinkCode(int drinkCode) {
		this.drinkCode = drinkCode;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public int getDrinkPrice() {
		return drinkPrice;
	}

	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}

	public Drink(int drinkCode, String drinkName, int drinkPrice) {
		super();
		this.drinkCode = drinkCode;
		this.drinkName = drinkName;
		this.drinkPrice = drinkPrice;
	}

}
