package catclub;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "`cat_owner`", schema = "`cat_club`")

public class CatOwner {
    @Id
    private long id;
    @Column(name = "`name`")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "code")
    private String code;

    @OneToMany(mappedBy = "catOwner", fetch = FetchType.LAZY)
    private List<Cat> cats;

    public CatOwner(){}

    public CatOwner(String name, String address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "CatOwner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                ", cats=" + cats + // for not printing infinite cats of owners, it prints size of cats list
                '}';
    }
}
