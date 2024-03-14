
public class Main {
    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();//oyun bitim ekranı erkektede kadında da cocuktada aynıdır.

        GameCalculator[] gameCalculator = new KidGameCalculator[]{new KidGameCalculator()};

        //Abstructlar s,z base i gizlemek istediğiniz de de kullanıabilir. Abstruct classlar asla newlenemez
        //newlenebilmesi için onu ezmezin gerekmekte aşşağıdaki gibi; Bu iyi bir kullanım değildir her new de içeirisini doldurmak gerekmetedir.

//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }
//        };

    }
}