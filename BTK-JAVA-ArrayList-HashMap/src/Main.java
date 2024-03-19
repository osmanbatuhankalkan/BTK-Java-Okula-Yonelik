//HashMap yapısal anlamda sözlüklere benzetebiliriz.örn ing-tr sözlük düşünün ing kelimeler vardır. Onlar bizim için anahtar görevi görür amaca ulasmaya çalışırız.
import java.util.Currency;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("Book","Kitap");
        sozluk.put("Table","Masa");
        sozluk.put("Computer","Bilgisayar");
        System.out.println(sozluk.size());//kaç eleman varsa onu verir

        //sözlükteki elemanları dolaşmak iştersek foreach döngüsünü yine kullanalım.
        for(String item:sozluk.keySet()){
            System.out.println("Eleman-"+item+"Değer-"+sozluk.get(item));
        }//fark ettiyseniz sırayla getirmedi kendi algoritmasına göre getirdi. Sıralı diyemeyiz.

        sozluk.remove("Table");
        System.out.println(sozluk.get("Table"));//sildiğimiz için değer null olarak geliyor.

        //*** Customer customer = new Customer(); burada bir referansı işaret ettiği için 'null' dönmüyor fakat
        // Customer customer; olarak yapsaydık işaretlediği bir nokta olmadığı için "null" dönecekti.
        //null tututğu bir referans yok anlamaına geliyor burada.
    }
}