/*******************************************************************************
 * Copyright (c) 2020, 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package com.demo.rest.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@Liveness
@ApplicationScoped
public class RestLivenessCheck implements HealthCheck {

  @Override
  public HealthCheckResponse call() {

    // if not live logic
    // return HealthCheckResponse.down(this.getClass().getSimpleName());
    return HealthCheckResponse
            .up(this.getClass().getSimpleName());
  }
}
