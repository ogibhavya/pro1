public class Main {

    public static void main(String[] args)
    {
        Anniversary anniversary = new Anniversary();
        Birthday birthday = new Birthday();
        Marriage marriage = new Marriage();

        EventManagerSchedule eventManagerSchedule = new EventManagerSchedule();

        eventManagerSchedule.addMedia(anniversary);
        eventManagerSchedule.addMedia(birthday);


        eventManagerSchedule.notify(new Event("First Two Events"));

        eventManagerSchedule.detachMedia(anniversary);
        eventManagerSchedule.addMedia(marriage);

        eventManagerSchedule.notify(new Event("Second Message"));
    }
}
