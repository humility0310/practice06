package prob5;

public class Money {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Integer result = this.amount + money.getAmount();
		return new Money(result);
	}

	public Money minus(Money money) {
		Integer result = this.amount - money.getAmount();
		return new Money(result);
	}

	public Money multiply(Money money) {
		Integer result = this.amount * money.getAmount();
		return new Money(result);
	}

	public Money devide(Money money) {
		Integer result = this.amount / money.getAmount();
		return new Money(result);
	}

	public Money(int i) {
		this.amount = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
}
