
package weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class Rain {

    @SerializedName("1h")
    @Expose
    private Float _1h;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rain() {
    }

    /**
     * 
     * @param _1h
     */
    public Rain(Float _1h) {
        this._1h = _1h;
    }

    /**
     * 
     * @return
     *     The _1h
     */
    public Float get1h() {
        return _1h;
    }

    /**
     * 
     * @param _1h
     *     The 1h
     */
    public void set1h(Float _1h) {
        this._1h = _1h;
    }

}
