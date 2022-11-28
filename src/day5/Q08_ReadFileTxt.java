package day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q08_ReadFileTxt {
    public static void main(String[] args) throws IOException {
        Map<String,Integer>wordcounter=new HashMap<>();
        List<String>Lines= Files.readAllLines(Paths.get("src/day5/Q08_FileText"));

        for (String w:Lines) {
            String [] words =w.split(" ");// metinimizi  kelimelere ayırdık
            for (String m:words) {
                if (m.endsWith(",") || m.endsWith(".") || m.endsWith("?")){
                    m=m.substring(0,(m.length()-1));
                }
                if (!wordcounter.containsKey(m)){//ölnceden bakılan kelime yoksa o kelime sayısına bir olsun
                    wordcounter.put(m,1);//
                }else {
                    wordcounter.put(m,(wordcounter.get(m)+1));//eğer varsa
                }
            }
        }
        System.out.println(wordcounter);
    }
}
