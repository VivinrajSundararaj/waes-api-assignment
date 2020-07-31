package com.waes.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Set;

/**
 * Response object that holds all related data shown to the user after
 * requesting a difference operation
 *
 * @author Vivinraj Sundararaj
 *
 */
@Data
@AllArgsConstructor
public class DiffResult {
    private boolean match;
    private boolean sizeMismatch;
    private Set<Integer> mismatchOffsets;
}
