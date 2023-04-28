/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package com.demo.rest.test;

import org.junit.jupiter.api.Test;

public class RestEndpointIT {

    private static final String httpPort = System.getProperty("http.port");
    private static final String httpsPort = System.getProperty("https.port");

    @Test public void testGreeting() {
    }
}
