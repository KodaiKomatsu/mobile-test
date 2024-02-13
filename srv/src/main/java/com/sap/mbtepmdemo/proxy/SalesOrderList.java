package com.sap.mbtepmdemo.proxy;

public class SalesOrderList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.mbtepmdemo.proxy.SalesOrder>
{
    public static final com.sap.mbtepmdemo.proxy.SalesOrderList empty = new com.sap.mbtepmdemo.proxy.SalesOrderList(java.lang.Integer.MIN_VALUE);

    public SalesOrderList()
    {
        this(4);
    }

    public SalesOrderList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.mbtepmdemo.proxy.SalesOrderList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList addThis(final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList copy()
    {
        return this.slice(0);
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.mbtepmdemo.proxy.SalesOrderList result = new com.sap.mbtepmdemo.proxy.SalesOrderList(n);
        // for (let item of this)
        {
            final com.sap.mbtepmdemo.proxy.SalesOrderList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.mbtepmdemo.proxy.SalesOrder item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrder first()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.getUntypedList().first());
    }

    public static com.sap.mbtepmdemo.proxy.SalesOrderList from(final java.util.List<com.sap.mbtepmdemo.proxy.SalesOrder> list)
    {
        return SalesOrderList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.SalesOrder>(list).toAnyList());
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrder get(final int index)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.SalesOrder item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.mbtepmdemo.proxy.SalesOrderList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.mbtepmdemo.proxy.SalesOrder> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrder last()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.SalesOrder item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.mbtepmdemo.proxy.SalesOrderList of(final com.sap.mbtepmdemo.proxy.SalesOrder... items)
    {
        com.sap.mbtepmdemo.proxy.SalesOrderList rest_items = new com.sap.mbtepmdemo.proxy.SalesOrderList(items.length);
        for (com.sap.mbtepmdemo.proxy.SalesOrder items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.mbtepmdemo.proxy.SalesOrderList reversed()
    {
        final com.sap.mbtepmdemo.proxy.SalesOrderList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.mbtepmdemo.proxy.SalesOrder item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.mbtepmdemo.proxy.SalesOrderList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.mbtepmdemo.proxy.SalesOrderList result = new com.sap.mbtepmdemo.proxy.SalesOrderList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.mbtepmdemo.proxy.SalesOrder)
                {
                    final com.sap.mbtepmdemo.proxy.SalesOrder var_item = ((com.sap.mbtepmdemo.proxy.SalesOrder)item);
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

    public final com.sap.mbtepmdemo.proxy.SalesOrder single()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(this.getUntypedList().single());
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.mbtepmdemo.proxy.SalesOrderList result = new com.sap.mbtepmdemo.proxy.SalesOrderList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> increasing)
    {
        this.sortWith(new com.sap.mbtepmdemo.proxy.SalesOrderList.OrderBy(increasing));
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList sorted()
    {
        final com.sap.mbtepmdemo.proxy.SalesOrderList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.SalesOrderList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> increasing)
    {
        final com.sap.mbtepmdemo.proxy.SalesOrderList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder);
    }

    public java.util.List<com.sap.mbtepmdemo.proxy.SalesOrder> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.SalesOrder>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.mbtepmdemo.proxy.SalesOrder a = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(left);
            final com.sap.mbtepmdemo.proxy.SalesOrder b = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_SalesOrder.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.SalesOrder, com.sap.mbtepmdemo.proxy.SalesOrder, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
