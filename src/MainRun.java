import drink.Column;
import drink.ControlDrink;

public class MainRun {

	public static void main(String[] args) {
		ControlDrink control = new ControlDrink("samane");
		control.addDrink(01, "water", 10);
		control.addDrink(02, "wine", 50);
		control.addDrink(03, "coca", 15);

		control.addToListOfCredit(163, 1000);
		control.addToListOfCredit(274, 300);
		control.addToListOfCredit(544, 5000);
		control.addToListOfCredit(67, 70);
		
		control.addColumn("c1", "water", 20);
		control.addColumn("c2", "coca", 40);
		control.addColumn("c3", "wine",30);
		control.addColumn("c4", "water", 45);
		
		for(Column colm:control.getColumn().values()) {
			System.out.println(colm.getNumOfColumn()+ "  "+colm.getNameOfDrink()+"  "+colm.getQuantity());
			
		}

		if (control.getDrinkByCode(07) != null) {

			System.out.println("name of drink is : " + control.getDrinkByCode(01).getDrinkName());

		} else {
			System.out.println("this  drink code is not exist");

		}
		
		if (control.getCreditCardByCode(670) != null) {

			System.out.println("amount of this card is : " + control.getCreditCardByCode(67).getCredit());

		} else {
			System.out.println("this credit card code is not exist");

		}
		
		System.out.println(control.quantityAvailable(03));
		System.out.println("num of column is :"+control.supply(163, 02));
		for(Column colm:control.getColumn().values()) {
			System.out.println(colm.getNumOfColumn()+ "  "+colm.getNameOfDrink()+"  "+colm.getQuantity());
			
		}
		
		
	}
	
	

}
