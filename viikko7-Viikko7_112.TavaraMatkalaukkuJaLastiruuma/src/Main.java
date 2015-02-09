public class Main {
    public static void main(String[] args) {
        Matkalaukku matkalaukku = new Matkalaukku(20);
matkalaukku.lisaaTavara(new Tavara("Porkkana", 2));
matkalaukku.lisaaTavara(new Tavara("Kaali", 8));
matkalaukku.lisaaTavara(new Tavara("Nauris", 4));
Tavara raskain = matkalaukku.raskainTavara();

        System.out.println(raskain);
    }

    public static void lisaaMatkalaukutTiiliskivilla(Lastiruuma lastiruuma) {
        
        for(int i = 1; i <= 100; i++) {
            Matkalaukku m = new Matkalaukku(i);
            m.lisaaTavara(new Tavara("Tiiliskivi", i));
            lastiruuma.lisaaMatkalaukku(m);
        }
    }
}