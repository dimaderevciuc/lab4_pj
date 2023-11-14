import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

        public static void scriere(HashMap<Integer,Carte> lista) {
            try {
                ObjectMapper mapper=new ObjectMapper();
                File file=new File("src/main/resources/carti.json");
                mapper.writeValue(file,lista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static HashMap<Integer,Carte> citire() {
            try {
                File file=new File("src/main/resources/carti.json");
                ObjectMapper mapper=new ObjectMapper();
                HashMap<Integer,Carte> carti = mapper
                        .readValue(file, new TypeReference<HashMap<Integer,Carte>>(){});
                return carti;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    public static void main(String[] args) {
        Map<Integer,Carte> carti = new HashMap<Integer, Carte>();
        System.out.println("-----START-----");
        carti = citire();
        var set = carti.entrySet();
        // --- 1 ---
        set.stream().forEach(System.out::println);
        System.out.println();
        // --- 2 ---
        //carti.remove(3);
        //set.stream().forEach(System.out::println);
        //System.out.println();
        // --- 3 ---
        Carte carte = new Carte("Enciclopedia Intelepciunii","Anonim",2012);
        carti.putIfAbsent(7,carte);
        set.stream().forEach(System.out::println);
        // --- 4 ---
        scriere((HashMap<Integer, Carte>) carti);
        System.out.println("Merge!");
        System.out.println();
        // --- 5 ---
        var set2 = carti.entrySet().stream().filter(carte1 -> carte1.getValue().autorul().equalsIgnoreCase("Yuval Noah Harari")).collect(Collectors.toSet());
        set2.forEach(System.out::println);
        System.out.println();
        // --- 6 ---

    }
}
