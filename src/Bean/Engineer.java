package Bean;

public class Engineer {
    int EngId;
    String EngName;
    String EngEmail;
    String EngPassword;

    String EngCategory;
    public Engineer() {
    }

    public Engineer(int engId, String engName, String engEmail, String engPassword, String engCategory) {
        EngId = engId;
        EngName = engName;
        EngEmail = engEmail;
        EngPassword = engPassword;
        EngCategory = engCategory;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "EngId=" + EngId +
                ", EngName='" + EngName + '\'' +
                ", EngEmail='" + EngEmail + '\'' +
                ", EngPassword='" + EngPassword + '\'' +
                ", EngCategory='" + EngCategory + '\'' +
                '}';
    }

    public int getEngId() {
        return EngId;
    }

    public void setEngId(int engId) {
        EngId = engId;
    }

    public String getEngName() {
        return EngName;
    }

    public void setEngName(String engName) {
        EngName = engName;
    }

    public String getEngEmail() {
        return EngEmail;
    }

    public void setEngEmail(String engEmail) {
        EngEmail = engEmail;
    }

    public String getEngPassword() {
        return EngPassword;
    }

    public void setEngPassword(String engPassword) {
        EngPassword = engPassword;
    }

    public String getEngCategory() {
        return EngCategory;
    }

    public void setEngCategory(String engCategory) {
        EngCategory = engCategory;
    }





}
