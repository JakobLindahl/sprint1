package sprint1;

public class Hund extends Djur {

    public Hund(int vikt, String namn) {
        super(vikt, namn);
    }

    @Override
    public double hurMycketMat() {
        return getVikt() * 1000 / 100;
    }

    @Override
    public void måltid() {
        System.out.println(getNamn() + " ska ha " + (int) hurMycketMat() + "g hundfoder");
    }

}
