/*
 * Copyright 2013 Carnegie Mellon University.
 * Portions Copyright 2004 Sun Microsystems, Inc.
 * Portions Copyright 2004 Mitsubishi Electric Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 */

package edu.cmu.sphinx.api;

import javax.sound.sampled.Mixer;


public class SpeechSourceProvider {

    Microphone getMicrophone() {
        return new Microphone(16000, 16, true, false);
    }
    
    /**
     * Created a microphone from the provided mixerInfo object with the default configuration.
     * @param mixerinfo
     * @return the microphone object obtained from the provided mixer or NULL if configuration is not supported.
     * @see edu.cmu.sphinx.frontend.util.StreamDataSource
     */
    Microphone getMicrophone(Mixer.Info mixerinfo) {
        return new Microphone(mixerinfo, 16000, 16, true, false);
    }
}
