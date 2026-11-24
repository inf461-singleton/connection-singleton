public final class Connection{
    private String name;
    private String password;
    private static Connection dbConnection;

    private Connection(String name, String password){
        this.name = name;
        this.password = password; 
    }

    private Connection(){
        super();
    }

    public static Connection createConnection(String n, String p){
        if (dbConnection == null){
            dbConnection = new Connection(n,p);
        }
        return dbConnection;
    }

    public String closeConnection(){
        if (dbConnection != null) {
            dbConnection = null;
        }
        return "La connexion est fermé";
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}