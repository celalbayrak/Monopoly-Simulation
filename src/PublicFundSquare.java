public class PublicFundSquare extends Square{

    public PublicFundSquare(){
        name = "Public Fund Square";
    }
    public int randomNum(int until){
        int random=(int)(Math.ceil(Math.random() * until));
        return random;
    }
    public void onPublicFundSquare(Player p){
        int random=randomNum(4);

        switch (random) {
            case 0:
                schoolInstallment(p);
                break;
            case 1:
                payBack(p);
                break;
            case 2:
                propertyTax(p);
                break;
            case 3:
                mostBeautifulGarden(p);
                break;
        }
    }
    public void payBack(Player p){
        System.out.println("There was some mistake on your bank account. Pay back 100$");
        p.giveMoney(100);
    }
    public void propertyTax(Player p){
        System.out.println("You didn't pay the property tax. Penalty is 100$!");
        p.giveMoney(100);
    }
    public void mostBeautifulGarden(Player p){
        System.out.println("You won the most beautiful garden competition. Take 50$");
        p.takeMoney(50);
    }
    public void schoolInstallment(Player p){
        System.out.println("You must pay 150$ school installment");
        p.giveMoney(150);
    }

}
