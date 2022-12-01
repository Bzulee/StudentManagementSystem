import model.Group;
import model.Students;
import model.Teams;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Students> Lobutche = new ArrayList<Students>();
        Students s1 = new Students("Pranjal", 12, 34);
        Lobutche.add(s1);
        Students s2 = new Students("Tatsam", 56, 78);
        Lobutche.add(s2);
        Students s3 = new Students("Sushant", 910, 1011);
        Lobutche.add(s3);

        ArrayList<Students> Khumbila = new ArrayList<Students>();
        Students s4 = new Students("Arpan", 1213, 1415);
        Khumbila.add(s4);
        Students s5 = new Students("Umanga", 1416, 1417);
        Khumbila.add(s5);
        Students s6 = new Students("Aayush", 1518, 1419);
        Khumbila.add(s6);

        ArrayList<Teams> Lobu = new ArrayList<Teams>();
        Teams A1 = new Teams(Lobutche, "A");
        Lobu.add(A1);

        ArrayList<Teams> Khobu = new ArrayList<Teams>();
        Teams A2 = new Teams(Khumbila, "B");
        Khobu.add(A2);

        Group GO1 = new Group("Grade12", Lobu);
        Group GO2 = new Group("Grade 12", Khobu); 
    }
}