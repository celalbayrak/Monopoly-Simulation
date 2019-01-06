public class ManagementSquare extends Square {
    int rent;
    int price;
    Player owner;
    boolean isPurchasable=true;
    public ManagementSquare(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void onManagementSquare(Player p,int diceValue){
        if (this.owner==null){
            isPurchasable=true;
        }
        else{
            isPurchasable=false;
        }
        if(isPurchasable){
            if(p.getMoney()>price){
                p.giveMoney(price);
                owner = p;
                p.ManagementSquares.add(this);
                System.out.println("Now you are the owner of " + name +".It's price is :"+price+"$");
                isPurchasable=false;
            }
            else
                System.out.println("You don't have enough money to purchase " + name+".It's price is: "+price+"$");
        }
        else if(this.owner!=null && this.owner!=p) {
            System.out.println(this.owner.name + " is owner of " + name);
            if (owner.ManagementSquares.size()==2) {
                rent = diceValue * 10;
            }
            else {
                rent = diceValue * 4;
            }
            System.out.println("You have to give " + rent + "$ to " + owner.name);
            p.giveMoney(rent);
            owner.takeMoney(rent);
        }
    }

}