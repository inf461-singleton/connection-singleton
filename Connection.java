public final class Connection{
    private String name;
    private String password;
    private String code;
    private static Connection dbConnection;

    private Connection(String name, String password, String code){
        this.name = name;
        this.password = password; 
        this.code = code;
    }

    private Connection(){
        super();
    }

    public static Connection createConnection(String n, String p, String c){
        if (dbConnection == null){
            dbConnection = new Connection(n,p,c);
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

    public String getCode(){
        return code;
    }
}