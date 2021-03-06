package com.liuji.mall.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
* this model was generated by mybatis-generator
* table:subject
* author:null
* date:2021-48-11 15:08:43
*/
@ApiModel("Subject")
public class Subject implements Serializable {
    /**
    * column:id
    * data type:BIGINT
    */
    @ApiModelProperty("id")
    private Long id;

    /**
    * column:category_id
    * data type:BIGINT
    */
    @ApiModelProperty("categoryId")
    private Long categoryId;

    /**
    * column:title
    * data type:VARCHAR
    */
    @ApiModelProperty("title")
    private String title;

    /**
    * column:pic
    * data type:VARCHAR
    */
    @ApiModelProperty("pic")
    private String pic;

    /**
    * column:product_count
    * data type:INTEGER
    */
    @ApiModelProperty("productCount")
    private Integer productCount;

    /**
    * column:recommend_status
    * data type:INTEGER
    */
    @ApiModelProperty("recommendStatus")
    private Integer recommendStatus;

    /**
    * column:create_time
    * data type:TIMESTAMP
    */
    @ApiModelProperty("createTime")
    private Date createTime;

    /**
    * column:collect_count
    * data type:INTEGER
    */
    @ApiModelProperty("collectCount")
    private Integer collectCount;

    /**
    * column:read_count
    * data type:INTEGER
    */
    @ApiModelProperty("readCount")
    private Integer readCount;

    /**
    * column:comment_count
    * data type:INTEGER
    */
    @ApiModelProperty("commentCount")
    private Integer commentCount;

    /**
    * column:album_pics
    * data type:VARCHAR
    */
    @ApiModelProperty("albumPics")
    private String albumPics;

    /**
    * column:description
    * data type:VARCHAR
    */
    @ApiModelProperty("description")
    private String description;

    /**
    * column:show_status
    * data type:INTEGER
    */
    @ApiModelProperty("showStatus")
    private Integer showStatus;

    /**
    * column:forward_count
    * data type:INTEGER
    */
    @ApiModelProperty("forwardCount")
    private Integer forwardCount;

    /**
    * column:category_name
    * data type:VARCHAR
    */
    @ApiModelProperty("categoryName")
    private String categoryName;

    /**
    * column:content
    * data type:LONGVARCHAR
    */
    @ApiModelProperty("content")
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.id
     *
     * @return the value of subject.id
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.id
     *
     * @param id the value for subject.id
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.category_id
     *
     * @return the value of subject.category_id
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.category_id
     *
     * @param categoryId the value for subject.category_id
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.title
     *
     * @return the value of subject.title
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.title
     *
     * @param title the value for subject.title
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.pic
     *
     * @return the value of subject.pic
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.pic
     *
     * @param pic the value for subject.pic
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.product_count
     *
     * @return the value of subject.product_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.product_count
     *
     * @param productCount the value for subject.product_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.recommend_status
     *
     * @return the value of subject.recommend_status
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.recommend_status
     *
     * @param recommendStatus the value for subject.recommend_status
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.create_time
     *
     * @return the value of subject.create_time
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.create_time
     *
     * @param createTime the value for subject.create_time
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.collect_count
     *
     * @return the value of subject.collect_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getCollectCount() {
        return collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.collect_count
     *
     * @param collectCount the value for subject.collect_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.read_count
     *
     * @return the value of subject.read_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.read_count
     *
     * @param readCount the value for subject.read_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.comment_count
     *
     * @return the value of subject.comment_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.comment_count
     *
     * @param commentCount the value for subject.comment_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.album_pics
     *
     * @return the value of subject.album_pics
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.album_pics
     *
     * @param albumPics the value for subject.album_pics
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.description
     *
     * @return the value of subject.description
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.description
     *
     * @param description the value for subject.description
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.show_status
     *
     * @return the value of subject.show_status
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.show_status
     *
     * @param showStatus the value for subject.show_status
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.forward_count
     *
     * @return the value of subject.forward_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public Integer getForwardCount() {
        return forwardCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.forward_count
     *
     * @param forwardCount the value for subject.forward_count
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.category_name
     *
     * @return the value of subject.category_name
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.category_name
     *
     * @param categoryName the value for subject.category_name
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.content
     *
     * @return the value of subject.content
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.content
     *
     * @param content the value for subject.content
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated 2021-48-11 15:08:43
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
        sb.append(", productCount=").append(productCount);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", description=").append(description);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", forwardCount=").append(forwardCount);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}