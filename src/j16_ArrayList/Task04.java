package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {

        ArrayList<String>listİsim=new ArrayList<>(Arrays.asList("ali","veli","ayşe","fatma","omer"));
        ArrayList<String>listOlmayan=new ArrayList<>();


        for (int i = 0; i <listİsim.size() ; i++) {
            if (!listİsim.get(i).contains("a")){
                listOlmayan.add(listİsim.get(i));

            }
        }
        System.out.println("listOlmayan = " + listOlmayan);
         // listİsim.clear();
        //listİsim.addAll(listOlmayan);

        listİsim=listOlmayan;
        System.out.println(listİsim);
    }
}
