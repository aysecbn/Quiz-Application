
public class Sonuc implements ISonuc
{
    int tumSorular;
    int dogruCevaplar;
    int yanlisCevaplar;
    
    public Sonuc(int tumSorular , int dogruCevaplar , int yanlisCevaplar)
    {
     super();
     this.tumSorular = tumSorular;
     this.dogruCevaplar = dogruCevaplar;
     this.yanlisCevaplar = yanlisCevaplar;
    }

   
    @Override
    public void sonucuGoster()
    {
        
        System.out.println("Sonucunuz : ");
        System.out.println("Soru Sayısı : " + tumSorular);
        System.out.println("Doğru Cevap Sayısı : " + dogruCevaplar);
        System.out.println("Yanlış Cevap Sayısı : " + yanlisCevaplar);
        System.out.println("Başarı Yüzdesi : %" + yuzdeyiGoster(dogruCevaplar , tumSorular));
        System.out.println("" + genelBasari(yuzdeyiGoster(dogruCevaplar , tumSorular)));
    }

   
    public double yuzdeyiGoster(int dogruCevaplar, int tumSorular) 
    {
       return ((double)dogruCevaplar/tumSorular)*100;
    }

    @Override
    public String genelBasari(double yuzde) {
       String yanit = "";
       if(yuzde > 60)
       {
           yanit = "Tebrikler";
       }
       else if(yuzde < 40)
        {
           yanit = "Biraz Daha Çalışmalısınız";   
        }
       else
       {
           yanit = "Ortalama Başarı";
       }
       return yanit;
    }
    
}
