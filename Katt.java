package sprint1;

public class Katt extends Djur {

    public Katt(double vikt, String namn) {
        super(vikt, namn);
    }

    @Override
    public double hurMycketMat() {
        return getVikt() * 1000 / 150;
    }

    @Override
    public void måltid() {
        System.out.println(getNamn() + " ska ha " + (int) hurMycketMat() + "g kattfoder");
    }

}
