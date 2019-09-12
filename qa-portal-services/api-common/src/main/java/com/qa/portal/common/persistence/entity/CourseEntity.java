package com.qa.portal.common.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "training", name = "course")
public class CourseEntity extends QaBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_sequence")
    @SequenceGenerator(name = "course_sequence",
            sequenceName = "training.course_sequence",
            allocationSize = 1)
    private Integer id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_code")
    private String courseCode;


	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
	private List<CourseTechnologyEntity> courseTechnologies;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public List<CourseTechnologyEntity> getCourseTechnologies() {
        return courseTechnologies;
    }

    public void setCourseTechnologies(List<CourseTechnologyEntity> courseTechnologies) {
        this.courseTechnologies = courseTechnologies;
    }
}
