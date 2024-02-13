package com.sap.mbtepmdemo.proxy.internal;

public abstract class Any_as_com_sap_mbtepmdemo_proxy_SalesOrder
{
    public static com.sap.mbtepmdemo.proxy.SalesOrder cast(final Object value)
    {
        if (value instanceof com.sap.mbtepmdemo.proxy.SalesOrder)
        {
            final com.sap.mbtepmdemo.proxy.SalesOrder var_value = ((com.sap.mbtepmdemo.proxy.SalesOrder)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.mbtepmdemo.proxy.SalesOrder");
        }
    }
}
