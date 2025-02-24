public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public abstract double povrsina();

    public abstract double opseg();

    @Override
    public String toString() {
        return "Naziv: " + naziv + "\nPovrsina: " + povrsina() +
                "\nOpseg: " + opseg();
    }
    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(povrsina(), o.povrsina());
    }
}

//Ako klasa ima apsktraktnu metodu, klasa mora biti apstraktna
//Ne možemo instancirati(kreirati) objekte iz Apstraktne klase
//Apstraktna klasa mora biti naslijeđena
//Moramo implementirati sve Apstraktne metode Apstraktne klase