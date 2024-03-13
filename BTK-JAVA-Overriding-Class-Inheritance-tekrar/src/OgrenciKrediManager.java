public class OgrenciKrediManager extends BaseKrediManager{
    //Devlet dedi ki öğrencilere faiz 1.18 değilde 0.60 dan vereceksin
    /** ÖNEMLİ*/
    //BaseKrediManagera gidersekte hesapla kısmımın böyle olduğunu göreecğiz fakat önemli kısım şu:
    //!!!!!!! buradaki hesaplada yapacağın değişiklikle işlemler artık bu extends için geçerli olacaktır !!!!!!.
    //*********************** Base'in hesaplasını öğrenci için ezmiş oluyoruz. İşte Burada Overriding den yararlandık **********************************
    //javada bir classın herhangi bir operasyonu biz aksini belirtmediğimiz sürece overridable üzerinde yazılabilirdir.
    public double hesapla(double tutar){
        return tutar*0.60;//basit bir tutar hesap mekanizması bizim banka olarak uyguladığımız faiz(1.18) basit şekilde kurgu

    }
}
