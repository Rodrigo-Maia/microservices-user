package com.rodrigomaia.retratemeuser.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_USERS")
public class UserModel implements Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String name;
    private Integer level;
    private Boolean isActive;
    private String email;
    private String city;
    private Integer areaCode;
    private String phone;
    private String cnpj;
    private String bankNumber;
    private String agenceNumber;
    private String bankType;
    private String numberAcc;
    private String instagram;
    private String twitter;
    private String facebook;
    public UUID getUserId() { return userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Integer getLevel() { return level; }
    public void setLevel(Integer level) { this.level = level; }
    public Boolean getActive() { return isActive; }
    public void setActive(Boolean active) { isActive = active; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public Integer getAreaCode() { return areaCode; }
    public void setAreaCode(Integer areaCode) { this.areaCode = areaCode; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getBankNumber() { return bankNumber; }
    public void setBankNumber(String bankNumber) { this.bankNumber = bankNumber; }
    public String getAgenceNumber() { return agenceNumber; }
    public void setAgenceNumber(String agenceNumber) { this.agenceNumber = agenceNumber; }
    public String getBankType() { return bankType; }
    public void setBankType(String bankType) { this.bankType = bankType; }
    public String getNumberAcc() { return numberAcc; }
    public void setNumberAcc(String numberAcc) { this.numberAcc = numberAcc; }
    public String getInstagram() { return instagram; }
    public void setInstagram(String instagram) { this.instagram = instagram; }
    public String getTwitter() { return twitter; }
    public void setTwitter(String twitter) { this.twitter = twitter; }
    public String getFacebook() { return facebook; }
    public void setFacebook(String facebook) { this.facebook = facebook; }
}