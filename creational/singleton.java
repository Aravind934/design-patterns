class Database {
    private static Database dbInstance =null;
    public int x;
    private Database(){
        this.x = 500;
    }
    public static Database getInstance(){
        if(dbInstance==null) dbInstance = new Database();
        return dbInstance;
    }
}


class Main {
    public static void main(String[] args) {
        Database obj = Database.getInstance();
        System.out.println(obj.x);
    }
}