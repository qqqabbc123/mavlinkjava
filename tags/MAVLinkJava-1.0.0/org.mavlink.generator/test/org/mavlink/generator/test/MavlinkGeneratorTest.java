/**
 * $Id$
 * $Date$
 *
 * ======================================================
 * Copyright (C) 2012 Guillaume Helle.
 * Project : MAVLINK Java
 * Module : org.mavlink.generator
 * File : org.mavlink.generator.test.MavlinkGeneratorTest.java
 * Author : ghelle
 *
 * ======================================================
 * HISTORY
 * Who       yyyy/mm/dd   Action
 * --------  ----------   ------
 * ghelle	10 avr. 2013		Create
 * 
 * ====================================================================
 * Licence: ${licence}
 * ====================================================================
 */

package org.mavlink.generator.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.mavlink.generator.MAVLinkGenerator;

/**
 * @author ghelle
 * @version $Rev$
 *
 */
public class MavlinkGeneratorTest {

    /**
     * Test method for {@link org.mavlink.generator.MAVLinkGenerator#main(java.lang.String[])}.
     */
    @Test
    public void testMain() {
        try {
            String[] args = { "test\\ardupilotmega.xml", "../org.mavlink.library/generated/", "true", "true", "true", "true" };
            MAVLinkGenerator.main(args);
        }
        catch (Exception e) {
            fail("ERROR : " + e);
        }
    }

}
