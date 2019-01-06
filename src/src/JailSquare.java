public class JailSquare extends Square {
    public  JailSquare(){
        this.name="Jail";
    }

    public void inJail(Player p){
        p.giveMoney(100);
        System.out.println("You are in the jail! You lose 100$");
    }

}