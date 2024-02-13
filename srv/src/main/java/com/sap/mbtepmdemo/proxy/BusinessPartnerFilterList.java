package com.sap.mbtepmdemo.proxy;

public class BusinessPartnerFilterList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter>
{
    public static final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList empty = new com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList(java.lang.Integer.MIN_VALUE);

    public BusinessPartnerFilterList()
    {
        this(4);
    }

    public BusinessPartnerFilterList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList addThis(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList copy()
    {
        return this.slice(0);
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList result = new com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList(n);
        // for (let item of this)
        {
            final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter first()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().first());
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList from(final java.util.List<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter> list)
    {
        return BusinessPartnerFilterList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter>(list).toAnyList());
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter get(final int index)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter last()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList of(final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter... items)
    {
        com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList rest_items = new com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList(items.length);
        for (com.sap.mbtepmdemo.proxy.BusinessPartnerFilter items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList reversed()
    {
        final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList result = new com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.mbtepmdemo.proxy.BusinessPartnerFilter)
                {
                    final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter var_item = ((com.sap.mbtepmdemo.proxy.BusinessPartnerFilter)item);
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

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter single()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().single());
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList result = new com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing)
    {
        this.sortWith(new com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList.OrderBy(increasing));
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList sorted()
    {
        final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing)
    {
        final com.sap.mbtepmdemo.proxy.BusinessPartnerFilterList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter);
    }

    public java.util.List<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter a = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(left);
            final com.sap.mbtepmdemo.proxy.BusinessPartnerFilter b = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_BusinessPartnerFilter.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, com.sap.mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
