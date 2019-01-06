
public class Pawn {
	int id;
	int location=0;

	public Pawn(int location){
		this.location=location;
	}

	public int move(int diceValue, int loc) {
		location=loc + diceValue;
		if(location >= 40){
			location -= 40;
		}
		return location;
	}
}
