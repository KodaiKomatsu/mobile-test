package com.sap.mbtepmdemo.proxy.internal;

public abstract class Any_asNullable_com_sap_mbtepmdemo_proxy_ClientRegistration
{
    public static com.sap.mbtepmdemo.proxy.ClientRegistration cast(final Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof com.sap.mbtepmdemo.proxy.ClientRegistration)
        {
            final com.sap.mbtepmdemo.proxy.ClientRegistration var2_value = ((com.sap.mbtepmdemo.proxy.ClientRegistration)value);
            return var2_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.mbtepmdemo.proxy.ClientRegistration");
        }
    }
}
