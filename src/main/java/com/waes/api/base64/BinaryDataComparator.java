package com.waes.api.base64;
import com.waes.api.dto.DiffResult;

/**
 * Base class for Binary data comparators, in case we want to add other
 * implementations
 *
 * @author Vivinraj Sundararaj
 */
public abstract class BinaryDataComparator {

    /**
     * Compare base64 strings, check size, and mismatching offsets
     *
     * @param left  base64 String
     * @param right base64 String
     * @return DiffResult object with the comparison results
     */
    abstract DiffResult compareBinaries(final String left, final String right);
}
