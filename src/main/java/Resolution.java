/**
 * @author fatac
 */
public class Resolution {

    private String en;
    private String boy;

    public Resolution(String en, String boy) {
        this.en = en;
        this.boy = boy;
    }

    public void resolution_giris(){
        System.out.println("resolution giris yapildi" + getEn() + getBoy());
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getBoy() {
        return boy;
    }

    public void setBoy(String boy) {
        this.boy = boy;
    }
}
