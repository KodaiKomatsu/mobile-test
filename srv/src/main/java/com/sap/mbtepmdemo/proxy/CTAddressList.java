package com.sap.mbtepmdemo.proxy;

public class CTAddressList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.mbtepmdemo.proxy.CTAddress>
{
    public static final com.sap.mbtepmdemo.proxy.CTAddressList empty = new com.sap.mbtepmdemo.proxy.CTAddressList(java.lang.Integer.MIN_VALUE);

    public CTAddressList()
    {
        this(4);
    }

    public CTAddressList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.mbtepmdemo.proxy.CTAddressList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList addThis(final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList copy()
    {
        return this.slice(0);
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.mbtepmdemo.proxy.CTAddress, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.mbtepmdemo.proxy.CTAddressList result = new com.sap.mbtepmdemo.proxy.CTAddressList(n);
        // for (let item of this)
        {
            final com.sap.mbtepmdemo.proxy.CTAddressList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.mbtepmdemo.proxy.CTAddress item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.CTAddress first()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().first());
    }

    public static com.sap.mbtepmdemo.proxy.CTAddressList from(final java.util.List<com.sap.mbtepmdemo.proxy.CTAddress> list)
    {
        return CTAddressList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.CTAddress>(list).toAnyList());
    }

    public final com.sap.mbtepmdemo.proxy.CTAddress get(final int index)
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.mbtepmdemo.proxy.CTAddress item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.mbtepmdemo.proxy.CTAddressList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.mbtepmdemo.proxy.CTAddress> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.mbtepmdemo.proxy.CTAddress last()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.mbtepmdemo.proxy.CTAddress item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.mbtepmdemo.proxy.CTAddressList of(final com.sap.mbtepmdemo.proxy.CTAddress... items)
    {
        com.sap.mbtepmdemo.proxy.CTAddressList rest_items = new com.sap.mbtepmdemo.proxy.CTAddressList(items.length);
        for (com.sap.mbtepmdemo.proxy.CTAddress items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.mbtepmdemo.proxy.CTAddressList reversed()
    {
        final com.sap.mbtepmdemo.proxy.CTAddressList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.mbtepmdemo.proxy.CTAddress item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.mbtepmdemo.proxy.CTAddressList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.mbtepmdemo.proxy.CTAddressList result = new com.sap.mbtepmdemo.proxy.CTAddressList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.mbtepmdemo.proxy.CTAddress)
                {
                    final com.sap.mbtepmdemo.proxy.CTAddress var_item = ((com.sap.mbtepmdemo.proxy.CTAddress)item);
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

    public final com.sap.mbtepmdemo.proxy.CTAddress single()
    {
        return com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().single());
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.mbtepmdemo.proxy.CTAddressList result = new com.sap.mbtepmdemo.proxy.CTAddressList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> increasing)
    {
        this.sortWith(new com.sap.mbtepmdemo.proxy.CTAddressList.OrderBy(increasing));
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList sorted()
    {
        final com.sap.mbtepmdemo.proxy.CTAddressList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.mbtepmdemo.proxy.CTAddressList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> increasing)
    {
        final com.sap.mbtepmdemo.proxy.CTAddressList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    public com.sap.cloud.server.odata.ComplexValueList toComplexList()
    {
        return com.sap.cloud.server.odata.ComplexValueList.share(this).withItemType(com.sap.mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress);
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toComplexList();
    }

    public java.util.List<com.sap.mbtepmdemo.proxy.CTAddress> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.mbtepmdemo.proxy.CTAddress>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.mbtepmdemo.proxy.CTAddress a = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(left);
            final com.sap.mbtepmdemo.proxy.CTAddress b = com.sap.mbtepmdemo.proxy.internal.Any_as_com_sap_mbtepmdemo_proxy_CTAddress.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.mbtepmdemo.proxy.CTAddress, com.sap.mbtepmdemo.proxy.CTAddress, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
