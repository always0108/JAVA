
public class Main {

    public static final String CHARSET = "UTF-8";
    public static final String RSA_ALGORITHM = "MyUtils";

    public static void main(String[] args) throws Exception {
        ConnectJWGL connectJWGL = new ConnectJWGL();
        connectJWGL.login("04163164","ldxz19980108!@",connectJWGL.getRSApublickey());
    }

}
