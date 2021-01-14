package com.pluralsight.conferencedemo.models;

import javax.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

@Entity(name="speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private Byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    private List<Session> sessions;
    public Speaker() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }

    public long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(long Speaker_id) {
        this.speaker_id = Speaker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String Speaker_name) {
        this.first_name = Speaker_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String Speaker_description) {
        this.last_name = Speaker_description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Speaker_length) {
        this.title = Speaker_length;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}

