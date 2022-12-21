package net.ninjatek155.sweeteroreberries.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.ninjatek155.sweeteroreberries.SweeterOreberries;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SweeterOreberries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

//        registerGenericItemModel(itemGenerated, "dragon_scale");


//        withExistingParent("iron_bush_stage3", )
    }

    private ItemModelBuilder registerGenericItemModel(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
    }

    private ItemModelBuilder registerGenericBlockModel(String name) {
        return withExistingParent(name, modLoc("block/"+name));
    }
}
