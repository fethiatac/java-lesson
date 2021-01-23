/**
 * @author fatac
 */
public class BaybladeFabrikasi {
    public Bayblade baybladeUret(String baybladeAdi){

        if (baybladeAdi.equals("Dranza")){
            return new Dranza("Tako",200,500,"Anka Kusu");
        }else if (baybladeAdi.equals("Drayga")){
            return new Drayga("hakk,",300,450,"Kaplan Pencesi");
        }
        else {
            return null;
        }
    }
}
