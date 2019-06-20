package org.raspen.sqlitetest.Utils;

import java.util.*;


public enum State {
    ALABAMA("Alabama", "AL"),
    ALASKA("Alaska", "AK"),
    ARIZONA("Arizona", "AZ"),
    ARKANSAS("Arkansas", "AR"),
    CALIFORNIA("California", "CA"),
    COLORADO("Colorado", "CO"),
    CONNECTICUT("Connecticut", "CT"),
    DELAWARE("Delaware", "DE"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC"),
    FLORIDA("Florida", "FL"),
    GEORGIA("Georgia", "GA"),
    HAWAII("Hawaii", "HI"),
    IDAHO("Idaho", "ID"),
    ILLINOIS("Illinois", "IL"),
    INDIANA("Indiana", "IN"),
    IOWA("Iowa", "IA"),
    KANSAS("Kansas", "KS"),
    KENTUCKY("Kentucky", "KY"),
    LOUISIANA("Louisiana", "LA"),
    MAINE("Maine", "ME"),
    MARYLAND("Maryland", "MD"),
    MASSACHUSETTS("Massachusetts", "MA"),
    MICHIGAN("Michigan", "MI"),
    MINNESOTA("Minnesota", "MN"),
    MISSISSIPPI("Mississippi", "MS"),
    MISSOURI("Missouri", "MO"),
    MONTANA("Montana", "MT"),
    NEBRASKA("Nebraska", "NE"),
    NEVADA("Nevada", "NV"),
    NEW_HAMPSHIRE("New Hampshire", "NH"),
    NEW_JERSEY("New Jersey", "NJ"),
    NEW_MEXICO("New Mexico", "NM"),
    NEW_YORK("New York", "NY"),
    NORTH_CAROLINA("North Carolina", "NC"),
    NORTH_DAKOTA("North Dakota", "ND"),
    OHIO("Ohio", "OH"),
    OKLAHOMA("Oklahoma", "OK"),
    OREGON("Oregon", "OR"),
    PENNSYLVANIA("Pennsylvania", "PA"),
    PUERTO_RICO("Puerto Rico", "PR"),
    RHODE_ISLAND("Rhode Island", "RI"),
    SOUTH_CAROLINA("South Carolina", "SC"),
    SOUTH_DAKOTA("South Dakota", "SD"),
    TENNESSEE("Tennessee", "TN"),
    TEXAS("Texas", "TX"),
    UTAH("Utah", "UT"),
    VERMONT("Vermont", "VT"),
    VIRGINIA("Virginia", "VA"),
    WASHINGTON("Washington", "WA"),
    WEST_VIRGINIA("West Virginia", "WV"),
    WISCONSIN("Wisconsin", "WI"),
    WYOMING("Wyoming", "WY"),
    UNKNOWN("Unknown", "");

    private String name;
    private String code;

    State(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    private static final Map<String, State> STATES_BY_ABBR = new HashMap<String, State>();

    static {
        for (State state : values()) {
            if(state != State.UNKNOWN) {
                STATES_BY_ABBR.put(state.getCode(), state);
            }
        }
    }

    public static State getByCode(String code) {
        final State state = STATES_BY_ABBR.get(code);
        if (state != null) {
            return state;
        } else {
            return UNKNOWN;
        }
    }

    public static State getByName(String name) {
        final String enumName = name.toUpperCase().replaceAll(" ", "_");
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return State.UNKNOWN;
        }
    }

    public static List<State> getAll() {
        return new ArrayList<State>(STATES_BY_ABBR.values());
    }


    @Override
    public String toString() {
        return name;
    }


    public static State getRandom() {
        List<State> valuesList = new ArrayList<State>(STATES_BY_ABBR.values());
        int randomIndex = new Random().nextInt(valuesList.size());
        State randomValue = valuesList.get(randomIndex);
        return randomValue;
    }


}
