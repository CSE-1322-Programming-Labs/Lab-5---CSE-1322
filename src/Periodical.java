public class Periodical extends Item{
    private int issueNum;

    Periodical(){
    }

    Periodical(int issueNum,String title){
        super(title);
        this.issueNum = issueNum;
    }


    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    public String getListing() {
        return "Periodical Title - "+getTitle()+"\nIssue# - "+issueNum;
    }
}
