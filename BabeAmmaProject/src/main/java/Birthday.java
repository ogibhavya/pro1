public class Birthday implements EventManagement {

    public void update(Event m) {
        System.out.println("Birthday :: " + m.getEventName());
    }

}
