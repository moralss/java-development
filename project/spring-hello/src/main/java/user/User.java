package user;

public  class User{
    private Integer id;
    private String name;


    public User(Integer id , String name) {
        super();
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

