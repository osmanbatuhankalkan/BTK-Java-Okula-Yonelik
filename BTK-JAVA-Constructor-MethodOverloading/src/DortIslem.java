public class DortIslem {
    /*********************************************************************** METHOD OVERLOADİNG ***********************************************************************/
    //Hayal edelim biz bir projede bu topla fonks bir çok yerinde kullandık ve bize dediler ki artık 2 sayı değil 3 tane değişken sayı şeklinde güncelleyeceğiz.
    //mevcutta 2 ile çalışanlar olacak sonrasında 3 ile çalışanlarda olacak işte burada bizi kurtarıcı görev görüyor. bunun kullanımını aşşağıda inceleyebilirsin.
    //herhangi bir hata almazsın
    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }
}
