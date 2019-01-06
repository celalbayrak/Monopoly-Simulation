import java.util.ArrayList;

public class Player extends Person{
	Pawn pawn = new Pawn(0);
	ArrayList<StationSquare> stationSquares = new ArrayList<StationSquare>(4);
	ArrayList<ProvinceSquare> provinceSquares = new ArrayList<ProvinceSquare>(22);
	ArrayList<ManagementSquare> ManagementSquares = new ArrayList<ManagementSquare>(2);

	public Player(String name,int money){
		this.name=name;
		this.money=money;
	}

	public int rollDice() {
		System.out.println("Rolling dice...");
		int diceValue = (int)(Math.ceil(Math.random() * 10 ) + 2);
		System.out.println("Face value is " + diceValue);
		return diceValue;
	}
	public void sellProvince(){
		int i=0;
		while(this.money<0) {
			if (!(this.provinceSquares.isEmpty())) {
				int salePrice = (this.provinceSquares.get(i).price) / 2;
				System.out.println("You sold "+provinceSquares.get(i).name+" and you earn "+salePrice);
				this.provinceSquares.get(i).owner=null;
				this.provinceSquares.remove(i);
				this.takeMoney(salePrice);
				System.out.println("You have "+getMoney()+"$");
			}
			else break;
		}
	}
	public void sellManagement(){
		int i=0;
		while(this.money<0) {
			if (!(this.ManagementSquares.isEmpty())) {
				int salePrice = (this.ManagementSquares.get(i).price) / 2;
				System.out.println("You sold "+ManagementSquares.get(i).name+" and you earn "+salePrice);
				this.ManagementSquares.get(i).owner=null;
				this.ManagementSquares.remove(i);
				this.takeMoney(salePrice);
				System.out.println("You have "+getMoney()+"$");
			}
			else break;
		}
	}
	public void sellStationSquares(){
		int i=0;
		while(this.money<0) {
			if (!(this.stationSquares.isEmpty())) {
				int salePrice = (this.stationSquares.get(i).price) / 2;
				System.out.println("You sold "+stationSquares.get(i).name+" and you earn "+salePrice);
				this.stationSquares.get(i).owner=null;
				this.stationSquares.remove(i);
				this.takeMoney(salePrice);
				System.out.println("You have "+getMoney()+"$");
			}
			else break;
		}
	}
}
