import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Leonid on 26.07.2016.
 */
public class PriceCalculator {
    public static List<Stationery> list;
    public static void main(String args[]){
        list = new LinkedList<Stationery>();
        list.add(new Pen("blue"));
        list.add(new Pencil("black"));
        list.add(new AutoPen("red"));

        int price = 0;

        for(Stationery s : list){
            price += s.getPrice();
        }

        System.out.println("Total price is: " + price);

        list.sort(new PriceComparator());

        for(Stationery s : list){
            System.out.println(s.getClass().getName() + ", price: " + s.getPrice());
        }
    }
}

class AutoPen extends Pen{
    private boolean isActive = false;
    public void activate(){
        isActive = true;
    }

    public AutoPen(String color) {
        super(color);
        price = 15;
    }
}

class PriceComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery a, Stationery b) {
        return (a.getPrice() < b.getPrice()) ? -1 : (a.getPrice() == b.getPrice()) ? 0 : 1;
    }
}