import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Osman","Kalkan"));
        customers.add(new Customer(2,"Batuhan","Kalkan"));
        customers.add(new Customer(3,"Altay","Kalkan"));
        //Böyle nesenelerle çalışılırken sıklıkla yapılan bir hata vardır.
        customers.remove(new Customer(1,"Batuhan","Kalkan"));//remove içine obje göndermemiz lazım
        //yukarıdaki kod çalıştırdığımız zaman yine 3 ü de çalışır bu sıklıkla yapılan bir hatadır.
        //fakat biz referans tipleri öğrendik bu tip objeler refereans numarası üzerinden gider
        //Biz her new dedeiğimzde her bir nesnenin referans numarası oluşur pointer mantığı.
        //Bu yüzden listeden eleman silinmez

        //*BİRDE BÖYLE BAKALIM OLAYA*/
        Customer ayse = new Customer(4,"Ayse","Esya");
        customers.add(ayse);
        customers.remove(ayse);
        //bakın böyle hem ekelem hem silme yapabiliyoruz Aynı REFERANS numarası silindiği için siliniyor
        //O referans tipi neden o kadar önemli burada Onu Çok iyi anlamamız lazım







        for (Customer customer:customers)
        {
            System.out.println(customer.firstName);
        }
    }
}