package com.waes.api.controller;

import lombok.Data;

/**
 * Request Object that will hold the base64 data and can add more elements if
 * needed
 *
 * @author Vivinraj Sundararaj
 */

@Data
public class DiffRequest {
    // Base64 String with the data to be compared
    public String id;
}
