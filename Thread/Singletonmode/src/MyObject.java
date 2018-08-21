// 立即加载 == 饿汉模式
//public class MyObject {
//    private static MyObject myObject = new MyObject();
//
//    private MyObject(){}
//
//    public static MyObject getInstance() {
//        // 立即加载，不能有其他实例变量
//        // getInstance() 方法没有同步，有可能出现非线程安全问题
//        return myObject;
//    }
//}

// 延迟加载
// 在多线程环境中会出现多个号实例的情况，与单例模式的初衷相违背
//public class MyObject {
//    private static MyObject myObject;
//
//    private MyObject(){}
//
//    public static MyObject getInstance() {
//        if(myObject != null){
//
//        }else {
//            myObject = new MyObject();
//        }
//        return myObject;
//    }
//}

// DCL双检查锁机制
//public class MyObject {
//    private static MyObject myObject;
//
//    private MyObject() {
//    }
//
//    public static MyObject getInstance() {
//        if (myObject != null) {
//
//        } else {
//            synchronized (MyObject.class) {
//                if (myObject == null) {
//                    myObject = new MyObject();
//                }
//            }
//        }
//        return myObject;
//    }
//}

// 内置类方式
//import java.io.ObjectStreamException;
//import java.io.Serializable;
//
//public class MyObject implements Serializable {
//    private static final long serialVersionUID = 888L;
//    private static class MyObjectHandler{
//        private static final MyObject myObject = new MyObject();
//    }
//
//    private MyObject(){}
//
//    public static MyObject getInstance() {
//        return MyObjectHandler.myObject;
//    }
//
//    protected Object readResolve() throws ObjectStreamException {
//        return MyObjectHandler.myObject;
//    }
//}

// static代码块
//public class MyObject {
//    private static MyObject instance = null;
//
//    private MyObject() {
//
//    }
//
//    static {
//        instance = new MyObject();
//    }
//
//    public static MyObject getInstance() {
//        return instance;
//    }
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {
    public enum MyEnumSingleton {
        connectionFactory;
        private Connection connection;
        private MyEnumSingleton() {
            try{
                System.out.println("创建MyObject对象");
                String url = "数据库地址";
                String name = "root";
                String password = "";
                String driverName = "驱动名";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url,name,password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}