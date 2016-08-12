package by.hti.psynet.dao;

import org.bson.types.ObjectId;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ObjectId id;

    private String title;

    private String description;

    private Date created;

    private Date updated;

    @ElementCollection(fetch = FetchType.EAGER)
    public Collection<ObjectId> userAccess;

    @ElementCollection(fetch = FetchType.EAGER)
    public Collection<ObjectId> groupAccess;

    //rating access

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Collection<ObjectId> getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(List<ObjectId> userAccess) {
        this.userAccess = userAccess;
    }

    public Collection<ObjectId> getGroupAccess() {
        return groupAccess;
    }

    public void setGroupAccess(List<ObjectId> groupAccess) {
        this.groupAccess = groupAccess;
    }
}
