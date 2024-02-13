package com.sap.mbtepmdemo.proxy;

public abstract class ComSapMbtepmdemoServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.resolve();

    public static final com.sap.cloud.server.odata.MetadataLock lock = new com.sap.cloud.server.odata.MetadataLock();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.registerAll();
        com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.immortalize();
    }

    public abstract static class ComplexTypes
    {
        public static final com.sap.cloud.server.odata.ComplexType ctAddress = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getComplexType("com.sap.mbtepmdemo.CT_Address");
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType businessPartner = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("com.sap.mbtepmdemo.BusinessPartner");

        public static final com.sap.cloud.server.odata.EntityType businessPartnerFilter = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("com.sap.mbtepmdemo.BusinessPartnerFilter");

        public static final com.sap.cloud.server.odata.EntityType clientRegistration = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("com.sap.mbtepmdemo.ClientRegistration");

        public static final com.sap.cloud.server.odata.EntityType salesOrder = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("com.sap.mbtepmdemo.SalesOrder");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet businessPartnerFilterSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("BusinessPartnerFilterSet");

        public static final com.sap.cloud.server.odata.EntitySet businessPartnerSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("BusinessPartnerSet");

        public static final com.sap.cloud.server.odata.EntitySet clientRegistrationSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("ClientRegistrationSet");

        public static final com.sap.cloud.server.odata.EntitySet salesOrderSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("SalesOrderSet");
    }
}
