package cn.keepingthepiggy.dataModel;

import java.util.Date;

public class RegisterInfo {
    private Short urzid;

    private Integer permission;

    private String account;

    private String pazword;

    private String sex;

    private Integer age;

    private String hometown;

    private String phone;

    private String email;

    private String address;

    private String signature;

    private String portraiturl;

    private String extensionToken;

    private Date createTime;

    private Date updateTime;

    private String delflag;

    public Short getUrzid() {
        return urzid;
    }

    public void setUrzid(Short urzid) {
        this.urzid = urzid;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPazword() {
        return pazword;
    }

    public void setPazword(String pazword) {
        this.pazword = pazword == null ? null : pazword.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getPortraiturl() {
        return portraiturl;
    }

    public void setPortraiturl(String portraiturl) {
        this.portraiturl = portraiturl == null ? null : portraiturl.trim();
    }

    public String getExtensionToken() {
        return extensionToken;
    }

    public void setExtensionToken(String extensionToken) {
        this.extensionToken = extensionToken == null ? null : extensionToken.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }
}