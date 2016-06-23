package ness.tomerbu.edu.jsonparsingtutorial;

public class Phone {

    private String mobile;
    private String home;
    private String office;

    @Override
    public String toString() {
        return "Phone{" +
                "mobile='" + mobile + '\'' +
                ", home='" + home + '\'' +
                ", office='" + office + '\'' +
                '}';
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Phone() {
    }

    /**
     * 
     * @param office
     * @param home
     * @param mobile
     */
    public Phone(String mobile, String home, String office) {
        this.mobile = mobile;
        this.home = home;
        this.office = office;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * @return
     *     The home
     */
    public String getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * 
     * @return
     *     The office
     */
    public String getOffice() {
        return office;
    }

    /**
     * 
     * @param office
     *     The office
     */
    public void setOffice(String office) {
        this.office = office;
    }

}
