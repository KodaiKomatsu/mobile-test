package com.sap.mbtepmdemo.proxy.internal;

public abstract class Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner
{
    public static com.sap.mbtepmdemo.proxy.BusinessPartner cast(final Object value)
    {
        if (value instanceof com.sap.mbtepmdemo.proxy.BusinessPartner)
        {
            final com.sap.mbtepmdemo.proxy.BusinessPartner var_value = ((com.sap.mbtepmdemo.proxy.BusinessPartner)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.mbtepmdemo.proxy.BusinessPartner");
        }
    }
}
