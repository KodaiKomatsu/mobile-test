package com.sap.mbtepmdemo.proxy;

public class BusinessPartner
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property addressType = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("AddressType");

    public static final com.sap.cloud.server.odata.Property building = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("Building");

    public static final com.sap.cloud.server.odata.Property city = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("City");

    public static final com.sap.cloud.server.odata.Property country = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property postalCode = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property street = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("Street");

    public static final com.sap.cloud.server.odata.Property businessPartnerID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("BusinessPartnerID");

    public static final com.sap.cloud.server.odata.Property businessPartnerRole = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("BusinessPartnerRole");

    public static final com.sap.cloud.server.odata.Property companyName = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("CompanyName");

    public static final com.sap.cloud.server.odata.Property faxNumber = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("FaxNumber");

    public static final com.sap.cloud.server.odata.Property legalForm = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("LegalForm");

    public static final com.sap.cloud.server.odata.Property phoneNumber = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("PhoneNumber");

    public static final com.sap.cloud.server.odata.Property toSalesOrders = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("ToSalesOrders");

    public BusinessPartner()
    {
        this(true, null);
    }

    public BusinessPartner(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public BusinessPartner(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner, withIndexMap);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner copy()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.copyEntity());
    }

    public String getAddressType()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.addressType));
    }

    public String getBuilding()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.building));
    }

    public long getBusinessPartnerID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.businessPartnerID));
    }

    public String getBusinessPartnerRole()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.businessPartnerRole));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.city));
    }

    public String getCompanyName()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.companyName));
    }

    public String getCountry()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.country));
    }

    public String getFaxNumber()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.faxNumber));
    }

    public String getLegalForm()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.legalForm));
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getOld()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.getOldEntity());
    }

    public String getPhoneNumber()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.phoneNumber));
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.postalCode));
    }

    public String getStreet()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.street));
    }

    public com.sap.mbtepmdemo.proxy.SalesOrderList getToSalesOrders()
    {
        return com.sap.mbtepmdemo.proxy.SalesOrderList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.toSalesOrders)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long businessPartnerID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("BusinessPartnerID", com.sap.cloud.server.odata.LongValue.of(businessPartnerID));
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.mbtepmdemo.proxy.BusinessPartnerList.share(from);
    }

    public void setAddressType(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.addressType, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setBuilding(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.building, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setBusinessPartnerID(final long value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.businessPartnerID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setBusinessPartnerRole(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.businessPartnerRole, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.city, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCompanyName(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.companyName, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCountry(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.country, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setFaxNumber(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.faxNumber, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setLegalForm(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.legalForm, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPhoneNumber(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.phoneNumber, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.postalCode, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setStreet(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.BusinessPartner.street, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setToSalesOrders(final com.sap.mbtepmdemo.proxy.SalesOrderList value)
    {
        com.sap.mbtepmdemo.proxy.BusinessPartner.toSalesOrders.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
