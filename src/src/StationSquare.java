public class StationSquare extends Square {
    int price;
    int rent;
    boolean isPurchasable = true;
    Player owner;
    public StationSquare(String name,int price,int rent){
        this.name=name;
        this.price=price;
        this.rent=rent;
    }
    public void onStationSquare(Player p){
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
                p.stationSquares.add(this);
                rent=rent*(p.stationSquares.size());
                System.out.println("Now you are the owner of " + name +".It's price is: "+price+"$"+" rent is:"+rent+"$");
                isPurchasable=false;
            }
            else
                System.out.println("You don't have enough money to purchase " + name+".It's price is: "+price+"$");
        }
        else if(this.owner!=null){
            System.out.println(this.owner.name + " is owner of " + name);
            System.out.println("You have to give " + rent + "$ to " + owner.name);
            p.giveMoney(rent);
            owner.takeMoney(rent);
        }
    }
}
