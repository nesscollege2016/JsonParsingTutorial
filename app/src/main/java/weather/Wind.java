
package weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class Wind {

    @SerializedName("speed")
    @Expose
    private Integer speed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param speed
     */
    public Wind(Integer speed) {
        this.speed = speed;
    }

    /**
     * 
     * @return
     *     The speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

}
