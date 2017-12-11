
public class Main {
    public static void main(String[] args) {

        /*
        for(String token : "Justin,Monica,Irene".split(",")){
            System.out.println(token);
        }
        System.out.print("\n");

        for(String token : "JustinOrzMonicaOrzIrene".split("Orz")){
            System.out.println(token);
        }
        System.out.print("\n");

        for(String token : "Justin\tMonica\tIrene".split("\\t")){
            System.out.println(token);
        }*/

        //将\|放入""之间时，按照java字符串规定必须忽略\+中的\,所以必须写成"\\|"
        /*for(String token : "Justin|Monica|Irene".split("\\|")){
            System.out.println(token);
        }*/

        //贪婪量词、逐步量词、独吞量词
        String[] regexs = {".*foo" , ".*?foo" , ".*+foo"};
        for(String regex : regexs){
            System.out.println("xfooxxxxxxfoo".replaceAll(regex,"Orz"));
        }


    }
}
