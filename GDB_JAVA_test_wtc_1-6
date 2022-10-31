
import java.util.*;
import java.util.regex.Pattern;
public class Main
{
	public static void main(String[] args) {
        List<String> answer = new java.util.ArrayList<>(Collections.emptyList());
        
        ArrayList<ArrayList<String>> forms = new ArrayList<ArrayList<String>>();
        ArrayList<String> forms2 = new ArrayList<>();
        ArrayList<String> forms3 = new ArrayList<>();
        ArrayList<String> forms4 = new ArrayList<>();
        ArrayList<String> forms5 = new ArrayList<>();
        
        forms2.add("jm@email.com");
        forms2.add("제이엠");
        forms.add(forms2);
        
        forms3.add("jason@email.com");
        forms3.add("제이슨");
        forms.add(forms3);
        
        forms4.add("mj@email.com");
        forms4.add("엠제이");
        forms.add(forms4);
        
        forms5.add("nowm@email.com");
        forms5.add("이제엠");
        forms.add(forms5);
        //System.out.println(forms);
        
        String email = "@email.com";

        if (!(forms.size() >= 1 && forms.size() <= 10000)){
           System.out.println("Incorrect Input!!"); // 실제로는 여기서 코드 진행 멈추고 재입력을 요구하면 됨.
        }
        //System.out.println("happy");
        for (List<String> form : forms) {
            String emailAddress = form.get(0);
            if (11 <= emailAddress.length() && emailAddress.length() < 20) {
                
                if (emailAddress.substring(emailAddress.length() - 10, emailAddress.length()).equals(email)) {
                    //System.out.println(emailAddress.substring(emailAddress.length() - 10, emailAddress.length()));
                } else {//System.out.println("happy");
                    System.out.println("Use \"@email.com\" Domain Only!!");
                }
            } else {
                System.out.println("Incorrect email length Input!!");
            }
        }
        
        for (int i = 0 ; i < forms.size(); i++) {
    
            if (i == forms.size()-1)
                break;
            //System.out.println("happy");
            String nick = forms.get(i).get(1); // word 1
            if (1 <= nick.length() && nick.length() < 20) {
                String onlyKorean = "^[가-힣]*$";
                boolean regex = Pattern.matches(onlyKorean, nick);
                //System.out.println("happy");
                if (regex) {
                    for (int j = 1+i; j < forms.size(); j++) {
                        String secondNick = forms.get(j).get(1); // word 2
                        //System.out.println("happy");
                        for (int k = 0; k < nick.length()-1; k++){ // 닉네임이 1글자일때는 카바 못침.
                            //System.out.println("happy");
                            String duplicatedWords = nick.substring(k, k+2);
                            
                            if (secondNick.contains(duplicatedWords)) {
                                answer.add(forms.get(i).get(0));
                                answer.add(forms.get(j).get(0));
                                //Arrays.sort(answer, Comparator.reverseOrder());
                                
                                //System.out.println(Arrays);    
                            }
                        }

                    }
                } else {
                    System.out.println("Use only Korean nickname!!");
                }
            } else {
                System.out.println("Incorrect nickname length Input!!");
            }
        }
        Set<String> set = new HashSet<>(answer);
		System.out.println(set);
	}
}
