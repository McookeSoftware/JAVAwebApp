
import java.util.Date;

/**
 *
 * @author matty
 */
public class ShippingInfo {

    private Integer cid;
    private String stock;
    private Date dateDeparture;
    private String origin;
    private String destination;
    private Date dateArrival;
// Shipping information Details
    /**
     *
     * @param cid
     * @param stock
     * @param dateDeparture
     * @param origin
     * @param destination
     * @param dateArrival
     */
    public ShippingInfo(Integer cid, String stock, Date dateDeparture, String origin,
            String destination, Date dateArrival) {
        this.cid = cid;
        this.stock = stock;
        this.dateDeparture = dateDeparture;
        this.origin = origin;
        this.destination = destination;
        this.dateArrival = dateArrival;

    }
// Getters and setters below that allows the varables to be inherited
    //they also hole paramters inside the methods.
    /**
     *
     */
    public ShippingInfo() {

    }

    /**
     *
     * @return
     */
    public Integer getcid() {
        return cid;
    }

    /**
     *
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     *
     * @return
     */
    public String getStock() {
        return stock;
    }

    /**
     *
     * @param Stock
     */
    public void setStock(String Stock) {
        this.stock = Stock;
    }

    /**
     *
     * @return
     */
    public Date getDateDeparture() {
        return dateDeparture;
    }

    /**
     *
     * @param DateDeparture
     */
    public void setDateDeparture(Date DateDeparture) {
        this.dateDeparture = DateDeparture;
    }

    /**
     *
     * @return
     */
    public String getOrigin() {
        return origin;
    }

    /**
     *
     * @param Origin
     */
    public void setOrigin(String Origin) {
        this.origin = Origin;
    }

    /**
     *
     * @return
     */
    public String getDestination() {
        return destination;
    }

    /**
     *
     * @param Destination
     */
    public void setDestination(String Destination) {
        this.destination = Destination;
    }

    /**
     *
     * @return
     */
    public Date getDateArrival() {
        return dateArrival;
    }

    /**
     *
     * @param DateArrival
     */
    public void setDateArrival(Date DateArrival) {
        this.dateArrival = DateArrival;
    }


}
