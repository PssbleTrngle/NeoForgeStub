package net.neoforged.neoforge.registries;

import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.util.InternalApi;

@InternalApi
public abstract class DeferredHolder<R, T extends R> implements Holder<R>, Supplier<T> {

    @Override
    public abstract T value();

    public abstract Optional<T> asOptional();

    public abstract ResourceLocation getId();

    public abstract ResourceKey<R> getKey();

}
