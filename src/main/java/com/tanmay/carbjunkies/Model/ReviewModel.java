package com.tanmay.carbjunkies.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="Review")
public class ReviewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer UUID;

    private String name;

    private Integer rating;

    @Lob
    @Column(length = 2048)
    private String description;

    private String location;

    private String imageURL1;
    private String imageURL2;
    private String imageURL3;
    private String imageURL4;
    private String imageURL5;
}
