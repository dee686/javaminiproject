package Bean;

public class EngineerComplainDTO {

    int Enid;
    String EnName;
    String EnCategory;
    int EComplainId;
    String ComplainStatus;

    public EngineerComplainDTO() {
    }

    public EngineerComplainDTO(int enid, String enName, String enCategory, int EComplainId, String complainStatus) {
        Enid = enid;
        EnName = enName;
        EnCategory = enCategory;
        this.EComplainId = EComplainId;
        ComplainStatus = complainStatus;
    }

    @Override
    public String toString() {
        return "EngineerComplainDTO{" +
                "Enid=" + Enid +
                ", EnName='" + EnName + '\'' +
                ", EnCategory='" + EnCategory + '\'' +
                ", EComplainId=" + EComplainId +
                ", ComplainStatus='" + ComplainStatus + '\'' +
                '}';
    }

    public int getEnid() {
        return Enid;
    }

    public void setEnid(int enid) {
        Enid = enid;
    }

    public String getEnName() {
        return EnName;
    }

    public void setEnName(String enName) {
        EnName = enName;
    }

    public String getEnCategory() {
        return EnCategory;
    }

    public void setEnCategory(String enCategory) {
        EnCategory = enCategory;
    }

    public int getEComplainId() {
        return EComplainId;
    }

    public void setEComplainId(int EComplainId) {
        this.EComplainId = EComplainId;
    }

    public String getComplainStatus() {
        return ComplainStatus;
    }

    public void setComplainStatus(String complainStatus) {
        ComplainStatus = complainStatus;
    }
}
