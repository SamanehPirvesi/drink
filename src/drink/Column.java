package drink;

public class Column {
	private String numOfColumn;
	private String nameOfDrink;
	private int quantity;
public Column(String numOfColumn, String nameOfDrink, int quantity) {
		
		this.numOfColumn = numOfColumn;
		this.nameOfDrink = nameOfDrink;
		this.quantity = quantity;
	}
	
	public String getNumOfColumn() {
		return numOfColumn;
	}
	public void setNumOfColumn(String numOfColumn) {
		this.numOfColumn = numOfColumn;
	}
	public String getNameOfDrink() {
		return nameOfDrink;
	}
	public void setNameOfDrink(String nameOfDrink) {
		this.nameOfDrink = nameOfDrink;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
