
public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "";

        manager.add(product);

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}
//*** GEREKLİ AÇIKLAMAR SINIFLARIN İÇERİSİNDE YAPILDI*******//

//fakat bunlar önerilmiyor(inner) tek sorumluluk prensibne ayırır oluyor 2 ayrı class oluşturmak daha mantıklı
//crud data base helper conneciton databasehelper yapmak daha mantıklı***

//Staticler 1 kere kurulur herkes onu kullanır bir web sayfasında
//static tanımlanınca aynı newleyince örnek oluşuyordu, o örnek bizim işimiz bitince bellekten atılıyordu.
//işte static yapınca bellekten atılmıyor orada kalıyor.
//ilk kullanan statici çağırıyor sonra gelen her kullanıcı aynı statici kullanıyor.
//Bu tip manager sınıfları statıc yapılmaz.
//özetle bir metotu static yapınca class ismi ile direkt çağırılır.
