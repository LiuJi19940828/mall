package com.liuji.mall.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
* this model was generated by mybatis-generator
* table:mall_user
* author:null
* date:2021-17-13 17:07:20
*/
@ApiModel("User")
public class User implements Serializable {
    /**
    * column:id
    * data type:BIGINT
    */
    @ApiModelProperty("id")
    private Long id;

    /**
    * column:username
    * data type:VARCHAR
    */
    @ApiModelProperty("username")
    private String username;

    /**
    * column:password
    * data type:VARCHAR
    */
    @ApiModelProperty("password")
    private String password;

    /**
    * column:icon
    * data type:VARCHAR
    */
    @ApiModelProperty("icon")
    private String icon;

    /**
    * column:email
    * data type:VARCHAR
    */
    @ApiModelProperty("email")
    private String email;

    /**
    * column:nick_name
    * data type:VARCHAR
    */
    @ApiModelProperty("nickName")
    private String nickName;

    /**
    * column:note
    * data type:VARCHAR
    */
    @ApiModelProperty("note")
    private String note;

    /**
    * column:create_time
    * data type:TIMESTAMP
    */
    @ApiModelProperty("createTime")
    private Date createTime;

    /**
    * column:login_time
    * data type:TIMESTAMP
    */
    @ApiModelProperty("loginTime")
    private Date loginTime;

    /**
    * column:status
    * data type:INTEGER
    */
    @ApiModelProperty("status")
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.id
     *
     * @return the value of mall_user.id
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.id
     *
     * @param id the value for mall_user.id
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.username
     *
     * @return the value of mall_user.username
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.username
     *
     * @param username the value for mall_user.username
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.password
     *
     * @return the value of mall_user.password
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.password
     *
     * @param password the value for mall_user.password
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.icon
     *
     * @return the value of mall_user.icon
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.icon
     *
     * @param icon the value for mall_user.icon
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.email
     *
     * @return the value of mall_user.email
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.email
     *
     * @param email the value for mall_user.email
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.nick_name
     *
     * @return the value of mall_user.nick_name
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.nick_name
     *
     * @param nickName the value for mall_user.nick_name
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.note
     *
     * @return the value of mall_user.note
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.note
     *
     * @param note the value for mall_user.note
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.create_time
     *
     * @return the value of mall_user.create_time
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.create_time
     *
     * @param createTime the value for mall_user.create_time
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.login_time
     *
     * @return the value of mall_user.login_time
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.login_time
     *
     * @param loginTime the value for mall_user.login_time
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_user.status
     *
     * @return the value of mall_user.status
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_user.status
     *
     * @param status the value for mall_user.status
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbg.generated 2021-17-13 17:07:20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}