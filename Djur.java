package sprint1;

abstract class Djur implements IDjur {

    private double vikt;
    private String namn;

    Djur(double vikt, String namn) {
        setVikt(vikt);
        setNamn(namn);
    }

    private void setVikt(double vikt) {
        this.vikt = vikt;
    }

    private void setNamn(String namn) {
        this.namn = namn;
    }

    @Override
    public void måltid() {
    }

    protected double getVikt() {
        return vikt;
    }

    @Override
    public String getNamn() {
        return namn;
    }
}
