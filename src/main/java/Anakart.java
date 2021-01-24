/**
 * @author fatac
 */
public class Anakart {
    private String model;
    private String marka;
    private int anakartHiz;
    private String capacity;

    public Anakart(String model, String marka, int anakartHiz) {
        this.model = model;
        this.marka = marka;
        this.anakartHiz = anakartHiz;
    }

    public void anakartAc (){
        System.out.println("Anakart aciliyor hizi" + anakartHiz);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getAnakartHiz() {
        return anakartHiz;
    }

    public void setAnakartHiz(int anakartHiz) {
        this.anakartHiz = anakartHiz;
    }
}
