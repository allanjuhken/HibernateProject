package catclub;
import javax.persistence.*;

@Entity
@Table(name = "`cage`", schema = "`cat_club`")

public class Cage {

    @Id
    private long id;
    @Column(name = "`color`")
    private String color;
    @Column(name = "`serial`")
    private String serialNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cat_id", referencedColumnName = "id")
    private Cat cat;

    public Cage() {
    }

    public Cage(long id, String color, String serialNumber) {
        this.id = id;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Cage{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", cat=" + cat.getId() +
                '}';
    }
}
