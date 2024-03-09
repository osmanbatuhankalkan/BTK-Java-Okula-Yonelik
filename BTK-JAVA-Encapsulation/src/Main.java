public class Main {
    public static void main(String[] args) {
        Product product = new Product();

//        product.name="Laptop";
//        product.id=1;
//        product.description ="Asus Laptop";
//        product.price=5000;
//        product.stockAmount=3;

        /** GETTER SETTERDAN SONRA **/
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        //Ürün artık elimizde var diyelim bunu veri tabanına eklmeyi başka bir class yapıyor.
        ProductManager productManager= new ProductManager();
        productManager.Add(product);
        System.out.println(product.getName());
        //classlar ilgili operasyonları tutarlar bir classın içinde başka bir classı kullanabiliriz.

        productManager.Add2(1,"","",2,2444);
        //Böyle bir class nesneyi yarattık ve ilerleyen zamanda buna bir ekleme istedi buna renkte eklemek istedik ve bizim böyle 1000 tane 10000 tane nesnemiz var diyelim. hepsini tek tek mi ekleyeceğiz yada çıkaracağız ?

        }
    }