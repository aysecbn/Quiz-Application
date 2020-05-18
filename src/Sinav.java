
import java.util.Scanner;


public class Sinav extends Soru
{
   public Sinav(String soru, String secenek1, String secenek2, String secenek3, String secenek4, Cevap cevap) {
        super(soru, secenek1, secenek2, secenek3, secenek4, cevap);
    }

    static int tumSorular;
    static int dogruCevaplar;
    static int yanlisCevaplar;
    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args)
    {   
        Sinav.bilgileriGetir();
        System.out.println("Kısa Sınav için 1 değerini giriniz.....");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        
        if (a == 1)
        {
            baslaSinav(getBazisorular());
        } 
        else baslaSinav(getButunsorular());
        
        scan.close();

    }
    
    static Soru s1 = new Soru("1.) Sort data type aralığı aşağıdakilerden hangisidir?","-128 - 127","-32768 - 32767","-2147483648 - 2147483647","Hiçbiri",new Cevap("-32768 - 32767"));
    static Soru s2 = new Soru("2.) Java programlama dilinde string nedir?","class","object","variable","character array",new Cevap("class"));
    static Soru s3 = new Soru("3.) Byte ,int ve literal sayılar aşağıdakilerden hangisi ile tanımlanır? ","int","long","byte","float",new Cevap("int"));
    static Soru s4 = new Soru("4.) Hangisi float veri tipi değişken içermektedir?","-1.7e+308","-3.4e+038","+1.7e+308","-3.4e+050",new Cevap("-3.4e+038"));
    static Soru s5 = new Soru("5.) Bir sınıfta parametrelerle farklılaştırılmış birden fazla yöntem tanımlama süreci nedir?","Function overriding","Function overloading","Function doubling","Hiçbiri",new Cevap("Function overloading"));
    static Soru s6 = new Soru("6.) Char data type sayısal aralığı aşağıdakilerden hangisidir?","-128 ile 127","0 ile 256","0 ile 32767","0 ile 65535",new Cevap("0 ile 65535"));
    static Soru s7 = new Soru("7.) BigDecimal veri tipi için toString() metodunun sınırları nelerdir?","Sınır yoktur","null döndürür","toString mevcut formda sayı gösterir","toString bilimsel notasyon kullanır",new Cevap("toString bilimsel notasyon kullanır"));
    static Soru s8 = new Soru("8.) Boolean değişken aşağıdaki değerlerden hangisini içerir? ","True veya False","0 veya 1","Herhangi bir tamsayı değer","true",new Cevap("True veya False"));
    static Soru s9 = new Soru("9.) Java'da Unicode character kümesindeki ilk 0 ile 127 karakter hangisini içerir? ","ASCII","ISO-LATIN-1","Hiçbiri","ASCII ve ISO-LATIN-1",new Cevap("ASCII ve ISO-LATIN-1"));
    static Soru s10 = new Soru("10.) Hangisi geçerli bir deklarasyondur? ","boolean b1 = 1;","boolean b2 = 'false';","boolean b3 = false;","boolean b4 = 'true'",new Cevap("boolean b3 = false;"));
    static Soru s11 = new Soru("11.) Enum değişkenlerinin kullanım amacı nedir?","Artan (Ascending) sıralama","Azalan (Descending) sıralama","Rastgele (Random) sıralama","order metoduna bağlı olarak değişmektedir.",new Cevap("Artan (Ascending) sıralama"));    
    static Soru s12 = new Soru("12.) Aşağıdakilerden hangileri aşırı yüklenebilir?","Metods","Constructors","Hepsi","Hiçbiri",new Cevap("Hepsi"));
    static Soru s13 = new Soru("13.) Hangi sınıf tüm Enum'ların türetilmiş halidir(extend)?","Object","Enums","Enum","EnumClass",new Cevap("Enum"));
    static Soru s14 = new Soru("14.) Hangi sınıf komut satırı argümanlarının ayrıştırılmasına izin verir?","Args","JCommander","Command Line","Input",new Cevap("JCommander"));
    static Soru s15 = new Soru("15.) Aşağıdaki veri tiplerinden hangisinin +,-,* ve / operatörleri için aşırı yükleme(overloaded) yöntemi yoktur?","int","float","double","BigDecimal",new Cevap("BigDecimal"));
    static Soru s16 = new Soru("16.) BigDecimal veri tipi hangi tabandadır? ","Base 2","Base 8","Base 10","Base e",new Cevap("Base 10"));
    static Soru s17 = new Soru("17.) Java karakter veri tipleri için hangi kodlama tipi kullanılır?","ASCII","ISO-LATIN-1","UNICODE","Hiçbiri",new Cevap("UNICODE"));
    static Soru s18 = new Soru("18.) BigDecimal hangi paketin(package) bir paçasıdır?","java.lang","java.math","java.util","java.io",new Cevap("java.math"));
    static Soru s19 = new Soru("19.) Bir yöntemi tanımlama sürecinde kendisini kullanıyorsa, bu kendisini çağıran yöntemin adı nedir?","Çok Biçimlilik","Soyutlama","Kapsülleme","Özyineleme",new Cevap("Özyineleme"));
    static Soru s20 = new Soru("20.) Bu veri türlerinden hangisi işletim sistemi tarafından Java'daki Özyinelemeyi yönetmek için kullanılır?","Array","Stack","Queue","Tree",new Cevap("Stack"));
    static Soru s21 = new Soru("21.) Bu veri türlerinden hangisi içinde return ifadesi bulunan bir yöntem için kullanılabilir?","void","int","float","hem int hemde float",new Cevap("hem int hemde float"));
    static Soru s22 = new Soru("22.) Byte data type aralığı aşağıdakilerden hangisidir?","-128 - 127","-32768 - 32767","-2147483648 - 2147483647","Hiçbiri",new Cevap("-128 - 127"));
    static Soru s23 = new Soru("23.) Enum sınıfının elemanlarını hangi metod geri döndürür?","getEnums()","getEnumConstants()","getEnumList()","getEnum()",new Cevap("getEnumConstants()"));
    static Soru s24 = new Soru("24.) BigDecimal.ONE nedir?","hatalı ifade","özel nir anlamı yoktur","static variable degeri 1 scale 10","static variable degeri 1 scale 10",new Cevap("static variable degeri 1 scale 10"));
    static Soru s25 = new Soru("25.) Javanın belleği yetersiz olduğunda hangi istisna alınır?","MemoryFullException","MemoryOutOfBoundsException","OutOfMemoryError","MemoryError",new Cevap("OutOfMemoryError"));

    private static Soru butunsorular[] = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s21,s22,s23,s24,s25};
    private static Soru bazisorular[] = {s1,s2,s3,s4,s5};

    public static Soru[] getBazisorular() {
        return bazisorular;
    }

    
    public static Soru[] getButunsorular() {
        return butunsorular;
    }
    
        
    public static void baslaSinav(Soru butunsorular[])
    {
            for(Soru s : butunsorular)
            {
                System.out.println(s.getSoru());
                System.out.println();
                System.out.println("A. "+ s.getSecenek1());
                System.out.println("B. "+ s.getSecenek2());
                System.out.println("C. "+ s.getSecenek3());
                System.out.println("D. "+ s.getSecenek4());
                System.out.println("\n Cevabınızı Giriniz : ");

                char secenek = scan.next().charAt(0);
                
                String cevabim = "";
            
                switch(secenek)
                {
                   case 'A' :
                       cevabim = s.getSecenek1();
                       break;

                   case 'B' :
                       cevabim = s.getSecenek2();
                       break;

                   case 'C' :
                       cevabim = s.getSecenek3();
                       break;

                   case 'D' :
                       cevabim = s.getSecenek4();
                       break;

                   default:
                       break;    
                } 
             
                if(cevabim.equals(s.cevap.getCevap()))
                {
                    System.out.println("------------------------------------------");
                    System.out.println("--------------Doğru Cevap-----------------");
                    System.out.println("------------------------------------------");
                    dogruCevaplar++;
                }
                else
                {

                    System.out.println("------------------------------------------");
                    System.err.println("--------------Yanlış Cevap-----------------");
                    System.out.println("------------------------------------------");
                    yanlisCevaplar++;
                }
                System.out.println("------------------------------------------");
                tumSorular++;    
        }
        ISonuc sonuc =new Sonuc(tumSorular,dogruCevaplar,yanlisCevaplar);
        sonuc.sonucuGoster();
    }
    void baslaSinav(Soru bazisorular)
    {
            
            Scanner scan = new Scanner (System.in);
            for(Soru s : getBazisorular())
               {
                   System.out.println(s.getSoru());
                   System.out.println();
                   System.out.println("A. "+ s.getSecenek1());
                   System.out.println("B. "+ s.getSecenek2());
                   System.out.println("C. "+ s.getSecenek3());
                   System.out.println("D. "+ s.getSecenek4());
                   System.out.println("\n Cevabınızı Giriniz : ");

                  
                   char secenek = scan.next().charAt(0);
                   String cevap = "";

                   switch(secenek)
                   {
                      case 'A' :
                          cevap = s.getSecenek1();
                          break;

                      case 'B' :
                          cevap = s.getSecenek2();
                          break;

                      case 'C' :
                          cevap = s.getSecenek3();
                          break;

                      case 'D' :
                          cevap = s.getSecenek4();
                          break;

                      default:
                          break;    
                   } 

                   if(cevap.equals(s.cevap.getCevap().charAt(tumSorular)))
                   {
                       System.out.println("------------------------------------------");
                       System.out.println("--------------Doğru Cevap-----------------");
                       System.out.println("------------------------------------------");
                       dogruCevaplar++;
                   }
                   else
                   {

                       System.out.println("------------------------------------------");
                       System.err.println("--------------Yanlış Cevap-----------------");
                       System.out.println("------------------------------------------");
                       yanlisCevaplar++;
                   }
                   System.out.println("------------------------------------------");
                   tumSorular++;    
            }
            ISonuc sonuc =new Sonuc(tumSorular,dogruCevaplar,yanlisCevaplar);
            sonuc.sonucuGoster();
            scan.close();;
    }
   
    private static void bilgiler()
    {
      System.out.println("Adınız ve Soyadınız : ");  
      String a = scan.nextLine();
      System.out.println("Öğrenci Numaranız : "); 
      String b = scan.nextLine();
      System.out.println(b+"  "+ a);
      
        
    }
    public static void bilgileriGetir()
    {
        Sinav.bilgiler();
        
    }
    
    
    
}



 
    
    



