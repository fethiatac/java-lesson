import java.util.Scanner;

/**
 * @author fatac
 */
public class HelloWorld {
    public static void main(String[] args){

     /* Inheritance
      Manager mng = new Manager(666,"Fethi","ICT");
      mng.showInfo();*/

      /*  Composition
        Resolution resolution = new Resolution("1220","1000");
        Monitor monitor = new Monitor("MonitorModel","Monitor Uretici","22",resolution);
        Anakart anakart = new Anakart("AnakartModel","AnakartMarka",45);
        Bilgisayar bilgisayar = new Bilgisayar(resolution,monitor,anakart);

        bilgisayar.bilgisayarAc();
        bilgisayar.getResolution().resolution_giris();
        bilgisayar.getAnakart().anakartAc();
        bilgisayar.getMonitor().monitor_baslat();*/


      /* Polymorphisimn start

        System.out.println("Bayblade Programına hos geldiniz");
        System.out.println("Baybladeci seciniz cikmak icin q ya basiniz");
        Scanner scn = new Scanner(System.in);
      while(true){
          System.out.println("Hangi bayblade i uretmek istiyorsunuz");
          String islem = scn.nextLine();

          if (islem.equals("q")){
              System.out.println("programdan cikiliyor ");
              break;
          }else{
              BaybladeFabrikasi baybladeFabrikasi = new BaybladeFabrikasi();
              Bayblade bayblade = baybladeFabrikasi.baybladeUret(islem);

              if (bayblade == null) {
                  System.out.println("Bayblade adını duzgun girmelisiniz");
              }else{
                  bayblade.bilgileriGoster();
                  bayblade.saldir();
                  bayblade.kutsalCanavariOrtayaCikar();

              }
          }
      }
         Polymorphisimn end  */
    }
}
