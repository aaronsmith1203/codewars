package info.aaronsmith.codewars.java;

public class App {

    public static void main(String[] args) {
        System.out.println(HumanReadableTime.makeReadable(1));
        System.out.println(HumanReadableTime.makeReadable(59));
        System.out.println(HumanReadableTime.makeReadable(61));
        System.out.println(HumanReadableTime.makeReadable(359999));
    }

}
