
import java.util.List;import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    
	    /*
	    List<String> temp = new ArrayList<>(Arrays.asList("a", "b", "a"));
	    System.out.println(temp.get(0) == temp.get(2));
	    System.out.println(temp.get(0).equals(temp.get(2)));
	    */
	    boolean check = true;

        String str = "sdfssddssda";
        String[] array = str.split("");

        List<String> list = Arrays.asList(array);
////////////////////////////////////////////////////////////////////////
        while (check) {
            check = false;
            List<String> cur_string = new ArrayList<>();
            cur_string.addAll(list);
            //System.out.println(cur_string);

            for (int i = 0; list.size() - 1 > i; i++) {
                if (list.get(i).equals(list.get(i + 1))) {
                    
                    cur_string.remove(i + 1);
                    cur_string.remove(i);
                    list = cur_string;
                    check = true;
                    //System.out.println(i);
                    continue; // personally, "break" is much more simple
                }
                //System.out.println(list.size()+ " "+ i);
            }
        }//System.out.println(cur_stirng);
        //System.out.println(list);
	    

    }
}
