import java.util.*;
public class LinearSearchmenucard{
    public static int linear_search(String menu[], String key){
      for(int i=0; i<menu.length; i++){
        if(menu[i] == key){
          return i;
         }
      }return -1;
    }
    public static void main(String args[]){
          String menu[] = {"pasta","samosa","grills","sandwitch","maggi","nuddles"};
          String key = "maggi";
          int index = linear_search(menu,key);
          if(index == -1){
            System.out.println("not found sorry");
          }
          else{
            System.out.println("key is at index: "+index);
          }
    }
}