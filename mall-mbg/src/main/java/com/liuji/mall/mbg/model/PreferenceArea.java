package com.liuji.mall.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* this model was generated by mybatis-generator
* table:preference_area
* author:null
* date:2021-49-11 15:08:11
*/
@ApiModel("PreferenceArea")
public class PreferenceArea implements Serializable {
    /**
    * column:id
    * data type:BIGINT
    */
    @ApiModelProperty("id")
    private Long id;

    /**
    * column:name
    * data type:VARCHAR
    */
    @ApiModelProperty("name")
    private String name;

    /**
    * column:sub_title
    * data type:VARCHAR
    */
    @ApiModelProperty("subTitle")
    private String subTitle;

    /**
    * column:sort
    * data type:INTEGER
    */
    @ApiModelProperty("sort")
    private Integer sort;

    /**
    * column:show_status
    * data type:INTEGER
    */
    @ApiModelProperty("showStatus")
    private Integer showStatus;

    /**
    * column:pic
    * data type:VARBINARY
    */
    @ApiModelProperty("pic")
    private byte[] pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table preference_area
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area.id
     *
     * @return the value of preference_area.id
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area.id
     *
     * @param id the value for preference_area.id
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area.name
     *
     * @return the value of preference_area.name
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area.name
     *
     * @param name the value for preference_area.name
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area.sub_title
     *
     * @return the value of preference_area.sub_title
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area.sub_title
     *
     * @param subTitle the value for preference_area.sub_title
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area.sort
     *
     * @return the value of preference_area.sort
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area.sort
     *
     * @param sort the value for preference_area.sort
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area.show_status
     *
     * @return the value of preference_area.show_status
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area.show_status
     *
     * @param showStatus the value for preference_area.show_status
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_area.pic
     *
     * @return the value of preference_area.pic
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public byte[] getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_area.pic
     *
     * @param pic the value for preference_area.pic
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_area
     *
     * @mbg.generated 2021-49-11 15:08:11
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", sort=").append(sort);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}