package net.neoforged.neoforge.common.data;

import java.util.function.Supplier;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.apache.logging.log4j.util.InternalApi;

@InternalApi
public abstract class LanguageProvider implements DataProvider {

    protected abstract void addTranslations();

    public abstract void addBlock(Supplier<? extends Block> key, String name);

    public abstract void add(Block key, String name);

    public abstract void addItem(Supplier<? extends Item> key, String name);

    public abstract void add(Item key, String name);

    public abstract void addItemStack(Supplier<ItemStack> key, String name);

    public abstract void add(ItemStack key, String name);

    public abstract void addEffect(Supplier<? extends MobEffect> key, String name);

    public abstract void add(MobEffect key, String name);

    public abstract void addEntityType(Supplier<? extends EntityType<?>> key, String name);

    public abstract void add(EntityType<?> key, String name);

    public abstract void addTag(Supplier<? extends TagKey<?>> key, String name);

    public  abstract void add(TagKey<?> tagKey, String name);

    public  abstract void add(String key, String value);

    public abstract void addDimension(ResourceKey<Level> dimension, String value);

}
