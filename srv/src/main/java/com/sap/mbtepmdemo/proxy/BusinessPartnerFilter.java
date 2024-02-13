package com.sap.mbtepmdemo.proxy;

public class BusinessPartnerFilter
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property countryFilter = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter.getProperty("CountryFilter");

    public static final com.sap.cloud.server.odata.Property filterID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter.getProperty("FilterID");

    public BusinessPartnerFilter()
    {
        this(true, null);
    }

    public BusinessPartnerFilter(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public BusinessPartnerFilter(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter, withIndexMap);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter copy()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.copyEntity());
    }

    public String getCountryFilter()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartnerFilter.countryFilter));
    }

    public long getFilterID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartnerFilter.filterID));
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getOld()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long filterID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("FilterID", com.sap.cloud.server.odata.LongValue.of(filterID));
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList.share(from);
    }

    public void setCountryFilter(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartnerFilter.countryFilter, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setFilterID(final long value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartnerFilter.filterID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
