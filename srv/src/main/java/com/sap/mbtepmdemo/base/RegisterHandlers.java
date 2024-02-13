// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.sap.mbtepmdemo.base;

import com.sap.cloud.server.odata.*;

public class RegisterHandlers {
    public static EntityHandler handler_BusinessPartner;
    public static EntityHandler handler_BusinessPartnerFilter;
    public static EntityHandler handler_ClientRegistration;
    public static EntityHandler handler_SalesOrder;

    public static void withServlet(com.sap.mbtepmdemo.MainServlet servlet) {
        com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService service = (com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService)servlet.getBackendService();
        handler_SalesOrder = new com.sap.mbtepmdemo.handler.SalesOrderHandler(servlet, service);
        handler_ClientRegistration = new com.sap.mbtepmdemo.handler.ClientRegistrationHandler(servlet, service);
        handler_BusinessPartnerFilter = new com.sap.mbtepmdemo.handler.BusinessPartnerFilterHandler(servlet, service);
        handler_BusinessPartner = new com.sap.mbtepmdemo.handler.BusinessPartnerHandler(servlet, service);
        servlet.registerEntityHandler(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder, handler_SalesOrder);
        servlet.registerEntityHandler(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration, handler_ClientRegistration);
        servlet.registerEntityHandler(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter, handler_BusinessPartnerFilter);
        servlet.registerEntityHandler(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner, handler_BusinessPartner);
    }

    public static void startRefresh(com.sap.mbtepmdemo.MainServlet servlet) {
        servlet.startCacheRefreshThread(handler_SalesOrder, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.salesOrderSet, servlet.shutdown);
        servlet.startCacheRefreshThread(handler_BusinessPartner, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.businessPartnerSet, servlet.shutdown);
    }
}
