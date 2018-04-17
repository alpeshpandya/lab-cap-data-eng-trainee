package kafka.model;

import java.util.List;

public class Station {
    private String station_id;
    private Integer num_bikes_available;

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public void setNum_bikes_available(Integer num_bikes_available) {
        this.num_bikes_available = num_bikes_available;
    }

    public void setNum_ebikes_available(Integer num_ebikes_available) {
        this.num_ebikes_available = num_ebikes_available;
    }

    public void setNum_bikes_disabled(Integer num_bikes_disabled) {
        this.num_bikes_disabled = num_bikes_disabled;
    }

    public void setNum_docks_available(Integer num_docks_available) {
        this.num_docks_available = num_docks_available;
    }

    public void setNum_docks_disabled(Integer num_docks_disabled) {
        this.num_docks_disabled = num_docks_disabled;
    }

    public void setIs_installed(Integer is_installed) {
        this.is_installed = is_installed;
    }

    public void setIs_renting(Integer is_renting) {
        this.is_renting = is_renting;
    }

    public void setIs_returning(Integer is_returning) {
        this.is_returning = is_returning;
    }

    public void setLast_reported(Long last_reported) {
        this.last_reported = last_reported;
    }

    public void setEightd_has_available_keys(Boolean eightd_has_available_keys) {
        this.eightd_has_available_keys = eightd_has_available_keys;
    }

    private Integer num_ebikes_available;
    private Integer num_bikes_disabled;
    private Integer num_docks_available;
    private Integer num_docks_disabled;
    private Integer is_installed;

    public String getStation_id() {
        return station_id;
    }

    public Integer getNum_bikes_available() {
        return num_bikes_available;
    }

    public Integer getNum_ebikes_available() {
        return num_ebikes_available;
    }

    public Integer getNum_bikes_disabled() {
        return num_bikes_disabled;
    }

    public Integer getNum_docks_available() {
        return num_docks_available;
    }

    public Integer getNum_docks_disabled() {
        return num_docks_disabled;
    }

    public Integer getIs_installed() {
        return is_installed;
    }

    public Integer getIs_renting() {
        return is_renting;
    }

    public Integer getIs_returning() {
        return is_returning;
    }

    public Long getLast_reported() {
        return last_reported;
    }

    public Boolean getEightd_has_available_keys() {
        return eightd_has_available_keys;
    }

    private Integer is_renting;
    private Integer is_returning;
    private Long last_reported;
    private Boolean eightd_has_available_keys;
}
