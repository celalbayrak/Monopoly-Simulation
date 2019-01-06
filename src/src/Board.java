import java.util.ArrayList;

public class Board {
    ArrayList<Square> squareArr = new ArrayList<Square>(40);

    public Board() {
        squareArr.add(0, new StartSquare());
        squareArr.add(1, new ProvinceSquare("Old Kent Road", 60, 4));
        squareArr.add(2, new PublicFundSquare());
        squareArr.add(3, new ProvinceSquare("Whitechapel Road", 60, 4));
        squareArr.add(4, new TaxSquare("The Income Tax",200));
        squareArr.add(5, new StationSquare("King's Cross Station",50,20));
        squareArr.add(6, new ProvinceSquare("The Angel, Islington", 100, 6));
        squareArr.add(7, new ChanceSquare());
        squareArr.add(8, new ProvinceSquare("Euston Road", 100, 8));
        squareArr.add(9, new ProvinceSquare("Pentonville Road", 120, 6));
        squareArr.add(10, new JailSquare());
        squareArr.add(11, new ProvinceSquare("Pall Mall", 140, 10));
        squareArr.add(12, new ManagementSquare("Power Management",150));
        squareArr.add(13, new ProvinceSquare("Whitehall", 140, 10));
        squareArr.add(14, new ProvinceSquare("Northumberland Avenue", 160, 12));
        squareArr.add(15, new StationSquare("Marylebone Station",50,20));
        squareArr.add(16, new ProvinceSquare("Bow Street", 180, 14));
        squareArr.add(17, new PublicFundSquare());
        squareArr.add(18, new ProvinceSquare("Great Marlborough Street", 180, 14));
        squareArr.add(19, new ProvinceSquare("Vine Street", 200, 16));
        squareArr.add(20, new ParkSquare());
        squareArr.add(21, new ProvinceSquare("Strand", 220, 22));
        squareArr.add(22, new ChanceSquare());
        squareArr.add(23, new ProvinceSquare("Fleet Street", 220, 22));
        squareArr.add(24, new ProvinceSquare("Trafalgar Square", 240, 24));
        squareArr.add(25, new StationSquare("Fenchurch Street Station",60,20));
        squareArr.add(26, new ProvinceSquare("Leicester Square", 260, 18));
        squareArr.add(27, new ProvinceSquare("Coventry Street", 260, 18));
        squareArr.add(28, new ManagementSquare("Water Managemet",150));
        squareArr.add(29, new ProvinceSquare("Piccadilly", 280, 20));
        squareArr.add(30, new JailSquare());
        squareArr.add(31, new ProvinceSquare("Regent Street", 300, 26));
        squareArr.add(32, new ProvinceSquare("Oxford Street", 300, 26));
        squareArr.add(33, new PublicFundSquare());
        squareArr.add(34, new ProvinceSquare("Bond Street", 320, 28));
        squareArr.add(35, new StationSquare("Liverpool Street Station",60,20));
        squareArr.add(36, new ChanceSquare());
        squareArr.add(37, new ProvinceSquare("Park Lane", 350, 35));
        squareArr.add(38, new TaxSquare("Luxury Tax",30));
        squareArr.add(39, new ProvinceSquare("Mayfair", 400, 50));
    }
}