public class Client {
    
    public static void main(String[] args){
        Connection conn = null;
        conn = conn.createConnection("Jean", "1234", "17");
        System.out.println(conn.getName() + " : " + conn.getPassword() + " : " + conn.getCode());
        conn.closeConnection();

        Connection conn2 = Connection.createConnection("Alex", "0000", "38");
        System.out.println(conn2.getName() + " : " + conn2.getPassword() + " : " + conn2.getCode());

        Connection conn1 = Connection.createConnection("Paul", "1111", "69");
        System.out.println(conn1.getName() + " : " + conn1.getPassword() + " : " + conn1.getCode());
        conn1.closeConnection();
    }
}
