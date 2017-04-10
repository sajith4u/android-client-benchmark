package app.innova.dev.cleintbenchmark.beans;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("to_user_id")
    @Expose
    private int toUserId;
    @SerializedName("to_user")
    @Expose
    private String toUser;
    @SerializedName("from_user")
    @Expose
    private String fromUser;
    @SerializedName("result_type")
    @Expose
    private String resultType;
    @SerializedName("recent_retweets")
    @Expose
    private int recentRetweets;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("from_user_id")
    @Expose
    private int fromUserId;
    @SerializedName("iso_language_code")
    @Expose
    private String isoLanguageCode;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("since_id")
    @Expose
    private int sinceId;
    @SerializedName("max_id")
    @Expose
    private int maxId;
    @SerializedName("refresh_url")
    @Expose
    private String refreshUrl;
    @SerializedName("results_per_page")
    @Expose
    private int resultsPerPage;
    @SerializedName("next_page")
    @Expose
    private String nextPage;
    @SerializedName("completed_in")
    @Expose
    private float completedIn;
    @SerializedName("page")
    @Expose
    private int page;
    @SerializedName("query")
    @Expose
    private String query;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public int getRecentRetweets() {
        return recentRetweets;
    }

    public void setRecentRetweets(int recentRetweets) {
        this.recentRetweets = recentRetweets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getIsoLanguageCode() {
        return isoLanguageCode;
    }

    public void setIsoLanguageCode(String isoLanguageCode) {
        this.isoLanguageCode = isoLanguageCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getSinceId() {
        return sinceId;
    }

    public void setSinceId(int sinceId) {
        this.sinceId = sinceId;
    }

    public int getMaxId() {
        return maxId;
    }

    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public float getCompletedIn() {
        return completedIn;
    }

    public void setCompletedIn(float completedIn) {
        this.completedIn = completedIn;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Example{" +
                "text='" + text + '\'' +
                ", toUserId=" + toUserId +
                ", toUser='" + toUser + '\'' +
                ", fromUser='" + fromUser + '\'' +
                ", resultType='" + resultType + '\'' +
                ", recentRetweets=" + recentRetweets +
                ", id=" + id +
                ", fromUserId=" + fromUserId +
                ", isoLanguageCode='" + isoLanguageCode + '\'' +
                ", source='" + source + '\'' +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", sinceId=" + sinceId +
                ", maxId=" + maxId +
                ", refreshUrl='" + refreshUrl + '\'' +
                ", resultsPerPage=" + resultsPerPage +
                ", nextPage='" + nextPage + '\'' +
                ", completedIn=" + completedIn +
                ", page=" + page +
                ", query='" + query + '\'' +
                '}';
    }
}


