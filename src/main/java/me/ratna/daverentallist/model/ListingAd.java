package me.ratna.daverentallist.model;

public class ListingAd {
    private long id;
    private String description;
    private String rules;
    private boolean hasWifi;
    private String cable;
    private boolean isRented;
    private boolean hasPrivateBath;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public boolean isHasPrivateBath() {
        return hasPrivateBath;
    }

    public void setHasPrivateBath(boolean hasPrivateBath) {
        this.hasPrivateBath = hasPrivateBath;
    }

    ;


}


