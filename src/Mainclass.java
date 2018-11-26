import java.util.ArrayList;

public class Mainclass {
    public static void main(String[] args) {
        ArrayList<Propertyclass>list;
        Propertyclass movie;

        list = new ArrayList<>();

        movie = new Propertyclass("Wakanda","Lupita",4.5);
        list.add(movie);

        movie = new Propertyclass("Siren","That guy",4.0);
        list.add(movie);

        movie= new Propertyclass("Skycraper","The Rock",4.4);
        list.add(movie);
        System.out.println(list.toString());
    }
}
