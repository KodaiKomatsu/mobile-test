package com.sap.mbtepmdemo.proxy;

public class SalesOrder
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property billingStatus = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("BillingStatus");

    public static final com.sap.cloud.server.odata.Property billingStatusDescription = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("BillingStatusDescription");

    public static final com.sap.cloud.server.odata.Property businessPartnerID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("BusinessPartnerID");

    public static final com.sap.cloud.server.odata.Property changedAt = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("ChangedAt");

    public static final com.sap.cloud.server.odata.Property createdAt = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("CreatedAt");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("CurrencyCode");

    public static final com.sap.cloud.server.odata.Property customerID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("CustomerID");

    public static final com.sap.cloud.server.odata.Property customerName = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("CustomerName");

    public static final com.sap.cloud.server.odata.Property deliveryStatus = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("DeliveryStatus");

    public static final com.sap.cloud.server.odata.Property deliveryStatusDescription = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("DeliveryStatusDescription");

    public static final com.sap.cloud.server.odata.Property grossAmount = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("GrossAmount");

    public static final com.sap.cloud.server.odata.Property lifecycleStatus = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("LifecycleStatus");

    public static final com.sap.cloud.server.odata.Property lifecycleStatusDescription = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("LifecycleStatusDescription");

    public static final com.sap.cloud.server.odata.Property netAmount = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("NetAmount");

    public static final com.sap.cloud.server.odata.Property note = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("Note");

    public static final com.sap.cloud.server.odata.Property noteLanguage = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("NoteLanguage");

    public static final com.sap.cloud.server.odata.Property salesOrderID = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("SalesOrderID");

    public static final com.sap.cloud.server.odata.Property taxAmount = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("TaxAmount");

    public static final com.sap.cloud.server.odata.Property toBusinessPartner = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.getProperty("ToBusinessPartner");

    public SalesOrder()
    {
        this(true, null);
    }

    public SalesOrder(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public SalesOrder(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder, withIndexMap);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder copy()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.copyEntity());
    }

    public String getBillingStatus()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.billingStatus));
    }

    public String getBillingStatusDescription()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.billingStatusDescription));
    }

    public long getBusinessPartnerID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.businessPartnerID));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getChangedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.changedAt));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getCreatedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.createdAt));
    }

    public String getCurrencyCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.currencyCode));
    }

    public String getCustomerID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.customerID));
    }

    public String getCustomerName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.customerName));
    }

    public String getDeliveryStatus()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.deliveryStatus));
    }

    public String getDeliveryStatusDescription()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.deliveryStatusDescription));
    }

    public java.math.BigDecimal getGrossAmount()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.grossAmount));
    }

    public String getLifecycleStatus()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.lifecycleStatus));
    }

    public String getLifecycleStatusDescription()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.lifecycleStatusDescription));
    }

    public java.math.BigDecimal getNetAmount()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.netAmount));
    }

    public String getNote()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.note));
    }

    public String getNoteLanguage()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.noteLanguage));
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getOld()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.getOldEntity());
    }

    public long getSalesOrderID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.salesOrderID));
    }

    public java.math.BigDecimal getTaxAmount()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.taxAmount));
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getToBusinessPartner()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.getDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.toBusinessPartner));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long salesOrderID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("SalesOrderID", com.sap.cloud.server.odata.LongValue.of(salesOrderID));
    }

    public static com.sap.mbtepmdemo.proxy.SalesOrderList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.mbtepmdemo.proxy.SalesOrderList.share(from);
    }

    public void setBillingStatus(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.billingStatus, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setBillingStatusDescription(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.billingStatusDescription, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setBusinessPartnerID(final long value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.businessPartnerID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setChangedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.changedAt, value);
    }

    public void setCreatedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.createdAt, value);
    }

    public void setCurrencyCode(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.currencyCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCustomerID(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.customerID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCustomerName(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.customerName, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDeliveryStatus(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.deliveryStatus, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDeliveryStatusDescription(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.deliveryStatusDescription, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setGrossAmount(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.grossAmount, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setLifecycleStatus(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.lifecycleStatus, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLifecycleStatusDescription(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.lifecycleStatusDescription, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setNetAmount(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.netAmount, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setNote(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.note, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setNoteLanguage(final String value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.noteLanguage, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setSalesOrderID(final long value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.salesOrderID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setTaxAmount(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.taxAmount, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setToBusinessPartner(final com.sap.mbtepmdemo.proxy.BusinessPartner value)
    {
        this.setDataValue(com.sap.mbtepmdemo.proxy.SalesOrder.toBusinessPartner, value);
    }
}
