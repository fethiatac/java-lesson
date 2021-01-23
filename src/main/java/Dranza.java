/**
 * @author fatac
 */
public class Dranza extends Bayblade{


    private String kutsalCanavar;

    public Dranza(String balybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(balybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavariOrtayaCikar() {
        System.out.println(getBalybladeci() + " " + kutsalCanavar + " ı ortaya cıkıyor");
        System.out.println(getBalybladeci() + " ın saldırısı  : Alev kılıcı");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı "+ kutsalCanavar);
    }
}
