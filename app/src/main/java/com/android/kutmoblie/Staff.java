package com.android.kutmoblie;

import java.util.Date;

public class Staff {
    private String first_name;
    private String last_name;
    private String profile_name;
    private int group;
    private int institute;
    private String responsibility;
    private String internal_phone_line;
    private String email;
    private String education;
    private String resume_link;
    private Date date_joined;

    public Staff(String first_name, String last_name, String profile_name, int group, int institute, String responsibility, String internal_phone_line, String email, String education, String resume_link, Date date_joined) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.profile_name = profile_name;
        this.group = group;
        this.institute = institute;
        this.responsibility = responsibility;
        this.internal_phone_line = internal_phone_line;
        this.email = email;
        this.education = education;
        this.resume_link = resume_link;
        this.date_joined = date_joined;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", profile_name='" + profile_name + '\'' +
                ", group=" + group +
                ", institute=" + institute +
                ", responsibility='" + responsibility + '\'' +
                ", internal_phone_line='" + internal_phone_line + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", resume_link='" + resume_link + '\'' +
                ", date_joined=" + date_joined +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getProfile_name() {
        return profile_name;
    }

    public void setProfile_name(String profile_name) {
        this.profile_name = profile_name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getInstitute() {
        return institute;
    }

    public void setInstitute(int institute) {
        this.institute = institute;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getInternal_phone_line() {
        return internal_phone_line;
    }

    public void setInternal_phone_line(String internal_phone_line) {
        this.internal_phone_line = internal_phone_line;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getResume_link() {
        return resume_link;
    }

    public void setResume_link(String resume_link) {
        this.resume_link = resume_link;
    }

    public Date getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(Date date_joined) {
        this.date_joined = date_joined;
    }
}
