package com.sap.mbtepmdemo.proxy;

public class CTAddress
    extends com.sap.cloud.server.odata.ComplexValue
{
    public static final com.sap.cloud.server.odata.Property addressType = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("AddressType");

    public static final com.sap.cloud.server.odata.Property building = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("Building");

    public static final com.sap.cloud.server.odata.Property city = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("City");

    public static final com.sap.cloud.server.odata.Property country = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property postalCode = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property street = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("Street");

    public CTAddress()
    {
        this(true, null);
    }

    public CTAddress(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public CTAddress(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress, withIndexMap);
    }

    public com.sap.mbtepmdemo.proxy.CTAddress copy()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(this.copyComplex());
    }

    public String getAddressType()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.CTAddress.addressType));
    }

    public String getBuilding()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.CTAddress.building));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.CTAddress.city));
    }

    public String getCountry()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.CTAddress.country));
    }

    public com.sap.mbtepmdemo.proxy.CTAddress getOld()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(this.getOldComplex());
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.CTAddress.postalCode));
    }

    public String getStreet()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.CTAddress.street));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.mbtepmdemo.proxy.CTAddressList list(final com.sap.cloud.server.odata.ComplexValueList from)
    {
        return com.sap.mbtepmdemo.proxy.CTAddressList.share(from);
    }

    public void setAddressType(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.CTAddress.addressType, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setBuilding(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.CTAddress.building, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.CTAddress.city, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCountry(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.CTAddress.country, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.CTAddress.postalCode, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setStreet(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.CTAddress.street, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
