package com.sap.mbtepmdemo.proxy.internal;

public abstract class ComSapMbtepmdemoServiceMetadataText
{
    public static final String XML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<edmx:Edmx Version=\"4.0\" xmlns:edmx=\"http://docs.oasis-open.org/odata/ns/edmx\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://docs.oasis-open.org/odata/ns/edmx http://docs.oasis-open.org/odata/odata/v4.0/os/schemas/edmx.xsd http://docs.oasis-open.org/odata/ns/edm http://docs.oasis-open.org/odata/odata/v4.0/os/schemas/edm.xsd\">\n<edmx:Reference Uri=\"https://oasis-tcs.github.io/odata-vocabularies/vocabularies/Org.OData.Core.V1.xml\">\n<edmx:Include Namespace=\"Org.OData.Core.V1\" Alias=\"Core\"/>\n</edmx:Reference>\n<edmx:Reference Uri=\"vocabularies/com.sap.cloud.server.odata.sql.v1.xml\">\n<edmx:Include Namespace=\"com.sap.cloud.server.odata.sql.v1\" Alias=\"SQL\"/>\n</edmx:Reference>\n<edmx:Reference Uri=\"vocabularies/com.sap.cloud.server.odata.cache.v1.xml\">\n<edmx:Include Namespace=\"com.sap.cloud.server.odata.cache.v1\" Alias=\"Cache\"/>\n</edmx:Reference>\n<edmx:Reference Uri=\"vocabularies/com.sap.cloud.server.odata.http.v1.xml\">\n<edmx:Include Namespace=\"com.sap.cloud.server.odata.http.v1\" Alias=\"HTTP\"/>\n</edmx:Reference>\n<edmx:DataServices>\n<Schema Namespace=\"com.sap.mbtepmdemo\" Alias=\"Self\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\">\n<ComplexType Name=\"CT_Address\">\n<Property Name=\"AddressType\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"2\"/>\n<Property Name=\"Building\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"10\"/>\n<Property Name=\"City\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"40\"/>\n<Property Name=\"Country\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"3\"/>\n<Property Name=\"PostalCode\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"10\"/>\n<Property Name=\"Street\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"60\"/>\n</ComplexType>\n<EntityType Name=\"BusinessPartner\">\n<Key>\n<PropertyRef Name=\"BusinessPartnerID\"/>\n</Key>\n<Property Name=\"AddressType\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"2\"/>\n<Property Name=\"Building\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"10\"/>\n<Property Name=\"City\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"40\"/>\n<Property Name=\"Country\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"3\"/>\n<Property Name=\"PostalCode\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"10\"/>\n<Property Name=\"Street\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"60\"/>\n<!--<Property Name=\"Address\" Type=\"Self.CT_Address\" Nullable=\"false\"/>-->\n<Property Name=\"BusinessPartnerID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"BusinessPartnerRole\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"3\"/>\n<Property Name=\"CompanyName\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"80\"/>\n<Property Name=\"FaxNumber\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"30\"/>\n<Property Name=\"LegalForm\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"10\"/>\n<Property Name=\"PhoneNumber\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"30\"/>\n<NavigationProperty Name=\"ToSalesOrders\" Type=\"Collection(Self.SalesOrder)\" Partner=\"ToBusinessPartner\"/>\n<Annotation Term=\"Cache.RefreshBy\" String=\"loadAll\"/>\n<Annotation Term=\"HTTP.Request\" Qualifier=\"loadAll\" String=\"GET /sap/opu/odata/IWBEP/GWSAMPLE_BASIC/BusinessPartnerSet\">\n<Annotation Term=\"HTTP.ResponseBody\">\n<String>\n{\"d\":{\"results\":\n[{\n\"Address\": {\n\"AddressType\": \"${entity.AddressType}\",\n\"Building\": \"${entity.Building}\",\n\"City\": \"${entity.City}\",\n\"Country\": \"${entity.Country}\",\n\"PostalCode\": \"${entity.PostalCode}\",\n\"Street\": \"${entity.Street}\"\n},\n\"BusinessPartnerID\": \"${entity.BusinessPartnerID}\",\n\"BusinessPartnerRole\": \"${entity.BusinessPartnerRole}\",\n\"CompanyName\": \"${entity.CompanyName}\",\n\"FaxNumber\": \"${entity.FaxNumber}\",\n\"LegalForm\": \"${entity.LegalForm}\",\n\"PhoneNumber\": \"${entity.PhoneNumber}\"\n}]\n}}\n</String>\n</Annotation>\n<Annotation Term=\"HTTP.RequestHeaders\">\n<String>\n{\n\"Accept\": \"application/json\"\n}\n</String>\n</Annotation>\n</Annotation>\n<Annotation Term=\"SQL.DownloadQuery\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\"\nString=\"select entity.* from BusinessPartner entity, BusinessPartnerFilter filter\nwhere entity.Country=filter.CountryFilter\n\"/>\n</EntityType>\n<EntityType Name=\"SalesOrder\">\n<Key>\n<PropertyRef Name=\"SalesOrderID\"/>\n</Key>\n<Property Name=\"BillingStatus\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"1\"/>\n<Property Name=\"BillingStatusDescription\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"60\"/>\n<Property Name=\"BusinessPartnerID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"ChangedAt\" Type=\"Edm.DateTimeOffset\" Nullable=\"true\" Precision=\"7\"/>\n<Property Name=\"CreatedAt\" Type=\"Edm.DateTimeOffset\" Nullable=\"true\" Precision=\"7\"/>\n<Property Name=\"CurrencyCode\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"5\"/>\n<Property Name=\"CustomerID\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"10\"/>\n<Property Name=\"CustomerName\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"80\"/>\n<Property Name=\"DeliveryStatus\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"1\"/>\n<Property Name=\"DeliveryStatusDescription\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"60\"/>\n<Property Name=\"GrossAmount\" Type=\"Edm.Decimal\" Nullable=\"true\" Precision=\"16\" Scale=\"3\"/>\n<Property Name=\"LifecycleStatus\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"1\"/>\n<Property Name=\"LifecycleStatusDescription\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"60\"/>\n<Property Name=\"NetAmount\" Type=\"Edm.Decimal\" Nullable=\"true\" Precision=\"16\" Scale=\"3\"/>\n<Property Name=\"Note\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"255\"/>\n<Property Name=\"NoteLanguage\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"2\"/>\n<Property Name=\"SalesOrderID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"TaxAmount\" Type=\"Edm.Decimal\" Nullable=\"true\" Precision=\"16\" Scale=\"3\"/>\n<NavigationProperty Name=\"ToBusinessPartner\" Type=\"Self.BusinessPartner\" Nullable=\"false\" Partner=\"ToSalesOrders\">\n<ReferentialConstraint Property=\"BusinessPartnerID\" ReferencedProperty=\"BusinessPartnerID\"/>\n</NavigationProperty>\n<Annotation Term=\"Cache.RefreshBy\" String=\"loadAll\"/>\n<Annotation Term=\"HTTP.Request\" Qualifier=\"loadAll\" String=\"GET /sap/opu/odata/IWBEP/GWSAMPLE_BASIC/SalesOrderSet\">\n<Annotation Term=\"HTTP.ResponseBody\">\n<String>\n{\"d\":{\"results\":\n[{\n\"BillingStatus\": \"${entity.BillingStatus}\",\n\"BillingStatusDescription\": \"${entity.BillingStatusDescription}\",\n\"CustomerID\": \"${entity.BusinessPartnerID}\",\n\"CurrencyCode\": \"${entity.CurrencyCode}\",\n\"CustomerName\": \"${entity.CustomerName}\",\n\"SalesOrderID\": \"${entity.SalesOrderID}\",\n\"DeliveryStatus\": \"${entity.DeliveryStatus}\",\n\"DeliveryStatusDescription\": \"${entity.DeliveryStatusDescription}\",\n\"GrossAmount\": \"${entity.GrossAmount}\",\n\"LifecycleStatus\": \"${entity.LifecycleStatus}\",\n\"LifecycleStatusDescription\": \"${entity.LifecycleStatusDescription}\",\n\"NetAmount\": \"${entity.NetAmount}\",\n\"Note\": \"${entity.Note}\",\n\"NoteLanguage\": \"${entity.NoteLanguage}\",\n\"CustomerName\": \"${entity.CustomerName}\",\n\"TaxAmount\": \"${entity.TaxAmount}\"\n}]\n}}\n</String>\n</Annotation>\n<Annotation Term=\"HTTP.RequestHeaders\">\n<String>\n{\n\"Accept\": \"application/json\"\n}\n</String>\n</Annotation>\n</Annotation>\n<Annotation Term=\"SQL.DownloadQuery\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\" String=\"\nselect entity.* from SalesOrder entity where entity.BusinessPartnerID in\n(select bp.BusinessPartnerID from BusinessPartner bp, BusinessPartnerFilter filter\nwhere bp.Country=filter.CountryFilter)\n\"/>\n</EntityType>\n<EntityType Name=\"BusinessPartnerFilter\">\n<Annotation Term=\"SQL.ClientFilter\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\"/>\n<Key>\n<PropertyRef Name=\"FilterID\"/>\n</Key>\n<Property Name=\"CountryFilter\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"3\"/>\n<Property Name=\"FilterID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n</EntityType>\n<EntityType Name=\"ClientRegistration\">\n<Key>\n<PropertyRef Name=\"ClientID\"/>\n</Key>\n<Property Name=\"AuthorizedUser\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"200\"/>\n<Property Name=\"ClientGUID\" Type=\"Edm.Guid\" Nullable=\"false\">\n<Annotation Term=\"Core.Immutable\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\"/>\n</Property>\n<Property Name=\"ClientID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n</EntityType>\n<EntityContainer Name=\"Com_sap_mbtepmdemoService\">\n<Annotation Term=\"Cache.HttpDestination\" String=\"ES5\"/>\n<Annotation Term=\"SQL.CacheDatabase\"/>\n<Annotation Term=\"SQL.TrackChanges\"/>\n<Annotation Term=\"SQL.TrackDownloads\" />\n<EntitySet Name=\"BusinessPartnerFilterSet\" EntityType=\"Self.BusinessPartnerFilter\"/>\n<EntitySet Name=\"ClientRegistrationSet\" EntityType=\"Self.ClientRegistration\"/>\n<EntitySet Name=\"BusinessPartnerSet\" EntityType=\"Self.BusinessPartner\">\n<NavigationPropertyBinding Path=\"ToSalesOrders\" Target=\"SalesOrderSet\"/>\n</EntitySet>\n<EntitySet Name=\"SalesOrderSet\" EntityType=\"Self.SalesOrder\">\n<NavigationPropertyBinding Path=\"ToBusinessPartner\" Target=\"BusinessPartnerSet\"/>\n</EntitySet>\n</EntityContainer>\n</Schema>\n</edmx:DataServices>\n</edmx:Edmx>\n";
}
