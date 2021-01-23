/**
 * @author fatac
 */
public class Bayblade {

    private String balybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Bayblade(String balybladeci, int donusHizi, int saldiriGucu) {
        this.balybladeci = balybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir(){
        System.out.println(balybladeci+ "saldiri gucu : "+saldiriGucu+ "ve donuz hizi "+ donusHizi +" ile saldiriyor");
    }

    public void kutsalCanavariOrtayaCikar(){
        System.out.println("Kutsal canavarı yok");
    }
    public void bilgileriGoster(){
        System.out.println("baybladeci "+ balybladeci);
        System.out.println("donus hizi "+ saldiriGucu);
        System.out.println("saldiri Gucu "+ saldiriGucu);
    }
    public String getBalybladeci() {
        return balybladeci;
    }

    public void setBalybladeci(String balybladeci) {
        this.balybladeci = balybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
}
