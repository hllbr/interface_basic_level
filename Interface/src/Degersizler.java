
public class Degersizler implements IMuhendis{//pC MUHENDİSİ
private boolean askerlik;
private boolean adli_sicil;

    public Degersizler(boolean askerlik, boolean adli_sicil) {
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
        System.out.println("Bu ana kadar bu sektörde sahip olduğun deneyimleri bizimle paylaşki seni daha rahat eleyebilelim.");
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
    
}
