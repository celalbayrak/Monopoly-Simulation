public class ChanceSquare extends Square {

    public ChanceSquare(){
        name= "Chance Square";
    }
    public int randomNum(int until){
        int random=(int)(Math.ceil(Math.random() * until));
        return random;
    }

    public void onChanceSquare(Player p){
        int state=randomNum(4);

        switch (state) {
            case 0:
                payTax(p);
                break;
            case 1:
                overSpeed(p);
                break;
            case 2:
                lottery(p);
                break;
            case 3:
                moveStart(p);
                break;
        }
    }
    public void overSpeed(Player p){
        System.out.println("You must pay 40$ over speed penalty!");
        p.giveMoney(40);
    }
    public void lottery(Player p){
        System.out.println("You have won 200$ bonuses!");
        p.takeMoney(200);
    }
    public void moveStart(Player p){
        System.out.println("Go to the starting point and take 200$!");
        p.pawn.location=0;
        p.takeMoney(200);
    }
    public void payTax(Player p){
        System.out.println("You must pay 250$ tax");
        p.giveMoney(250);
    }
}
