public class ProductManager {
    public void Add(Product product){//ekleyecek fakat ne? bir parametre göndermen laızm
        //JDBC
        System.out.println("Ürün eklendi: "+product.getName());
    }
    public void Add2(int id,String name,String description,int stockAmount,double price){}//bu çok hatalı bir kullanımdır bu kadar parametre vermek
}
