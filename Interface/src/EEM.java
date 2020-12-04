
public class EEM implements IMuhendis,ICalısma{

    @Override
    public void calıs() {
        System.out.println("ELEKTRİK ELEKTRONİK OKuMUŞ BİR İNSAN NE ZAMAN DURUR SÖYLESENE");
    }
private boolean askerlik ;
private boolean adli_sicil ;

    public EEM(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    @Override
    public void askerlik_sorgula() {
        if(askerlik){
            System.out.println("askerlik yapıldı");
        }else{
            System.out.println("askerlik tecil durumunda");
        }
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "mezuniyet ortalaması" +derece ;
    }

    @Override
    public void adli_sicil_sorgula() {
         if(adli_sicil){
            System.out.println("Adli sicil kaydı bulunuyor.");
        }else{
            System.out.println("Adli sicil kaydı bulunmuyor");
        }
    }

    @Override
    public void is_tecrube_sorgula(String[] array) {
        if(array.length == 0){
            System.out.println("Yeni Mezun bu sebepten dolayı tecrübem yok");
        }else{
            System.out.println("EEM mühensiyimn fakat bir değersizin yapamayacağı her türlü özelliğe sahibim yıldız olmak bunu gerektirir.");
            for(int i = 0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
   
    }
    public void referans_getir(String[] arrays){
        if(arrays.length == 0){
            System.out.println("Referansa ihtiyacım yok .");
        }else{
            System.out.println("Referanslarım : ");
            for(int i = 0;i<arrays.length;i++){
            System.out.println(arrays[i]);
            }
            
        }
    }
    
}
