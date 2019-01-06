public class ProvinceSquare extends Square {
    int rent;
    int price;
    Player owner;
    boolean isPurchasable=true;
    public ProvinceSquare(String name,int price,int rent){
        this.name=name;
        this.price=price;
        this.rent=rent;
    }
    public void onProvince(Player p){
        if (this.owner==null){
            isPurchasable=true;
        }
        else{
            isPurchasable=false;
        }
        if(isPurchasable){
            if(p.getMoney()>price){
                p.giveMoney(price);
                this.owner = p;
                p.provinceSquares.add(this);
                System.out.println("Now you are the owner of " + name+".It's price is: "+price+"$");
                isPurchasable = false;
            }
            else
                System.out.println("You don't have enough money to purchase " + name +".It's price is: "+price+"$");
        }
        else if(this.owner!=null && this.owner!=p) {
            System.out.println(owner.name + " is owner of " + name);
            System.out.println("You have to give " + rent + "$ to " + owner.name);
            p.giveMoney(rent);
            owner.takeMoney(rent);
        }
    }
}
