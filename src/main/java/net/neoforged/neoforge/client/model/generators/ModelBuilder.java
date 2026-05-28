package net.neoforged.neoforge.client.model.generators;

import com.mojang.math.Transformation;
import java.util.Set;
import java.util.function.BiConsumer;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import org.apache.logging.log4j.util.InternalApi;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@InternalApi
public abstract class ModelBuilder<T extends ModelBuilder<T>> extends ModelFile {

    public abstract T parent(ModelFile parent);

    public abstract T texture(String key, String texture);

    public abstract T texture(String key, ResourceLocation texture);

    public abstract T renderType(String renderType);

    public abstract T renderType(ResourceLocation renderType);

    public abstract ModelBuilder<T>.TransformsBuilder transforms();

    public abstract T ao(boolean ao);

    public abstract T guiLight(BlockModel.GuiLight light);

    public abstract ModelBuilder<T>.ElementBuilder element();

    public abstract ModelBuilder<T>.ElementBuilder element(int index);

    public abstract int getElementCount();

    public abstract ModelBuilder<T>.RootTransformsBuilder rootTransforms();

    public abstract class ElementBuilder {

        public abstract ModelBuilder<T>.ElementBuilder from(float x, float y, float z);

        public abstract ModelBuilder<T>.ElementBuilder to(float x, float y, float z);

        public abstract ModelBuilder<T>.ElementBuilder shade(boolean shade);

        public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder face(Direction dir);

        public abstract ModelBuilder<T>.ElementBuilder.RotationBuilder rotation();

        public abstract ModelBuilder<T>.ElementBuilder allFaces(BiConsumer<Direction, ElementBuilder.FaceBuilder> action);

        public abstract ModelBuilder<T>.ElementBuilder allFacesExcept(BiConsumer<Direction, ModelBuilder<T>.ElementBuilder.FaceBuilder> action, Set<Direction> exc);

        public abstract ModelBuilder<T>.ElementBuilder faces(BiConsumer<Direction, ModelBuilder<T>.ElementBuilder.FaceBuilder> action);

        public abstract ModelBuilder<T>.ElementBuilder textureAll(String texture);

        public abstract ModelBuilder<T>.ElementBuilder texture(String texture);

        public abstract ModelBuilder<T>.ElementBuilder cube(String texture);

        public abstract ModelBuilder<T>.ElementBuilder emissivity(int blockLight, int skyLight);

        public abstract ModelBuilder<T>.ElementBuilder color(int color);

        public abstract ModelBuilder<T>.ElementBuilder ao(boolean ao);

        public abstract T end();

        public abstract class FaceBuilder {
            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder cullface(@Nullable Direction dir);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder tintindex(int index);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder texture(String texture);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder uvs(float u1, float v1, float u2, float v2);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder rotation(FaceRotation rot);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder emissivity(int blockLight, int skyLight);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder color(int color);

            public abstract ModelBuilder<T>.ElementBuilder.FaceBuilder ao(boolean ao);

            public abstract ModelBuilder<T>.ElementBuilder end();
        }

        public abstract class RotationBuilder {
            public abstract ModelBuilder<T>.ElementBuilder.RotationBuilder origin(float x, float y, float z);

            public abstract ModelBuilder<T>.ElementBuilder.RotationBuilder axis(Direction.Axis axis);

            public abstract ModelBuilder<T>.ElementBuilder.RotationBuilder angle(float angle);

            public abstract ModelBuilder<T>.ElementBuilder.RotationBuilder rescale(boolean rescale);

            public abstract ModelBuilder<T>.ElementBuilder end();
        }

    }

    public enum FaceRotation {
        ZERO,
        CLOCKWISE_90,
        UPSIDE_DOWN,
        COUNTERCLOCKWISE_90;
    }

    public abstract class TransformsBuilder {

        public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder transform(ItemDisplayContext type);

        public abstract T end();

        public abstract class TransformVecBuilder {
            public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder rotation(float x, float y, float z);

            public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder leftRotation(float x, float y, float z);

            public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder translation(float x, float y, float z);

            public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder scale(float sc);

            public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder scale(float x, float y, float z);

            public abstract ModelBuilder<T>.TransformsBuilder.TransformVecBuilder rightRotation(float x, float y, float z);

            public abstract ModelBuilder<T>.TransformsBuilder end();
        }
    }

    public abstract class RootTransformsBuilder {
        public abstract ModelBuilder<T>.RootTransformsBuilder translation(Vector3f translation);

        public abstract ModelBuilder<T>.RootTransformsBuilder translation(float x, float y, float z);

        public abstract ModelBuilder<T>.RootTransformsBuilder rotation(Quaternionf rotation);

        public abstract ModelBuilder<T>.RootTransformsBuilder rotation(float x, float y, float z, boolean isDegrees);

        public abstract ModelBuilder<T>.RootTransformsBuilder leftRotation(Quaternionf leftRotation);

        public abstract ModelBuilder<T>.RootTransformsBuilder leftRotation(float x, float y, float z, boolean isDegrees);

        public abstract ModelBuilder<T>.RootTransformsBuilder rightRotation(Quaternionf rightRotation);

        public abstract ModelBuilder<T>.RootTransformsBuilder rightRotation(float x, float y, float z, boolean isDegrees);

        public abstract ModelBuilder<T>.RootTransformsBuilder postRotation(Quaternionf postRotation);

        public abstract ModelBuilder<T>.RootTransformsBuilder postRotation(float x, float y, float z, boolean isDegrees);

        public abstract ModelBuilder<T>.RootTransformsBuilder scale(float scale);

        public abstract ModelBuilder<T>.RootTransformsBuilder scale(float xScale, float yScale, float zScale);

        public abstract ModelBuilder<T>.RootTransformsBuilder scale(Vector3f scale);

        public abstract ModelBuilder<T>.RootTransformsBuilder transform(Transformation transformation);

        public abstract ModelBuilder<T>.RootTransformsBuilder origin(Vector3f origin);

        public abstract ModelBuilder<T> end();
    }

}
