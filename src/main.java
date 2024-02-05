import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {
        CustomArrayList  newList= new CustomArrayList<>();
        List <String> Aone= new ArrayList<>();
        List<Integer> Atwo= new ArrayList<>();
        List<Integer> Athree= new ArrayList<>();
        List<Integer> Afour= new ArrayList<>();
        List<Integer> Afive= new ArrayList<>();
        List<Integer> Asix= new ArrayList<>();
        List<Integer> Aseven= new ArrayList<>();
        List<Integer> Aeight= new ArrayList<>();
        List<Integer> Anine= new ArrayList<>();
        List<Integer> Aten= new ArrayList<>();
        List<Integer> Aeleven= new ArrayList<>();
        newList.add(Aone);
       newList.add(Atwo);
       newList.add(Athree);
       newList.add(Afour);
       newList.add(Afive);
       newList.add(Asix);
       newList.add(Aseven);
       newList.add(Aeight);
       newList.add(Anine);
       newList.add(Aten);
       newList.add(Aeleven);
        Aone.add("Class one one");
        Aone.add("Class one two");
        Atwo.add(11111);
        Atwo.add(22222);

        System.out.println( newList.getSize());
        for (int i =0; i< newList.getSize();i++){
            System.out.println(newList.get(i));
        }
    }
}
