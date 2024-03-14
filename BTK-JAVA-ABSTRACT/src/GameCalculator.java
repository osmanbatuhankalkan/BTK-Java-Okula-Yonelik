public abstract class GameCalculator {
//    public void hesapla(){
//        System.out.println("Puanınız: 100");
//    }

    //bu operasyonun hiç bir şekilde operasyonu olmasın istiyoruz.Bu şu demek GameCalculatoru kim kullanıyorsa gamover'ı olduğu gibi
    //kullanmak zorundadır. Bu hiç bir zaman değişmeyecektir. Fakat hesaplaya gelince
    //kim inherit ediyoesa hesaplayı içermek zorunda yanı onu override etmek zorunda kendi hesaplamasını yazmak zorunda.
    //Bunu herkes kendi türüne gore override etmek zoruda
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun Bitti.");
    }
}
