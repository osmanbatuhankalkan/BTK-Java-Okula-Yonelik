public class TestCircleRactangle {
    public static void main(String[] args)
    {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject();
        System.out.println("Circle: "+ circle.toString());
        System.out.println("Color: "+ circle.getColor());
        System.out.println("Radius: "+ circle.getRadius());
        System.out.println("Area: "+ circle.getArea());
        System.out.println("Diameter: "+ circle.getDiameter());

        RectangleFromSimpeGeometricObject rectangle = new RectangleFromSimpeGeometricObject(2,4);
        System.out.println("Reactangle: "+rectangle.toString());
        System.out.println("Area: "+rectangle.getArea() );
        System.out.println("Perimeter: "+ rectangle.getPerimeter());
    }
}
//**Super keyword
//**Constructor Chanining
//class eğer süper klass varsa ona geçiyor eğer onunda süper classı varsa onun önüne geçip ilk onu çalıştırıyor.
//çalışma mantığı recursive ile benzerdir.
//**Trace Execution bunu verir çıktısı nedir
//çıktı verir bunu gerçekleştiren kodu verin bu tarz sorular sorarmış
//Eğer süperclassı no arg yazmaz isen hata alırsın.
// (**Example on the Implact of asuperclass...... )
//Subclass tanımlarken : süperclastan inheritance ediyor subclassın kendne ait metot ve öellikleri olaiblir super classsı override ettiği durumlarda olaiblir.
//toSTring çokca overrride edilir. bütün sınıflar object sınıfından intherit eder
//**calling superclass methods
//**overriding methods in the superclass
//bir instance metot otvveride edilebilir fakat sadece erişilebilir olrusa
//superclass ve sub class var diyelimdi private subclass içindeki tanımlanan metot superclass in içindeki metot birbiriyle alakalı değildir.çünkü private metotlar overrride edilemez.
//**overriding ve overloading kodunu yazdırır sorarmış her türlüsünü sorabilirm dedi fark mark nedir
//** object class and ıts methods
//

