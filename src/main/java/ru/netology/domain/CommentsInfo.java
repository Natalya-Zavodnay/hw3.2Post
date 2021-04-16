package ru.netology.domain;

public class CommentsInfo {

    private int count;
    private boolean canPost;
    private boolean canCloset;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanCloset() {
        return canCloset;
    }

    public void setCanCloset(boolean canCloset) {
        this.canCloset = canCloset;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
