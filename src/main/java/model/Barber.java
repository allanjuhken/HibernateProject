package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "`barber`", schema = "`cat_club`")
public class Barber {

    @Id
    private long id;
    @Column(name = "`name`")
    private String name;
    @Column(name = "`address`")
    private String address;
    @Column(name = "`style`")
    private String style;
    @ManyToMany(mappedBy = "barbers", fetch = FetchType.EAGER)
    private List<Cat> clients;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cat_id", referencedColumnName = "id")


    public Barber() {
    }

    public Barber(long id, String name, String address, String style, List<Cat> clients) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.style = style;
        this.clients = clients;
    }

    public List<Cat> getClients() {
        return clients;
    }

    public void setClients(List<Cat> clients) {
        this.clients = clients;
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", style='" + style + '\'' +
                ", clients=" + clients.size() +
                '}';
    }
}
