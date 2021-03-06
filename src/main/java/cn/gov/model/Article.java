package cn.gov.model;

import java.util.Date;

public class Article {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.cat_id
     *
     * @mbggenerated
     */
    private Integer catId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.date
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.short_title
     *
     * @mbggenerated
     */
    private String shortTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.position_id
     *
     * @mbggenerated
     */
    private String positionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.display
     *
     * @mbggenerated
     */
    private Boolean display;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.read_time
     *
     * @mbggenerated
     */
    private Integer readTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.keyword
     *
     * @mbggenerated
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.summary
     *
     * @mbggenerated
     */
    private String summary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.thumb
     *
     * @mbggenerated
     */
    private String thumb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.doc
     *
     * @mbggenerated
     */
    private String doc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.redirect
     *
     * @mbggenerated
     */
    private Boolean redirect;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.sub_title
     *
     * @mbggenerated
     */
    private String subTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.bold
     *
     * @mbggenerated
     */
    private Boolean bold;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.color
     *
     * @mbggenerated
     */
    private String color;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.cat_id
     *
     * @return the value of article.cat_id
     *
     * @mbggenerated
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.cat_id
     *
     * @param catId the value for article.cat_id
     *
     * @mbggenerated
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.date
     *
     * @return the value of article.date
     *
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.date
     *
     * @param date the value for article.date
     *
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.source
     *
     * @return the value of article.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.source
     *
     * @param source the value for article.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.short_title
     *
     * @return the value of article.short_title
     *
     * @mbggenerated
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.short_title
     *
     * @param shortTitle the value for article.short_title
     *
     * @mbggenerated
     */
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle == null ? null : shortTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.position_id
     *
     * @return the value of article.position_id
     *
     * @mbggenerated
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.position_id
     *
     * @param positionId the value for article.position_id
     *
     * @mbggenerated
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.display
     *
     * @return the value of article.display
     *
     * @mbggenerated
     */
    public Boolean getDisplay() {
        return display;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.display
     *
     * @param display the value for article.display
     *
     * @mbggenerated
     */
    public void setDisplay(Boolean display) {
        this.display = display;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.read_time
     *
     * @return the value of article.read_time
     *
     * @mbggenerated
     */
    public Integer getReadTime() {
        return readTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.read_time
     *
     * @param readTime the value for article.read_time
     *
     * @mbggenerated
     */
    public void setReadTime(Integer readTime) {
        this.readTime = readTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.keyword
     *
     * @return the value of article.keyword
     *
     * @mbggenerated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.keyword
     *
     * @param keyword the value for article.keyword
     *
     * @mbggenerated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.summary
     *
     * @return the value of article.summary
     *
     * @mbggenerated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.summary
     *
     * @param summary the value for article.summary
     *
     * @mbggenerated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.thumb
     *
     * @return the value of article.thumb
     *
     * @mbggenerated
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.thumb
     *
     * @param thumb the value for article.thumb
     *
     * @mbggenerated
     */
    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.url
     *
     * @return the value of article.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.url
     *
     * @param url the value for article.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.doc
     *
     * @return the value of article.doc
     *
     * @mbggenerated
     */
    public String getDoc() {
        return doc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.doc
     *
     * @param doc the value for article.doc
     *
     * @mbggenerated
     */
    public void setDoc(String doc) {
        this.doc = doc == null ? null : doc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.redirect
     *
     * @return the value of article.redirect
     *
     * @mbggenerated
     */
    public Boolean getRedirect() {
        return redirect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.redirect
     *
     * @param redirect the value for article.redirect
     *
     * @mbggenerated
     */
    public void setRedirect(Boolean redirect) {
        this.redirect = redirect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.sort
     *
     * @return the value of article.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.sort
     *
     * @param sort the value for article.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.sub_title
     *
     * @return the value of article.sub_title
     *
     * @mbggenerated
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.sub_title
     *
     * @param subTitle the value for article.sub_title
     *
     * @mbggenerated
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.bold
     *
     * @return the value of article.bold
     *
     * @mbggenerated
     */
    public Boolean getBold() {
        return bold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.bold
     *
     * @param bold the value for article.bold
     *
     * @mbggenerated
     */
    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.color
     *
     * @return the value of article.color
     *
     * @mbggenerated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.color
     *
     * @param color the value for article.color
     *
     * @mbggenerated
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}