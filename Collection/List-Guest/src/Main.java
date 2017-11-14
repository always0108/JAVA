
import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        List names = new ArrayList();
        collectNameTo(names);
        out.println("访客名单：");
        printUpperCase(names);
    }

    static void collectNameTo(List names)
    {
        Scanner input = new Scanner(System.in);
        while(true){
            out.print("访客名称：");
            String guestname = input.nextLine();
            if(guestname.equals("quit")){
                break;
            }
            names.add(guestname);
        }
    }

    static void printUpperCase(List names){
        for(int i = 0; i < names.size(); i++){
            String name = (String)names.get(i);
            out.println(name.toUpperCase());
        }
    }
}
