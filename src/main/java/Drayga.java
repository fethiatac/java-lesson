/**
 * @author fatac
 */
public class Drayga extends Bayblade{
    private String kutsalCanavar;

    public Drayga(String balybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(balybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void kutsalCanavariOrtayaCikar() {
        System.out.println(getBalybladeci() + " " + kutsalCanavar + " ı ortaya cıkıyor");
        System.out.println(getBalybladeci() + " ın saldırısı  : Kaplan Pencesi");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı "+ kutsalCanavar);
    }
}
