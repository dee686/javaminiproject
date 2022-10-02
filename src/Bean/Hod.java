package Bean;

public class Hod {
    String HodName="Deepak";
    String HodEmail="Deepak@hod.com";
    String HodPassword="Hod@123";

    String Address="Delhi";

    public Hod() {
    }

    public Hod(String hodName, String hodEmail, String hodPassword, String address) {
        HodName = hodName;
        HodEmail = hodEmail;
        HodPassword = hodPassword;
        Address = address;
    }

    @Override
    public String toString() {
        return "Hod{" +
                "HodName='" + HodName + '\'' +
                ", HodEmail='" + HodEmail + '\'' +
                ", HodPassword='" + HodPassword + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}