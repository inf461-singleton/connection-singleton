public class Client {
    
    public static void main(String[] args){
        Connection conn = null;
        conn = conn.createConnection("Jean", "1234");
        System.out.println(conn.getName() + conn.getPassword());
        conn.closeConnection();

        Connection conn2 = Connection.createConnection("Alex", "0000");
        System.out.println(conn2.getName() + conn2.getPassword());

        Connection conn1 = Connection.createConnection("Paul", "1111");

        System.out.println(conn1.getName() + conn1.getPassword());
        conn1.closeConnection();
    }
}
