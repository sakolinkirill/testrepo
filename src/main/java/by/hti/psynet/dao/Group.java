package by.hti.psynet.dao;

import org.bson.types.ObjectId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ObjectId id;

	private String name;

    private String description;

    @ManyToOne
    private User user;

    @ElementCollection(fetch = FetchType.EAGER)
    private Collection<ObjectId> members = new ArrayList<>();

    private Date created;

    private Date updated;

    public Group() {
	}

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<ObjectId> getMembers() {
        return members;
    }

    public void setMembers(List<ObjectId> members) {
        this.members = members;
    }

    public void addMember(ObjectId objectId) {
        members.add(objectId);
    }
}
