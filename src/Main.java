import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ucilica u = new Ucilica();

        Krug krug1 = new Krug("Mali", 4);
        Trokut trokut1 = new Trokut("plavi", 4, 8, 7);
        Pravokutnik prav1 = new Pravokutnik("Manji", 3, 5);
//        ArrayList<GeometrijskiLik> likovi = new ArrayList<>();
//        likovi.add(krug1);
//        likovi.add(trokut1);
//        likovi.add(prav1);
//        likovi.add(new Krug("Veliki",15));
//        likovi.add(new Trokut("žuti",8,49,55));
//        likovi.add(new Pravokutnik("veći", 15, 19));        likovi.add(krug1);
        u.getLikovi().add(trokut1);
        u.getLikovi().add(prav1);
        u.getLikovi().add(new Krug("Veliki",15));
        u.getLikovi().add(new Trokut("žuti",8,49,55));
        u.getLikovi().add(new Pravokutnik("veći", 15, 19));

        for (GeometrijskiLik popisLikova : u.getLikovi()) {
            System.out.println(popisLikova);
        }
        System.out.println("\nNakon sortiranja:\n");
        Collections.sort(u.getLikovi());
        for (GeometrijskiLik popisLikova : u.getLikovi()) {
            System.out.println(popisLikova);
        }

    }
}


//Implementirajte novu klasu Ucilica, koja će sadržavati kolekciju generiranih geometrijskih likova.
//Omogućite sortiranje geometrijskih likova prema specifikaciji (po površini uzlazno).
//Demonstrirajte sve funkcionalnosti.


