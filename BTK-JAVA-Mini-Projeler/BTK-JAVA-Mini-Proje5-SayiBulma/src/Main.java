public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,8,0};
        int aranacak =25;
        //Bu sayıların içierisnde var mı yok mu ?
        boolean varMi =false;
        for(int sayi:sayilar)
        {
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi Bulunmaktadır.");
        }else
            System.out.println("Sayi Bulunmamaktadır");
    }
}