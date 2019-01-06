public class TaxSquare extends Square {
    int tax;
    public TaxSquare(String name,int tax){
        this.tax=tax;
        this.name=name;
    }
    public void onTaxSquare(Player p){
        System.out.println("You have to pay " + tax + "$ " + name);
        p.giveMoney(tax);
    }
}
