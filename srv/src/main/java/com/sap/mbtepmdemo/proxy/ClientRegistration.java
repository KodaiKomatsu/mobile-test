package com.sap.mbtepmdemo.proxy;

public class ClientRegistration
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property authorizedUser = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.getProperty("AuthorizedUser");

    public static final com.sap.cloud.server.odata.Property clientGUID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.getProperty("ClientGUID");

    public static final com.sap.cloud.server.odata.Property clientID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.getProperty("ClientID");

    public ClientRegistration()
    {
        this(true, null);
    }

    public ClientRegistration(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public ClientRegistration(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration, withIndexMap);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration copy()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_ClientRegistration.cast(this.copyEntity());
    }

    public String getAuthorizedUser()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.ClientRegistration.authorizedUser));
    }

    public com.sap.cloud.server.odata.GuidValue getClientGUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castRequired(this.getDataValue(com.sap.mbtepmdemo.proxy.ClientRegistration.clientGUID));
    }

    public long getClientID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.ClientRegistration.clientID));
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getOld()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_ClientRegistration.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long clientID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("ClientID", com.sap.cloud.server.odata.LongValue.of(clientID));
    }

    public static com.sap.mbtepmdemo.proxy.ClientRegistrationList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.mbtepmdemo.proxy.ClientRegistrationList.share(from);
    }

    public void setAuthorizedUser(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.ClientRegistration.authorizedUser, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setClientGUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.ClientRegistration.clientGUID, value);
    }

    public void setClientID(final long value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.ClientRegistration.clientID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
