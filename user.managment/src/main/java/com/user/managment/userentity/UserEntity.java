package com.user.managment.userentity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="user_management")
public class UserEntity {
    @Column(name="FIRST_NAME")
    private String fName;
    @Column(name="LAST_NAME")
    private String lName;
    @Id
    @Column(name="EMAIL_ID")
    private String emailId;
    @Column(name="PASSWORD_USER")
    private String password;
    @Column(name="MOBILE_NUM")
    private  long mobileNum;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }
}
