package com.estramipyme.crud.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(name = "response_text", nullable = false)
    private String responseText;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "result_id", nullable = false)
    private Long resultId;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public String getResponseText() {
        return responseText;
    }

    public User getUser() {
        return user;
    }

    // public Long getUserId() {
    //     return user.getId();
    // }

    public Long getResultId() {
        return resultId;
    }

    // public void setUserId(Long userId) {
    //     if (this.user == null) {
    //         this.user = new User();
    //     }
    //     this.user.setId(userId);
    // }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }
}