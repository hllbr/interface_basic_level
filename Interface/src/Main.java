
public class Main {
    public static void main(String[] args){
        //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
        /*
        arayüz ve arabirim kavramları
        inheritance ile benzer classların ortak özelliklerini tek bir çatı altında birleştirip daha sonra bu classları türetebiliyorduk
        Java'da c++ ta olduğu gibi çoklukalıtım bulunmuyor.(birçok classtan türemek)
        çoklu kalıtım eğer miras aldığın classlarda fonksiyonların isimleri aynıysa belli başlı sıkıntılar doğurabiliyor.
        çoklu kalıtım ile yapmamız gerekn işleri halledebilmek için interface kavramı bulunuyor.
        Javada bir interface'in metodlarının kod blokları yazılmıyor
        interface'e uyan tüm classların bu metodları tek tek yazması gerek(kendi metodları içinde)
        interface temelde bir sözleşme görevi görüyor
        herbir maddesi imzalanması gerekn bir sözleşme gibi düşünülebilir.
        interfacelerden bir obje oluşturamayız bunlar normal classlar değil.
        interface ten oluşturduğumuz bir referans bunları impelemnt eden classların objelerine referans olabilir.
        interface içinde herhangi bir özellik bulunamıyor
        final ve static değişkenler tanımlanabiliyor.
        kendisini impemente edenler için bir çatı olarak ta düşünerbiliriz interfaceleri.
        Java da bir class birden fazla interface'i implemente edebilir.Bunda herhangi bir sıkıntı yok
        
        */
        IMuhendis degersizler = new Degersizler(false, false);
        
        degersizler.askerlik_sorgula();
        degersizler.adli_sicil_sorgula();
        System.out.println(degersizler.mezuniyet_ortalaması(3.50));
        String [] önemsiz_tecrübe = {"IBM","GOOGLE","APPLE","UBER","BTC"};
        
        degersizler.is_tecrube_sorgula(önemsiz_tecrübe);
        System.out.println("------------------------------------------------");
        EEM eem = new EEM(true, false);
        String [] tecrube = {};
        String [] referanslar = {"hllbr","h2lbr","@prince"};
        eem.adli_sicil_sorgula();
        eem.askerlik_sorgula();
        System.out.println(eem.mezuniyet_ortalaması(5.0));
        eem.is_tecrube_sorgula(tecrube);
        eem.referans_getir(referanslar);
        eem.calıs();
        
    }
    
}
