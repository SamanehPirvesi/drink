package drink;

public class CreditCard {
	private int creditCardCode;

	private int credit;

	public int getCreditCardCode() {
		return creditCardCode;
	}

	public void setCreditCardCode(int creditCardCode) {
		this.creditCardCode = creditCardCode;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public CreditCard(int creditCardCode, int credit) {
		super();
		this.creditCardCode = creditCardCode;
		this.credit = credit;
	}

}
