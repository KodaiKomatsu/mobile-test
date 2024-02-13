package com.sap.mbtepmdemo.proxy.internal;

public abstract class Any_as_com_sap_mbtepmdemo_proxy_CTAddress
{
    public static com.sap.mbtepmdemo.proxy.CTAddress cast(final Object value)
    {
        if (value instanceof com.sap.mbtepmdemo.proxy.CTAddress)
        {
            final com.sap.mbtepmdemo.proxy.CTAddress var_value = ((com.sap.mbtepmdemo.proxy.CTAddress)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.mbtepmdemo.proxy.CTAddress");
        }
    }
}
