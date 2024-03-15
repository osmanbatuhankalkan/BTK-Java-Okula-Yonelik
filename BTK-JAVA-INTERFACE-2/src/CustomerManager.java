public class CustomerManager {
    private ICustomerDal customerDal;//Önceki kodumuzda main classında kullandığımız için private yapma gereği duymamıştık. Şimdi ise tasarım değiştirdik private olarak burada kullanacağız.
    public CustomerManager(ICustomerDal customerDal){ //Bu constructor ne işe yarıyor dersek implamante ettiğimiz sql lerimiz var Mysqlcustomerdal ve oracleCustomerDal yada ilerisi için eklenecek sql sınıfları olur onarlıda implamante edersek
        //onları kullanabilelim diye constructorımızda parametreo larak verdik.
        this.customerDal =customerDal;
    }

    public void add(){
        customerDal.Add();
    }

}
