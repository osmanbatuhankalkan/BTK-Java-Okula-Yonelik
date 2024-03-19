import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();//hangi tiple çalışacağımızı verdik fark bu
        sehirler.add("Antalya");
        //Öncede obje oluyordu biz yukarıda string olacak dediğimiz için bunu ancak string olarak verebiliriz.
        sehirler.add("İstanbul");
        sehirler.add("Muğla");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove(0);//Bu tarz silebilecğeimiz gibi şu şekilde yazılabilir.
        sehirler.remove("İstanbul");
        Collections.sort(sehirler);//Bu şekil döngüye girmeden önce sıralattık
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}