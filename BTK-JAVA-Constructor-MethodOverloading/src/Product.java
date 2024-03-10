public class Product {
    /** Bu kısımda constructor oluşturacağız ama önce şunuda bilelim bunlarda kendi içinde ikiye ayrılıyor.
     * (1):parametreli = sadece o parametreler verilmiş ise çalışır. New lendiği zaman onları vermek durumundasın
     * (2):parametresiz **/
    //(2) Parametresiz Örnek: ismindende anlaşılacağı gibi bir parametresi yok
    public Product() {
        System.out.println("Yapıcı BLok Calisti....");
    }
    //(1) Parametreli
    public Product(int id,String name,String description,double price,int stockAmount,String renk) {
        System.out.println("Yapıcı Parametreli BLok Calisti....");//Sadece ve sadece bu değerleri verirsen sana kullandırıım der.
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setStockAmount(stockAmount);
        this.setRenk(renk);
    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
