/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.demo.rest.test;

import org.junit.jupiter.api.Test;

public class RestEndpointIT {

    private static final String httpPort = System.getProperty("http.port");
    private static final String httpsPort = System.getProperty("https.port");

    @Test public void testGreeting() {
    }
}