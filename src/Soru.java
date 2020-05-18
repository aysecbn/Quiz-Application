/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayse
 */
public class Soru {
    String soru;
    String secenek1;
    String secenek2;
    String secenek3;
    String secenek4;
    Cevap cevap;
    
    public Soru (String soru ,String secenek1 ,String secenek2 ,String secenek3 ,String secenek4 ,Cevap cevap)
    {
        super();
        this.soru = soru;
        this.secenek1 = secenek1;
        this.secenek2 = secenek2;
        this.secenek3 = secenek3;
        this.secenek4 = secenek4;
        this.cevap = cevap;
    }
    public String getSoru()
    {
        return soru;
    }

    public String getSecenek1() 
    {
        return secenek1;
    }

    public String getSecenek2() 
    {
        return secenek2;
    }

    public String getSecenek3() 
    {
        return secenek3;
    }

    public String getSecenek4() 
    {
        return secenek4;
    }

    public Cevap getCevap() 
    {
        return cevap;
    }
    
}
