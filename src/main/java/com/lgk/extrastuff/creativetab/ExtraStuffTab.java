package com.lgk.extrastuff.creativetab;

import com.lgk.extrastuff.Reference;
import com.lgk.extrastuff.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Dunng on 27/03/2017.
 */
public class ExtraStuffTab extends CreativeTabs {

    public ExtraStuffTab() {
        super(Reference.MODID);
        setBackgroundImageName("extrastuff.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.items);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
