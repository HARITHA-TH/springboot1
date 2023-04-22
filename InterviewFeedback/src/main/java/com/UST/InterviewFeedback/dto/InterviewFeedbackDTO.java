package com.UST.InterviewFeedback.dto;

public class InterviewFeedbackDTO  {
    private Long id;
    private String userId;
    private String CandidateName;
    private String InterviewerName;
    private String interviewerEmpId;
    private int rating;
    private String status;

    public InterviewFeedbackDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCandidateName(String CandidateName) {
        this.CandidateName = CandidateName;
    }

    public String getCandidateName() {
        return this.CandidateName;
    }

    public void setInterviewerName(String InterviewerName) {
        this.InterviewerName = InterviewerName;
    }

    public String getInterviewerName() {
        return this.InterviewerName;
    }

    public void setInterviewerEmpId(String interviewerEmpId) {
        this.interviewerEmpId = interviewerEmpId;
    }

    public String getInterviewerEmpId() {
        return this.interviewerEmpId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}