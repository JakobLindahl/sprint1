package sprint1;

public class Orm extends Djur {

    public Orm(int vikt, String namn) {
        super(vikt, namn);
    }

    @Override
    public double hurMycketMat() {
        return 20;
    }

    @Override
    public void måltid() {
        System.out.println(getNamn() + " ska ha " + (int) hurMycketMat() + "g ormpellets");
    }

}
