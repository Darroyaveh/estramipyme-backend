package com.estramipyme.crud.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "section", nullable = false)
    private String section;

    @Column(name = "statement", nullable = false)
    private String statement;

    @Column(name = "subsection", nullable = false)
    private String subsection;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Question(Long id, String section, String statement, String subsection) {
        this.id = id;
        this.section = section;
        this.statement = statement;
        this.subsection = subsection;
    }

    public Question() {}

}