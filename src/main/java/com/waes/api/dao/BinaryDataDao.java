package com.waes.api.dao;

import com.google.common.base.Preconditions;
import com.waes.api.controller.DiffRequest;
import com.waes.api.dto.BinaryDataComparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

/**
 * All MongoDB operations are done in this class
 *
 * @author Vivinraj Sundararaj
 */
@Component
public class BinaryDataDao {

    @Autowired
    private BinaryDataRepository repository;

    /**
     * Create Object in DB for the given ID, if object exists in BD just update left
     * value
     *
     * @param id      ID to store data
     * @param request request object from controller
     * @return Saved/Updated Object
     */
    public BinaryDataComparison saveOrUpdateLeft(final Integer id, DiffRequest request) {

        Preconditions.checkArgument(id != null, "id parameter must not be null");
        Preconditions.checkArgument(request != null, "id parameter must not be null");

        BinaryDataComparison savedObject;
        Optional<BinaryDataComparison> optional = repository.findById(id);

        if (optional == null || !optional.isPresent()) {
            BinaryDataComparison bdc = BinaryDataComparison.builder().id(id).left(request.getId()).build();
            savedObject = repository.save(bdc);
        } else {
            optional.get().setLeft(request.getId());
            savedObject = repository.save(optional.get());
        }
        return savedObject;
    }

    /**
     * Create Object in DB for the given ID, if object exists in BD just update
     * right value
     *
     * @param id      ID to store data
     * @param request request object from controller
     * @return Saved/Updated Object
     */
    public BinaryDataComparison saveOrUpdateRight(final Integer id, DiffRequest request) {

        Preconditions.checkArgument(id != null, "id parameter must not be null");
        Preconditions.checkArgument(request != null, "id parameter must not be null");

        BinaryDataComparison savedObject;
        Optional<BinaryDataComparison> optional = repository.findById(id);

        if (optional == null || !optional.isPresent()) {
            BinaryDataComparison bdc = BinaryDataComparison.builder().id(id).right(request.getId()).build();
            savedObject = repository.save(bdc);
        } else {
            optional.get().setRight(request.getId());
            savedObject = repository.save(optional.get());
        }
        return savedObject;
    }

    /**
     * Obtain the Diff object from DB
     *
     * @param id identifier in DB
     * @return Optional wrapper with object if found
     */
    public Optional<BinaryDataComparison> getDiff(final Integer id) {

        Preconditions.checkArgument(id != null, "id parameter must not be null");

        return repository.findById(id);
    }

}
