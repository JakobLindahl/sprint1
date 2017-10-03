package sprint1;

abstract class Djur implements IDjur {

    private double vikt;
    private String namn;

    Djur(double vikt, String namn) {
        this.vikt = vikt;
        this.namn = namn;
    }

    @Override
    public void måltid() {
    }

    public double getVikt() {
        return vikt;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
