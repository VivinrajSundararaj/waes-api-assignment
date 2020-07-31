package com.waes.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Data Object for MongoDB
 *
 * @author Vivinraj Sundararaj
 */

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BinaryDataComparison {

    @Id
    private Integer id;

    private String left;

    private String right;

    private boolean compared;

    private boolean equal;
}
