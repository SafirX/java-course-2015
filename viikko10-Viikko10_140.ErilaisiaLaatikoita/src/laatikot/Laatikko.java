package laatikot;

import java.util.Collection;

public abstract class Laatikko {

    public void lisaa(Collection<Tavara> tavarat) {
        for (Tavara tavara : tavarat) {
            lisaa(tavara);
        }
    }
    
    public abstract void lisaa(Tavara tavara);

    public abstract boolean onkoLaatikossa(Tavara tavara);
}
