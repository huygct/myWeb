package com.huyvn.happytostudy.model;

import com.huyvn.happytostudy.model.english.Lessons;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Huy Nghi on 8/4/2015.
 */
@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private int id;

    private String nameSubject;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "menuId", referencedColumnName = "id")
    private Menu menu;

    @OneToMany(mappedBy = "subjects", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Lessons> lessons = new HashSet<Lessons>();


    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Set<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lessons> lessons) {
        this.lessons = lessons;
    }

}
