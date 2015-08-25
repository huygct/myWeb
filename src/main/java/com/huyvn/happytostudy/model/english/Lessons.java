package com.huyvn.happytostudy.model.english;

import com.huyvn.happytostudy.model.Subjects;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Huy Nghi on 8/5/2015.
 */
@Entity
@Table(name = "lessons")
public class Lessons {
    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private int id;

    private String nameLesson;
    private String type;
    private String url;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "subjectId", referencedColumnName = "id")
    @JsonBackReference
    private Subjects subjects;

    @OneToMany(mappedBy = "lessons", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<LessonsDetail> lessonsDetails = new HashSet<LessonsDetail>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Set<LessonsDetail> getLessonsDetails() {
        return lessonsDetails;
    }

    public void setLessonsDetails(Set<LessonsDetail> lessonsDetails) {
        this.lessonsDetails = lessonsDetails;
    }
}
