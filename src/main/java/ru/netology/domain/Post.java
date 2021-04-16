package ru.netology.domain;

public class Post {
    private int id;
    private String namePost;
    private String authorPost;
    private String date;
    private String textPost;
    private String imageURL;
    private String videoURL;
    private int countLikes;
    private int countViewing;
    private int commentsInfo;
    private int repostInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getAuthorPost() {
        return authorPost;
    }

    public void setAuthorPost(String authorPost) {
        this.authorPost = authorPost;
    }

    public String getDate(String date) {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public int getCountViewing() {
        return countViewing;
    }

    public void setCountViewing(int countViewing) {
        this.countViewing = countViewing;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(int repostInfo) {
        this.repostInfo = repostInfo;
    }
}
