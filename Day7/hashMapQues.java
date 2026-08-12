import java.util.HashMap;
import java.util.Map;

public class hashMapQues{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"Salman");
         map.put(102,"Priya");
          map.put(103,"Harshit");
           map.put(104,"Sarthak");
            map.put(105,"Abhinav");

            System.out.println(map.get(101));
            if (map.containsKey(8000)){
               System.out.println("Key exist");
            }else{
                System.out.println("kya dhoondra hai bhai");
            }

             System.out.println(map.getOrDefault(3003, "Unknown"));

             System.out.println(map.remove(103));

             for(Map.Entry<Integer, String> entry : map.entrySet()) {

             System.out.println(entry.getKey() + "---> " + entry.getValue());

        }
            
    }
}