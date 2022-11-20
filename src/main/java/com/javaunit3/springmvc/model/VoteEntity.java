package com.javaunit3.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "votes")
public class VoteEntity {

    @Id
    @GeneratedValue
    public Integer id;

    @Column(name = "voter_name")
    public String voterName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
}
