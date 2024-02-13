package com.sap.mbtepmdemo.proxy;

public abstract class ComSapMbtepmdemoServiceManager
{
    private static com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService service_;

    public static com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService getService()
    {
        synchronized (ComSapMbtepmdemoServiceManager.class)
        {
            return ((com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService)com.sap.cloud.server.odata.core.CheckProperty.isDefined(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceManager.class, "service (static)", com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceManager.service_));
        }
    }

    public static void setService(final com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService value)
    {
        synchronized (ComSapMbtepmdemoServiceManager.class)
        {
            com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceManager.service_ = value;
        }
    }
}
