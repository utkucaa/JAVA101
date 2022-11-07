public class DiziİleHarmonik {
    public static void main(String[] args) {

        int list[] = {5,7,8,9,12,23};

        double toplam=0;

        for(double i : list){
            toplam += 1/i;
        }
        double sonuc = list.length/toplam;
        System.out.println("harmonik ortalama:\t" +sonuc);
    }
}
