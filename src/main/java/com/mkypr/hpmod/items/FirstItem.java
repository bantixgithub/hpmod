package com.mkypr.hpmod.items;

import com.mkypr.hpmod.HpMod;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(HpMod.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
