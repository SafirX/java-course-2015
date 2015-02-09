public class Paaohjelma {
    public static void main(String[] args) {
        
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
        
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        System.out.printf("Pekka: %s", pekanKortti);
        System.out.printf("\nMatti: %s", matinKortti);
        
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
        
        System.out.printf("\nPekka: %s", pekanKortti);
        System.out.printf("\nMatti: %s", matinKortti);
        
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        
        matinKortti.lataaRahaa(50);
        System.out.printf("\nPekka: %s", pekanKortti);
        System.out.printf("\nMatti: %s", matinKortti);
    }
}