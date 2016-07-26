/**
 * Created by Leonid on 26.07.2016.
 */
public class Pen {
    public void setColor(String color) {
        this.color = color;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getColor() {

        return color;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    private String color;
    private boolean isEmpty;
    public Pen(){
        color = "blue";
        isEmpty = false;
    }

    public boolean equals(Pen pen) {
        if (this.color.equals(pen.getColor()) && this.isEmpty() == pen.isEmpty())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(this.hashCode());
    }

    @Override
    public int hashCode() {
        return this.getColor().hashCode() + (this.isEmpty() == true ? 1 : 0);
    }
}
