package SpringOnWeb.BuildingSpringWebApplication.Spittr;

import java.util.Date;

/**
 * Created by congzihan on 17/1/3.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date date;
    private Double latitude;
    private Double longitude;

    public Spittle(String message, Date date) {
        this(null, message, date, null, null);
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Spittle(Long id, String message, Date date, Double latitude, Double longitude) {
        this.id = null;

        this.message = message;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }


}
