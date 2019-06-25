
package user;



//@Entity
//@Table(name="user_storage")
public  class User{

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name ="name")
    private String name;


    public User(long id , String name) {
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

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

