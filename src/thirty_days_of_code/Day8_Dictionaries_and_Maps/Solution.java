package thirty_days_of_code.Day8_Dictionaries_and_Maps;

//Complete this code or write your own from scratch
import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.get(s)==null){
                System.out.println("Not found");
            } else {

                System.out.println(s+"="+map.get(s));
            }

        }
        in.close();
    }
}
