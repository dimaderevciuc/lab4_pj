package exemplul3_tema;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    static List<PerecheNumere> listPerechiNumere = new ArrayList<PerecheNumere>();

    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/numere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file=new File("src/main/resources/numere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> perechi = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return perechi;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> perechi=citire();
        System.out.println(perechi);
        for(PerecheNumere p:perechi){
            System.out.println(p);
        }
        perechi.add(new PerecheNumere(44,33));
        scriere(perechi);
    }
}
