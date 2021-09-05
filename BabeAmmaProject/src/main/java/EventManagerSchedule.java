import java.util.ArrayList;
import java.util.List;

public class EventManagerSchedule {
    private List<EventManagement> Events = new ArrayList<>();

    public void addMedia(EventManagement o) {
        Events.add(o);
    }
    public void detachMedia(EventManagement o) {
        Events.remove(o);
    }

    public void notify(Event m) {
        for(EventManagement o: Events) {
            o.update(m);
        }
    }
}
