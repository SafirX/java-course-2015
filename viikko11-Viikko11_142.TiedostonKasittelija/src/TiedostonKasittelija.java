

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedostonKasittelija {
    
    private Scanner reader;

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        ArrayList<String> rivit =  new ArrayList<String>();
        
        reader = new Scanner(new File(tiedosto));
        
        while(reader.hasNextLine())
            rivit.add(reader.nextLine());
        
        return rivit;
    }

    public void tallenna(String tiedosto, String teksti) throws IOException {
        FileWriter writer = new FileWriter(tiedosto);
        
        writer.write(teksti);
        writer.close();
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws IOException {
        FileWriter writer = new FileWriter(tiedosto);
        
        for(String line : tekstit)
            writer.write(line+"\n");
        
        writer.close();
    }
}