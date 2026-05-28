package net.neoforged.neoforge.client.model.generators;

import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.util.InternalApi;

@InternalApi
public abstract class ModelProvider<T extends ModelBuilder<T>> implements DataProvider {

    public static final String BLOCK_FOLDER = "block";
    public static final String ITEM_FOLDER = "item";

    public abstract T getBuilder(String path);

    public abstract ResourceLocation modLoc(String name);

    public abstract ResourceLocation mcLoc(String name);

    public abstract T withExistingParent(String name, String parent);

    public abstract T withExistingParent(String name, ResourceLocation parent);

    public abstract T cube(String name, ResourceLocation down, ResourceLocation up, ResourceLocation north, ResourceLocation south, ResourceLocation east, ResourceLocation west);

    public abstract T singleTexture(String name, ResourceLocation parent, ResourceLocation texture);

    public abstract T singleTexture(String name, ResourceLocation parent, String textureKey, ResourceLocation texture);

    public abstract T cubeAll(String name, ResourceLocation texture);

    public abstract T cubeTop(String name, ResourceLocation side, ResourceLocation top);

    public abstract T cubeBottomTop(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top);

    public abstract T cubeColumn(String name, ResourceLocation side, ResourceLocation end);

    public abstract T cubeColumnHorizontal(String name, ResourceLocation side, ResourceLocation end);

    public abstract T orientableVertical(String name, ResourceLocation side, ResourceLocation front);

    public abstract T orientableWithBottom(String name, ResourceLocation side, ResourceLocation front, ResourceLocation bottom, ResourceLocation top);

    public abstract T orientable(String name, ResourceLocation side, ResourceLocation front, ResourceLocation top);

    public abstract T crop(String name, ResourceLocation crop);

    public abstract T cross(String name, ResourceLocation cross);

    public abstract T stairs(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top);

    public abstract T stairsOuter(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top);

    public abstract T stairsInner(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top);

    public abstract T slab(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top);

    public abstract T slabTop(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top);

    public abstract T button(String name, ResourceLocation texture);

    public abstract T buttonPressed(String name, ResourceLocation texture);

    public abstract T buttonInventory(String name, ResourceLocation texture);

    public abstract T pressurePlate(String name, ResourceLocation texture);

    public abstract T pressurePlateDown(String name, ResourceLocation texture);

    public abstract T sign(String name, ResourceLocation texture);

    public abstract T fencePost(String name, ResourceLocation texture);

    public abstract T fenceSide(String name, ResourceLocation texture);

    public abstract T fenceInventory(String name, ResourceLocation texture);

    public abstract T fenceGate(String name, ResourceLocation texture);

    public abstract T fenceGateOpen(String name, ResourceLocation texture);

    public abstract T fenceGateWall(String name, ResourceLocation texture);

    public abstract T fenceGateWallOpen(String name, ResourceLocation texture);

    public abstract T wallPost(String name, ResourceLocation wall);

    public abstract T wallSide(String name, ResourceLocation wall);

    public abstract T wallSideTall(String name, ResourceLocation wall);

    public abstract T wallInventory(String name, ResourceLocation wall);

    public abstract T panePost(String name, ResourceLocation pane, ResourceLocation edge);

    public abstract T paneSide(String name, ResourceLocation pane, ResourceLocation edge);

    public abstract T paneSideAlt(String name, ResourceLocation pane, ResourceLocation edge);

    public abstract T paneNoSide(String name, ResourceLocation pane);

    public abstract T paneNoSideAlt(String name, ResourceLocation pane);

    public abstract T doorBottomLeft(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorBottomLeftOpen(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorBottomRight(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorBottomRightOpen(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorTopLeft(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorTopLeftOpen(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorTopRight(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T doorTopRightOpen(String name, ResourceLocation bottom, ResourceLocation top);

    public abstract T trapdoorBottom(String name, ResourceLocation texture);

    public abstract T trapdoorTop(String name, ResourceLocation texture);

    public abstract T trapdoorOpen(String name, ResourceLocation texture);

    public abstract T trapdoorOrientableBottom(String name, ResourceLocation texture);

    public abstract T trapdoorOrientableTop(String name, ResourceLocation texture);

    public abstract T trapdoorOrientableOpen(String name, ResourceLocation texture);

    public abstract T torch(String name, ResourceLocation torch);

    public abstract T torchWall(String name, ResourceLocation torch);

    public abstract T carpet(String name, ResourceLocation wool);

    public abstract T leaves(String name, ResourceLocation texture);

    public abstract ModelFile.ExistingModelFile getExistingFile(ResourceLocation path);

}
