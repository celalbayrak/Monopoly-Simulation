import java.util.ArrayList; 
public class Person {
	int money;
	String name;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name;
	}

	public int takeMoney(int a) {
		money += a;
		return money;
	}
	public int giveMoney(int a) {
		money -= a;
		return money;
	}

}
