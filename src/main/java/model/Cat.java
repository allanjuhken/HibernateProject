package model;

import javax.persistence.*;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = "Cat_Max_Rating",
                query = "FROM Cat ORDER BY rating DESC"),
        @NamedQuery(name = "Cats_By_CatOwner_Code",
                query = "SELECT c FROM Cat c, CatOwner o " +
                        "WHERE c.catOwner.id = o.id AND o.code = :code"),
        @NamedQuery(name = "Cats_By_CatOwner_Name",
                query = "SELECT c FROM Cat c, CatOwner o WHERE c.catOwner.id = o.id AND o.name LIKE :name"),
        @NamedQuery(name = "Get_Cats_By_Gender",
                query = "SELECT c FROM Cat c WHERE c.gender = :gender"),
        @NamedQuery(name = "Get_Cats_By_Breeds",
                query = "SELECT c FROM Cat c WHERE c.breed IN :breeds ")


//        SELECT cat.* FROM cat_club.cat, cat_club.cat_owner
//        WHERE cat.cat_owner_id = cat_owner.id AND cat_owner.code = '111111111';

})
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
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cage_id", referencedColumnName = "id")
    private Cage cage;
    @ManyToOne
    @JoinColumn(name = "cat_owner_id")
    private CatOwner catOwner;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "cat_barber",
            joinColumns = {@JoinColumn(name = "cat_id")},
            inverseJoinColumns = {@JoinColumn(name = "barber_id")}
    )
    private List<Barber> barbers;

    public Cat() {
    }

    public Cat(long id, String breed, long rating, boolean gender, Cage cage, CatOwner catOwner, List<Barber> barbers) {
        this.id = id;
        this.breed = breed;
        this.rating = rating;
        this.gender = gender;
        this.cage = cage;
        this.catOwner = catOwner;
        this.barbers = barbers;
    }

    public List<Barber> getBarbers() {
        return barbers;
    }

    public void setBarbers(List<Barber> barbers) {
        this.barbers = barbers;
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
                ", catOwner=" + catOwner.getId() +
                ", barbers=" + barbers +
                '}';
    }
}

