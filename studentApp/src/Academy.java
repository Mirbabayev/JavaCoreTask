public class Academy {
    private String acadAddress;
    private String acadName;

    public Academy() {
    }

    public Academy(String acadAddress, String acadName) {
        this.acadAddress = acadAddress;
        this.acadName = acadName;
    }

    public String getAcadAddress() {
        return acadAddress;
    }

    public void setAcadAddress(String acadAddress) {
        this.acadAddress = acadAddress;
    }

    public String getAcadName() {
        return acadName;
    }

    public void setAcadName(String acadName) {
        this.acadName = acadName;
    }

    public void displayInfo() {
        System.out.println("Name: " + acadName + "\n" + "Address: " + acadAddress);
    }


}
