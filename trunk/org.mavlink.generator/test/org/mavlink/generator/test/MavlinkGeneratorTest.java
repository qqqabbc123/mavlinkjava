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

import java.io.File;

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
            String[] args = { "test" + File.separator + "ja4rtor.xml",
                             ".." + File.separator + "org.mavlink.library" + File.separator + "generated" + File.separator + "", "true", "true",
                             "true", "true" };
            MAVLinkGenerator.main(args);
        }
        catch (Exception e) {
            fail("ERROR : " + e);
        }
    }

}
