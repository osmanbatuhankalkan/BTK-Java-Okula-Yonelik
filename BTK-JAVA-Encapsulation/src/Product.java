public class Product {//Bizim Encapsulationda çok önemli 2 temelimiz var birinci kısım private,public muhabbetimiz bir diğer çok önemli kısım ise Getter ve Setter larımız.
    //Java nın difaulttu publicken c# in private dir. O yüzden bir tanımlama yaparken başına ne eklediğinize dikkat edin.
    //Attribute yada field
//    private int id;
      private int _id;
//    private String name;
      private String _name;
//    private String description;
      private String _description;
//    private double price;
      private double _price;
//    private int stockAmount;
      private int _stockAmount;
    //ürüne ait bilgileri vermiş olduk
    //Fakat bir problem var biz private olarak verdik ve bunlara başka classlardan da erişmek istiyoruz ne yapacağız ? Bu durumda getter ve setter yaratılır.

     /**("*********************GETTER SETTER BÖLÜMÜ****************************");**/
    //Set set etmekten, kurmaktan, yaratmaktan aklımıza değer atamak yazmak gelsin.
    //Get almaktan, getirmekten aklımıza okumak gelsin.

    //GETTER
    public int getId(){//** bu kısımda önemli sana veri tabanından gelen id ye de mudahele edip değiştirebilirsin.
        //return id;
        return _id;
        //* BUNU BÖYLE BIRAKRISAN ID YAZAMAZZ!! FAKAT OKUYABİLİR. SADECE GET verir SET vermezsen 'READ ONLY' olur.
    }
    //SETTER
    public void setId(int id){//* set demek git onun değerini kur demek bize bir şey vermesine gerek yok o yüzden void.
        //*** SET edilen değer PARAMETRE olarak verilmeli ****
        // !!! BU KISIM ÖNEMLİ genel olarak üç  Tür Yazım vardır hepside bir birine denktir.(1) id=id; ,(2) this.id=id; , (3) _id=id;
        //id=id;
        //this.id=id; //** This benim içerisinde bulunduğum class demektir.
        //Hocanın tercihi isimlendirmenin baştan tutuculara, isimlere _ konulması sonrasında parametre olana aşşağıdaki gibi refere edilmesi
        _id=id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
}
