import java.util.ArrayList;

public class Monopoly {
    Board board=new Board();
    ArrayList<Player> playerArr;
    int faceValue;

    public Monopoly(ArrayList<Player> playerArr){
        this.playerArr=playerArr;
    }
    public void checkSquare(Player p){
        Square currentSquare=board.squareArr.get(p.pawn.location);
        if(currentSquare instanceof ProvinceSquare){
            ((ProvinceSquare) currentSquare).onProvince(p);
        }
        else if (currentSquare instanceof TaxSquare){
            ((TaxSquare) currentSquare).onTaxSquare(p);
        }
        else if (currentSquare instanceof JailSquare){
            ((JailSquare) currentSquare).inJail(p);
        }
        else if (currentSquare instanceof StationSquare){
            ((StationSquare) currentSquare).onStationSquare(p);
        }
        else if (currentSquare instanceof ChanceSquare){
            ((ChanceSquare) currentSquare).onChanceSquare(p);
        }
        else if (currentSquare instanceof PublicFundSquare){
            ((PublicFundSquare) currentSquare).onPublicFundSquare(p);
        }
        else if (currentSquare instanceof ManagementSquare){
            ((ManagementSquare) currentSquare).onManagementSquare(p,faceValue);
        }
    }
    public void isBankrupt(Player p){
        if(p.getMoney()<0) {
            System.out.println("You don't have enough money");
            p.sellProvince();
            p.sellManagement();
            p.sellStationSquares();
        }
        if(p.getMoney()<0){
            System.out.println(p.getName() + " went bankrupt");
            this.playerArr.remove(p);
        }

    }

    public void playGame(){
        int prevLoc;
        System.out.println("GAME HAS STARTED!!!");
        while( this.playerArr.size()!=1){
            for(int turn = 0; turn < this.playerArr.size(); turn++){
                Player player = this.playerArr.get(turn);
                System.out.println("----- It's turn for " + player.name + " -----");
                prevLoc = player.pawn.location;
                faceValue=player.rollDice();
                player.pawn.move(faceValue, player.pawn.location);
                System.out.println("You are at " + this.board.squareArr.get(player.pawn.location).name);
                if(prevLoc > player.pawn.location){
                    System.out.println("You have passed the starting point You earned 20$");
                    player.takeMoney(20);
                }
                this.checkSquare(player);
                System.out.println("You have " + player.getMoney()+"$");
                this.isBankrupt(player);
            }
        }
        System.out.println("GAME OVER");
        System.out.println(this.playerArr.get(0).getName()+" won the game!!!");
    }
}