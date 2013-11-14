package com.mabetle.mhrs.pages;

import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 * Start page of application mhrs.
 */
public class Index
{
    @InjectComponent
    private Zone zone;

    @Inject
    private AlertManager alertManager;

}
