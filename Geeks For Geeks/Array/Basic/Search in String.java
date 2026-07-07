package LinearSearch;

//import static sun.jvm.hotspot.interpreter.Bytecodes.name;

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {

        String name = "vijay";
        char target = 's';
        System.out.println(search2(name,target));
        System.out.println (Arrays.toString((name.toCharArray()))) ;

    }
    static boolean search2(String name, char target){
        if (name.length() == 0){
            return false;
        }

        for(char element : name.toCharArray()){
            if (target == element){
                return true;
            }
        }


        for (int i = 0; i < name.length(); i++) {
//
              if (target == name.charAt(i)){
                  return true;
              }
        }
        return false;
    }
}
