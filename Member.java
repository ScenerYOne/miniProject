public class Member {
    private String memberID;
    private String memberName;

    public Member() {
    }

    public Member(String memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName(){
        return memberName;
    }

    public String toString() {
        return "MemberName : "+getMemberName()+
                "\nMemberID"+getMemberID()+"\n";
    }
}