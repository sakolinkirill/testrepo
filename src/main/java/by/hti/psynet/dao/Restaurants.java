package by.hti.psynet.dao;

import org.bson.types.ObjectId;

import javax.persistence.*;


/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Entity
@Table(name = "restaurants")
public class Restaurants {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Section session;

    public Restaurants() {
    }

    public Restaurants(String name) {
        this.name = name;
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

    public Section getSession() {
        return session;
    }

    public void setSession(Section session) {
        this.session = session;
    }
}
