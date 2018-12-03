package com.example.makarumini.uber_clone.Common;

import com.example.makarumini.uber_clone.Remote.IGoogleAPI;
import com.example.makarumini.uber_clone.Remote.RetrofitClient;

/**
 * Created by MakaruMini on 11/26/18.
 */

public class Common {

    public static final String driver_tbl = "Conductores";
    public static final String user_driver_tbl = "InformacionDeConductores";
    public static final String user_pasanger_tbl = "InformacionDePasajeros";
    public static final String pick_request_tbl = "PickupRequest";

    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPLI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

}
