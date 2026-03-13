package Excise5;
public class Feedback {
    // 私有变量（按题目要求）
    private String firstName;
    private String lastName;
    private String email;
    private String completeFeedback;
    private int reviewID;
    private boolean longFeedback;

    // 无参构造
    public Feedback() {
    }

    public Feedback(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void analyseFeedback(boolean isConcatenation, String sent1, String sent2, String sent3, String sent4, String sent5) {
        if (isConcatenation) {
            // 调用拼接方法，返回String
            this.completeFeedback = feedbackUsingConcatenation(sent1, sent2, sent3, sent4, sent5);
        } else {
            StringBuilder sb = feedbackUsingStringBuilder(sent1, sent2, sent3, sent4, sent5);
            this.completeFeedback = sb.toString();
        }
        this.longFeedback = checkFeedbackLength(this.completeFeedback);
        this.reviewID = createReviewID(this.firstName, this.lastName, this.completeFeedback);
    }

    // 字符串拼接
    private String feedbackUsingConcatenation(String sent1, String sent2, String sent3, String sent4, String sent5) {
        String concatenatedFeedback = sent1 + sent2 + sent3 + sent4 + sent5;
        return concatenatedFeedback;
    }

    private StringBuilder feedbackUsingStringBuilder(String sent1, String sent2, String sent3, String sent4, String sent5) {
        StringBuilder sb = new StringBuilder();
        sb.append(sent1).append(sent2).append(sent3).append(sent4).append(sent5);
        return sb;
    }

    private boolean checkFeedbackLength(String completeFeedback) {
        return completeFeedback.length() > 500;
    }

    private int createReviewID(String firstName, String lastName, String completeFeedback) {
        String namePart = (firstName + lastName).substring(2, 6).toUpperCase();
        String feedbackSub = completeFeedback.substring(10, 15).toLowerCase();
        String idStr = namePart + feedbackSub + completeFeedback.length() + "_" + System.currentTimeMillis();
        //  移除所有空格
        idStr = idStr.replace(" ", "");
        return idStr.hashCode();
    }

    // 打印所有信息
    public String toString() {
        return "Feedback{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", completeFeedback='" + completeFeedback + '\'' +
                ", longFeedback=" + longFeedback +
                ", reviewID=" + reviewID +
                '}';
    }
}