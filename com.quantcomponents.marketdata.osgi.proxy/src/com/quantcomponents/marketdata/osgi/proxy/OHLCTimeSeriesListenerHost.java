/*******************************************************************************
 * Copyright (c) 2013 Luigi Sgro. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Luigi Sgro - initial API and implementation
 ******************************************************************************/
package com.quantcomponents.marketdata.osgi.proxy;

import java.util.Date;

import com.quantcomponents.core.osgi.SeriesListenerHost;
import com.quantcomponents.marketdata.IOHLCPoint;
import com.quantcomponents.marketdata.osgi.IOHLCTimeSeriesListenerHost;
import com.quantcomponents.marketdata.osgi.IOHLCTimeSeriesListenerHostLocal;

public class OHLCTimeSeriesListenerHost extends SeriesListenerHost<Date, Double, IOHLCPoint> implements IOHLCTimeSeriesListenerHost, IOHLCTimeSeriesListenerHostLocal {}
