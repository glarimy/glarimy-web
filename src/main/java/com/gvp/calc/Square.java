package com.gvp.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square {
    private static final Logger logger = LoggerFactory.getLogger(Square.class);
    public int findSquareOf(int number){
        logger.debug("Finding the square of " + number);
        int sq = number+number;
        logger.debug("Returning " + sq);
        return sq;
    }
}
