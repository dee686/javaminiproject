package Bean;

public class Complain {

    int ComplainId;
    String CName;
    String Category;

    public Complain() {
    }

    public Complain(int complainId, String CName, String category) {
        ComplainId = complainId;
        this.CName = CName;
        Category = category;
    }

    public int getComplainId() {
        return ComplainId;
    }

    public void setComplainId(int complainId) {
        ComplainId = complainId;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCategory() {
        return Category;
    }

    @Override
    public String toString() {
        return "Complain{" +
                "ComplainId=" + ComplainId +
                ", CName='" + CName + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }

    public void setCategory(String category) {
        Category = category;
    }
}
