// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package com.sap.mbtepmdemo.handler;

import com.sap.cloud.server.odata.*;

public class ClientRegistrationHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.mbtepmdemo.MainServlet servlet;
    private com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService service;

    public ClientRegistrationHandler(com.sap.mbtepmdemo.MainServlet servlet, com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeQuery(DataQuery query) {
        query.filter(com.sap.mbtepmdemo.proxy.ClientRegistration.clientGUID.equal(servlet.getClientGUID()));
        EntityValueList result = service.executeQuery(query).getEntityList();
        EntityValue entity = result.isEmpty() ? null : result.single();
        if (entity != null) servlet.provider.updateClientExpiry(entity);
        return result;
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.sap.mbtepmdemo.proxy.ClientRegistration entity = (com.sap.mbtepmdemo.proxy.ClientRegistration)entityValue;
        GuidValue guid = servlet.getClientGUID();
        ListBase existing = service.getClientRegistrationSet(new DataQuery().filter(com.sap.mbtepmdemo.proxy.ClientRegistration.clientGUID.equal(guid)));
        if (existing.length() > 0) throw DataServiceException.withStatus(409, "Duplicate client registration for Client-Instance-ID: " + guid).safe();
        entity.setClientGUID(guid);
        entity.setAuthorizedUser(servlet.currentUserIfAuthenticated());
        service.createEntity(entity);
        servlet.provider.createClientExpiry(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.sap.mbtepmdemo.proxy.ClientRegistration entity = (com.sap.mbtepmdemo.proxy.ClientRegistration)entityValue;
        entity.setMustBeModified(true);
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.sap.mbtepmdemo.proxy.ClientRegistration entity = (com.sap.mbtepmdemo.proxy.ClientRegistration)entityValue;
        service.deleteEntity(entity);
    }
}
