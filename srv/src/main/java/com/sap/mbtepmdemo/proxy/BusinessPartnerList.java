package com.sap.mbtepmdemo.proxy;

public class BusinessPartnerList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.mbtepmdemo.proxy.BusinessPartner>
{
    public static final com.sap.mbtepmdemo.proxy.BusinessPartnerList empty = new com.sap.mbtepmdemo.proxy.BusinessPartnerList(java.lang.Integer.MIN_VALUE);

    public BusinessPartnerList()
    {
        this(4);
    }

    public BusinessPartnerList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.mbtepmdemo.proxy.BusinessPartnerList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList addThis(final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList copy()
    {
        return this.slice(0);
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.mbtepmdemo.proxy.BusinessPartnerList result = new com.sap.mbtepmdemo.proxy.BusinessPartnerList(n);
        // for (let item of this)
        {
            final com.sap.mbtepmdemo.proxy.BusinessPartnerList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.mbtepmdemo.proxy.BusinessPartner item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartner first()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.getUntypedList().first());
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerList from(final java.util.List<com.sap.mbtepmdemo.proxy.BusinessPartner> list)
    {
        return BusinessPartnerList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.BusinessPartner>(list).toAnyList());
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartner get(final int index)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.BusinessPartner item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.mbtepmdemo.proxy.BusinessPartnerList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.mbtepmdemo.proxy.BusinessPartner> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartner last()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.BusinessPartner item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerList of(final com.sap.mbtepmdemo.proxy.BusinessPartner... items)
    {
        com.sap.mbtepmdemo.proxy.BusinessPartnerList rest_items = new com.sap.mbtepmdemo.proxy.BusinessPartnerList(items.length);
        for (com.sap.mbtepmdemo.proxy.BusinessPartner items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerList reversed()
    {
        final com.sap.mbtepmdemo.proxy.BusinessPartnerList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.mbtepmdemo.proxy.BusinessPartner item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.mbtepmdemo.proxy.BusinessPartnerList result = new com.sap.mbtepmdemo.proxy.BusinessPartnerList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.mbtepmdemo.proxy.BusinessPartner)
                {
                    final com.sap.mbtepmdemo.proxy.BusinessPartner var_item = ((com.sap.mbtepmdemo.proxy.BusinessPartner)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartner single()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(this.getUntypedList().single());
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.mbtepmdemo.proxy.BusinessPartnerList result = new com.sap.mbtepmdemo.proxy.BusinessPartnerList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> increasing)
    {
        this.sortWith(new com.sap.mbtepmdemo.proxy.BusinessPartnerList.OrderBy(increasing));
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList sorted()
    {
        final com.sap.mbtepmdemo.proxy.BusinessPartnerList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> increasing)
    {
        final com.sap.mbtepmdemo.proxy.BusinessPartnerList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner);
    }

    public java.util.List<com.sap.mbtepmdemo.proxy.BusinessPartner> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.BusinessPartner>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.mbtepmdemo.proxy.BusinessPartner a = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(left);
            final com.sap.mbtepmdemo.proxy.BusinessPartner b = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartner.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartner, com.sap.mbtepmdemo.proxy.BusinessPartner, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
