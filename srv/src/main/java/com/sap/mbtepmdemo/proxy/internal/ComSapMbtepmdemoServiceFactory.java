package com.sap.mbtepmdemo.proxy.internal;

public abstract class ComSapMbtepmdemoServiceFactory
{
    public static void registerAll()
    {
        com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.registerFactory(new com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateCTAddress());
        com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.registerFactory(new com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateBusinessPartner());
        com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter.registerFactory(new com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateBusinessPartnerFilter());
        com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.registerFactory(new com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateClientRegistration());
        com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.registerFactory(new com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateSalesOrder());
    }

    public static class CreateCTAddress
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.mbtepmdemo.proxy.CTAddress(false);
        }
    }

    public static class CreateBusinessPartner
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.mbtepmdemo.proxy.BusinessPartner(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.mbtepmdemo.proxy.BusinessPartner(false, indexMap);
        }
    }

    public static class CreateBusinessPartnerFilter
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.mbtepmdemo.proxy.BusinessPartnerFilter(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.mbtepmdemo.proxy.BusinessPartnerFilter(false, indexMap);
        }
    }

    public static class CreateClientRegistration
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.mbtepmdemo.proxy.ClientRegistration(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.mbtepmdemo.proxy.ClientRegistration(false, indexMap);
        }
    }

    public static class CreateSalesOrder
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.mbtepmdemo.proxy.SalesOrder(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.mbtepmdemo.proxy.SalesOrder(false, indexMap);
        }
    }
}
