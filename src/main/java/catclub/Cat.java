package catclub;
import javax.persistence.*;

//@NamedQuery(query = "from Cat c WHERE c.rating = MAX()")
@Entity
@Table(name = "`cat`", schema = "`cat_club`")
public class Cat {

    @Id
    private long id;
    @Column(name = "`breed`")
    private String breed;
    @Column(name = "`rating`")
    private long rating;
    @Column(name = "`gender`")
    private boolean gender;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cage_id", referencedColumnName = "id")
    private Cage cage;
    @ManyToOne
    @JoinColumn(name = "cat_owner_id")
    private CatOwner catOwner;

    public Cat() {
    }
    public Cat(String breed, long rating, boolean gender) {
        //this.id = id;
        this.breed = breed;
        this.rating = rating;
        this.gender = gender;
    }

    public CatOwner getCatOwner() {
        return catOwner;
    }

    public void setCatOwner(CatOwner catOwner) {
        this.catOwner = catOwner;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", breed='" + breed + '\'' +
                ", rating=" + rating +
                ", gender=" + gender +
                ", cage=" + cage +
                //", catOwner=" + catOwner.getId() +
                '}';
    }
}

