/**
 * Created by Leonid on 27.07.2016.
 */
public class Pencil extends Stationery implements Writable{
    private String color;

    public Pencil(String color) {
        this.color = color;
        price = 8;
    }

    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
