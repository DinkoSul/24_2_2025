public class Krug extends GeometrijskiLik {
    private int radijus;

    public Krug(String naziv, int radijus) {
        super(naziv);
        this.radijus = radijus;
    }

    @Override
    public double povrsina() {
        return Math.pow(radijus, 2)*Math.PI;
//        r2π
    }

//    Opseg kruga 2rπ

    @Override
    public double opseg() {
        return 2*radijus*Math.PI;
    }
}
