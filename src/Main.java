import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> playerArr = new ArrayList<>();
        playerArr.add(new Player("celal",200));
        playerArr.add(new Player("aybüke",200));
        playerArr.add(new Player("barney",200));
        playerArr.add(new Player("ted",200));
        playerArr.add(new Player("marshall",200));
        playerArr.add(new Player("robin",200));
        playerArr.add(new Player("lily",200));
        playerArr.add(new Player("ranjit",200));
        Monopoly monopoly=new Monopoly(playerArr);
        monopoly.playGame();
    }
}