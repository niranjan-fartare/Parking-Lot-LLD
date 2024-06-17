package Models;

public class User extends BaseModel {
    private String userName;
    private Vehicle userVehicle;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Vehicle getUserVehicle() {
        return userVehicle;
    }

    public void setUserVehicle(Vehicle userVehicle) {
        this.userVehicle = userVehicle;
    }
}
