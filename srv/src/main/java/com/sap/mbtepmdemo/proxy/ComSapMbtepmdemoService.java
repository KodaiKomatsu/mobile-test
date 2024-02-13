package com.sap.mbtepmdemo.proxy;

public class ComSapMbtepmdemoService
    extends com.sap.cloud.server.odata.DataService
{
    public static final com.sap.cloud.server.odata.EntitySet businessPartnerFilterSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("BusinessPartnerFilterSet");

    public static final com.sap.cloud.server.odata.EntitySet businessPartnerSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("BusinessPartnerSet");

    public static final com.sap.cloud.server.odata.EntitySet clientRegistrationSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("ClientRegistrationSet");

    public static final com.sap.cloud.server.odata.EntitySet salesOrderSet = com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("SalesOrderSet");

    public ComSapMbtepmdemoService()
    {
        this(null);
    }

    public ComSapMbtepmdemoService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "ComSapMbtepmdemoService"));
        this.getProvider().setMetadata(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.document);
        com.sap.cloud.server.odata.ProxyInternal.setCsdlFetcher(this.getProvider(), null);
        com.sap.cloud.server.odata.ProxyInternal.setCsdlOptions(this.getProvider(), com.sap.mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.options);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartner(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBusinessPartner(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartner(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBusinessPartner(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartner(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.executeQuery(query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.businessPartnerSet), headers, options).getRequiredEntity());
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilter(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBusinessPartnerFilter(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilter(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBusinessPartnerFilter(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilter(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.executeQuery(query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.businessPartnerFilterSet), headers, options).getRequiredEntity());
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList getBusinessPartnerFilterSet()
    {
        return this.getBusinessPartnerFilterSet(null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList getBusinessPartnerFilterSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBusinessPartnerFilterSet(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList getBusinessPartnerFilterSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBusinessPartnerFilterSet(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList getBusinessPartnerFilterSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.mbtepmdemo.proxy.BusinessPartnerFilter.list(this.executeQuery(var_query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.businessPartnerFilterSet), headers, options).getEntityList());
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilterWithKey(final long filterID)
    {
        return this.getBusinessPartnerFilterWithKey(filterID, null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilterWithKey(final long filterID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBusinessPartnerFilterWithKey(filterID, query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilterWithKey(final long filterID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBusinessPartnerFilterWithKey(filterID, query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilter getBusinessPartnerFilterWithKey(final long filterID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBusinessPartnerFilter(var_query.withKey(com.sap.mbtepmdemo.proxy.BusinessPartnerFilter.key(filterID)), headers, options);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerList getBusinessPartnerSet()
    {
        return this.getBusinessPartnerSet(null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerList getBusinessPartnerSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBusinessPartnerSet(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerList getBusinessPartnerSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBusinessPartnerSet(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerList getBusinessPartnerSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.mbtepmdemo.proxy.BusinessPartner.list(this.executeQuery(var_query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.businessPartnerSet), headers, options).getEntityList());
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartnerWithKey(final long businessPartnerID)
    {
        return this.getBusinessPartnerWithKey(businessPartnerID, null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartnerWithKey(final long businessPartnerID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBusinessPartnerWithKey(businessPartnerID, query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartnerWithKey(final long businessPartnerID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBusinessPartnerWithKey(businessPartnerID, query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartner getBusinessPartnerWithKey(final long businessPartnerID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBusinessPartner(var_query.withKey(com.sap.mbtepmdemo.proxy.BusinessPartner.key(businessPartnerID)), headers, options);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistration()
    {
        return this.getClientRegistration(null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistration(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getClientRegistration(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistration(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getClientRegistration(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistration(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.mbtepmdemo.proxy.ClientRegistration client = com.sap.mbtepmdemo.proxy.internal.Any_asNullable_com_sap_mbtepmdemo_proxy_ClientRegistration.cast(this.executeQuery(var_query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.clientRegistrationSet), headers, options).getOptionalEntity());
        if (client == null)
        {
            final com.sap.mbtepmdemo.proxy.ClientRegistration newClient = new com.sap.mbtepmdemo.proxy.ClientRegistration();
            newClient.setClientGUID(com.sap.cloud.server.odata.GuidValue.random());
            return newClient;
        }
        else
        {
            return client;
        }
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistrationList getClientRegistrationSet()
    {
        return this.getClientRegistrationSet(null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistrationList getClientRegistrationSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getClientRegistrationSet(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistrationList getClientRegistrationSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getClientRegistrationSet(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistrationList getClientRegistrationSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.mbtepmdemo.proxy.ClientRegistration.list(this.executeQuery(var_query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.clientRegistrationSet), headers, options).getEntityList());
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID)
    {
        return this.getClientRegistrationWithKey(clientID, null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getClientRegistrationWithKey(clientID, query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getClientRegistrationWithKey(clientID, query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getClientRegistration(var_query.withKey(com.sap.mbtepmdemo.proxy.ClientRegistration.key(clientID)), headers, options);
    }

    @Override public com.sap.cloud.server.odata.MetadataLock getMetadataLock()
    {
        return com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.lock;
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrder(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSalesOrder(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrder(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSalesOrder(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrder(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.executeQuery(query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.salesOrderSet), headers, options).getRequiredEntity());
    }

    public com.sap.mbtepmdemo.proxy.SalesOrderList getSalesOrderSet()
    {
        return this.getSalesOrderSet(null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrderList getSalesOrderSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSalesOrderSet(query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrderList getSalesOrderSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSalesOrderSet(query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrderList getSalesOrderSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.mbtepmdemo.proxy.SalesOrder.list(this.executeQuery(var_query.fromDefault(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.salesOrderSet), headers, options).getEntityList());
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrderWithKey(final long salesOrderID)
    {
        return this.getSalesOrderWithKey(salesOrderID, null, null, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrderWithKey(final long salesOrderID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSalesOrderWithKey(salesOrderID, query, null, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrderWithKey(final long salesOrderID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSalesOrderWithKey(salesOrderID, query, headers, null);
    }

    public com.sap.mbtepmdemo.proxy.SalesOrder getSalesOrderWithKey(final long salesOrderID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getSalesOrder(var_query.withKey(com.sap.mbtepmdemo.proxy.SalesOrder.key(salesOrderID)), headers, options);
    }

    @Override public void refreshMetadata()
    {
        com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
    }
}
