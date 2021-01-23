/**
 * @author fatac
 */
public class Bilgisayar {

    private Resolution resolution;
    private Monitor monitor;
    private Anakart anakart;


    public Bilgisayar(Resolution resolution, Monitor monitor, Anakart anakart) {
        this.resolution = resolution;
        this.monitor = monitor;
        this.anakart = anakart;
    }


    public  void bilgisayarAc(){
        System.out.println("Bilgisayar aciliyor");
    }
    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
}
