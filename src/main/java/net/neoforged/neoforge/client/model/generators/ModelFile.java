package net.neoforged.neoforge.client.model.generators;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.util.InternalApi;

@InternalApi
public abstract class ModelFile {

    public abstract ResourceLocation getLocation();

    public abstract void assertExistence();

    public abstract ResourceLocation getUncheckedLocation();

    public static abstract class UncheckedModelFile extends ModelFile {
    }

    public static abstract class ExistingModelFile extends ModelFile {
    }

}
