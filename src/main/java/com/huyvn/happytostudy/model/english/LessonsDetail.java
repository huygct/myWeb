package com.huyvn.happytostudy.model.english;

import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;

/**
 * Created by Huy Nghi on 8/4/2015.
 */
@Entity
@Table(name = "lessonDetail")
public class LessonsDetail {
    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private int id;

    private String name;
    private String type;
    private String url;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "lessonsId", referencedColumnName = "id")
    @JsonBackReference
    private Lessons lessons;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Lessons getLessons() {
        return lessons;
    }

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }
}
