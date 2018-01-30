package com.bala.GamePool.db.entity.util;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;


/**
 * @author Balaji Achanta
 */
@Service
public class NextSequenceService {
    @Autowired 
    private MongoOperations mongoOpr;

    public long getNextSequence(String seqName)
    {
    	
        CustomSequences counter = mongoOpr.findAndModify(
            query(where("_id").is(seqName)),
            new Update().inc("sequence",1),
            options().returnNew(true).upsert(true),
            CustomSequences.class);
        return counter.getSequence();
    }
}