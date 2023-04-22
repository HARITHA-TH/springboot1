package com.UST.InterviewFeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class InterviewFeedback {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String userId;
    private String CandidateName;
    private String  InterviewerName;
    private String interviewerEmpId;
    private int rating;

    public InterviewFeedback(Long id, String userId, String candidateName, String interviewerName, String interviewerEmpId, int rating, String status) {
        this.id = id;
        this.userId = userId;
        CandidateName = candidateName;
        InterviewerName = interviewerName;
        this.interviewerEmpId = interviewerEmpId;
        this.rating = rating;
        this.status = status;
    }

    public InterviewFeedback() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public String getInterviewerName() {
        return InterviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        InterviewerName = interviewerName;
    }

    public String getInterviewerEmpId() {
        return interviewerEmpId;
    }

    public void setInterviewerEmpId(String interviewerEmpId) {
        this.interviewerEmpId = interviewerEmpId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;


}
