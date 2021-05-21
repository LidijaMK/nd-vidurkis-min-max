package nd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nd {

    public static void fill(List l, int count) {
        for (int i = 0; i < count; i++) {
            l.add(Math.random());
        }
    }

    public static double average(List l) {
        double sum = 0;
        for (int i = 0; i < l.size(); i++) {
            sum += (Double) l.get(i);
        }
        return sum / l.size();
    }

    public static double max(List l) {
//        double max = (double) Collections.max(l);
        double max = Double.MIN_VALUE;
        for (int i = 0; i < l.size(); i++) {
            if (max < (Double) l.get(i)) {
                max = (Double) l.get(i);
            }
        }
        return max;
    }

    public static double min(List l) {
//        double min = (double) Collections.min(l);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < l.size(); i++) {
            if (min > (Double) l.get(i)) {
                min = (Double) l.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {

        List l = new ArrayList();
        fill(l, 10);
        System.out.println(l);
        System.out.println(average(l));
        System.out.println(max(l));
        System.out.println(min(l));

        /*
sukurti metoda, kuris uzpildys duota lista nurodytu kiekiu elementu Math.random()
void fill(List l, int count);

sukurti metoda, kuris paskaiciuotu liste esanciu elementu vidurki
double fill(List l);

sukurti metoda, kuris surastu didziausia elementa
double max(List l);

sukurti metoda, kuris surastu maziausia elementa
double min(List l);
         */
    }

}
