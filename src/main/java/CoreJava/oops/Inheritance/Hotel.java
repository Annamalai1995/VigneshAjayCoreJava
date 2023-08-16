package CoreJava.oops.Inheritance;

public class Hotel extends meals implements Dinner,Lunch,tiiffen{
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.breakfast();
        h.Combo();
        h.dinner();
        h.lunch();
    }

    @Override
    public void dinner() {
        System.out.println("Go  to family then enjoy the night out ");
    }

    @Override
    public void lunch() {
        System.out.println("MEals and Varaitey rice availble");

    }

    @Override
    public void breakfast() {
        System.out.println("Idly and vada ");

    }
}
