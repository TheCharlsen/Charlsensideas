package charlsen.charlsens.ideas;

import charlsen.charlsens.ideas.Blocks.*;
import charlsen.charlsens.ideas.Generators.PineTreeGenerator;
import charlsen.charlsens.ideas.Generators.UmbraTreeGenerator;
import charlsen.charlsens.ideas.ProtectedAcces.CakeBlocks;
import charlsen.charlsens.ideas.ProtectedAcces.SaplingBlocks;
import charlsen.charlsens.ideas.ProtectedAcces.StairsBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class CharlsensideasBlocks {

    public static final Block MuddedDirt = new Block(FabricBlockSettings.of(Material.SOIL).strength(1F, 1F).sounds(BlockSoundGroup.GRAVEL));
    public static final Block HardenedMuddedDirt = new Block(FabricBlockSettings.of(Material.STONE).strength(2F, 2F).sounds(BlockSoundGroup.STONE));
    public static final Block Bornite_Ore = new BorniteOreBlock(FabricBlockSettings.of(Material.STONE).strength(1F, 1F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().luminance((state) -> { return 15;}));
    public static final Block Adrian_Block = new Block(FabricBlockSettings.of(Material.CAKE).strength(5F, 5F).sounds(CharlsensideasBlockSoundGroup.ADRIAN_BLOCK).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block Charlie_Block = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(5F, 5F).sounds(BlockSoundGroup.METAL).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block Julian_Block = new Block(FabricBlockSettings.of(Material.PISTON).strength(5F, 5F).sounds(BlockSoundGroup.METAL).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block Emil_Block = new Block(FabricBlockSettings.of(Material.CACTUS).strength(5F, 5F).sounds(BlockSoundGroup.METAL).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block Black_Tourmaline_Stone = new Block(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block PineLeaves = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).of(Material.LEAVES).sounds(BlockSoundGroup.GRASS).strength(0.5F, 0.5F).nonOpaque());
    public static final SaplingBlock PineSapling = new SaplingBlocks(new PineTreeGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    public static final Block PineLog = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F, 1.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block Weirdly_Black_Tourmaline_Stone = new WeirdlyDeepStoneBlock(FabricBlockSettings.of(Material.STONE).strength(14F, 13F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).luminance((state) -> { return 4;}));
    public static Block Weird_Water;
    public static final Block Pompon = new FlowerBlock(CharlsensideasStatusEffects.Blossomed, 9, FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));
    public static final Block CloudBlock = new CloudBlock(FabricBlockSettings.of(Material.WOOL).strength(1F, 1F).sounds(BlockSoundGroup.SNOW).noCollision());
    public static final Block Cobbled_Black_Tourmaline_Stone = new DeepAndDirtBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Weird_Grass_Block = new WeirdGrassBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1F, 1F).sounds(BlockSoundGroup.GRASS).ticksRandomly());
    public static final Block Umbra_Log = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3F, 2.5F).sounds(BlockSoundGroup.WOOD).breakByHand(false).breakByTool(FabricToolTags.AXES, 3));
    public static final Block Umbra_Leaves = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).of(Material.LEAVES).strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRASS).nonOpaque());
    public static final SaplingBlock Umbra_Sapling = new UmbraSaplingBlock(new UmbraTreeGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    public static final Block Alpine_Strawberry_Bush = new AlpineStrawberryBushBlock(FabricBlockSettings.of(Material.PLANT).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).nonOpaque());
    public static final Block Weird_Dirt = new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.5F, 0.5F).sounds(BlockSoundGroup.CROP));
    public static final Block Chiseled_Black_Tourmaline_Stone = new Block(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Black_Tourmaline_Stone_Bricks = new Block(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Cracked_Black_Tourmaline_Stone_Bricks = new Block(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Polished_Black_Tourmaline_Stone = new Block(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Cobbled_Black_Tourmaline_Stone_Stairs = new StairsBlocks(Cobbled_Black_Tourmaline_Stone.getDefaultState(), AbstractBlock.Settings.copy(Cobbled_Black_Tourmaline_Stone));
    public static final Block Polished_Black_Tourmaline_Stone_Stairs = new StairsBlocks(Polished_Black_Tourmaline_Stone.getDefaultState(), AbstractBlock.Settings.copy(Polished_Black_Tourmaline_Stone));
    public static final Block Chiseled_Black_Tourmaline_Stone_Stairs = new StairsBlocks(Chiseled_Black_Tourmaline_Stone.getDefaultState(), AbstractBlock.Settings.copy(Chiseled_Black_Tourmaline_Stone));
    public static final Block Black_Tourmaline_Stone_Brick_Stairs = new StairsBlocks(Black_Tourmaline_Stone_Bricks.getDefaultState(), AbstractBlock.Settings.copy(Black_Tourmaline_Stone_Bricks));
    public static final Block Black_Tourmaline_Stone_Cracked_Brick_Stairs = new StairsBlocks(Cracked_Black_Tourmaline_Stone_Bricks.getDefaultState(), AbstractBlock.Settings.copy(Cracked_Black_Tourmaline_Stone_Bricks));
    public static final Block Black_Tourmaline_Stone_Pillar = new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Cobbled_Black_Tourmaline_Stone_Slab = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Polished_Black_Tourmaline_Stone_Slab = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Chiseled_Black_Tourmaline_Stone_Slab = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Black_Tourmaline_Stone_Brick_Slab = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Black_Tourmaline_Stone_Cracked_Brick_Slab = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6F, 6F).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block Alpine_Strawberry_Cake = new CakeBlocks(FabricBlockSettings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
    public static final TenebrisPortalBlock TenebrisPortal = new TenebrisPortalBlock(FabricBlockSettings.of(Material.PORTAL).strength(0.1F).sounds(BlockSoundGroup.STONE).breakByHand(true));

    public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static void blocksInit(){
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "bornite_ore"), Bornite_Ore);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "adrian_block"), Adrian_Block);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "charlie_block"), Charlie_Block);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "julian_block"), Julian_Block);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "emil_block"), Emil_Block);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "mudded_dirt"), MuddedDirt);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "hardened_mudded_dirt"), HardenedMuddedDirt);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone"), Black_Tourmaline_Stone);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "pine_sapling"), PineSapling);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "pine_leaves"), PineLeaves);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "pine_log"), PineLog);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "weirdly_black_tourmaline_stone"), Weirdly_Black_Tourmaline_Stone);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "pompon"), Pompon);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "cloud_block"), CloudBlock);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "alpine_strawberry_bush"), Alpine_Strawberry_Bush);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "weird_grass_block"), Weird_Grass_Block);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "cobbled_black_tourmaline_stone"), Cobbled_Black_Tourmaline_Stone);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "umbra_log"), Umbra_Log);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "umbra_leaves"), Umbra_Leaves);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "umbra_sapling"), Umbra_Sapling);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "weird_dirt"), Weird_Dirt);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "chiseled_black_tourmaline_stone"), Chiseled_Black_Tourmaline_Stone);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone_bricks"), Black_Tourmaline_Stone_Bricks);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "cracked_black_tourmaline_stone_bricks"), Cracked_Black_Tourmaline_Stone_Bricks);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "polished_black_tourmaline_stone"), Polished_Black_Tourmaline_Stone);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "cobbled_black_tourmaline_stone_stairs"), Cobbled_Black_Tourmaline_Stone_Stairs);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "polished_black_tourmaline_stone_stairs"), Polished_Black_Tourmaline_Stone_Stairs);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "chiseled_black_tourmaline_stone_stairs"), Chiseled_Black_Tourmaline_Stone_Stairs);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone_brick_stairs"), Black_Tourmaline_Stone_Brick_Stairs);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone_cracked_brick_stairs"), Black_Tourmaline_Stone_Cracked_Brick_Stairs);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone_pillar"), Black_Tourmaline_Stone_Pillar);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "cobbled_black_tourmaline_stone_slab"), Cobbled_Black_Tourmaline_Stone_Slab);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "polished_black_tourmaline_stone_slab"), Polished_Black_Tourmaline_Stone_Slab);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "chiseled_black_tourmaline_stone_slab"), Chiseled_Black_Tourmaline_Stone_Slab);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone_brick_slab"), Black_Tourmaline_Stone_Brick_Slab);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "black_tourmaline_stone_cracked_brick_slab"), Black_Tourmaline_Stone_Cracked_Brick_Slab);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "alpine_strawberry_cake"), Alpine_Strawberry_Cake);
        Registry.register(Registry.BLOCK, new Identifier("charlsensideas", "tenebris_portal"), TenebrisPortal);

        //BlockItems
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "bornite_ore"), new BlockItem(Bornite_Ore, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_ORES)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "adrian_block"), new BlockItem(Adrian_Block, new Item.Settings()));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "charlie_block"), new BlockItem(Charlie_Block, new Item.Settings()));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "julian_block"), new BlockItem(Julian_Block, new Item.Settings()));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "emil_block"), new BlockItem(Emil_Block, new Item.Settings()));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "weird_grass_block"), new BlockItem(CharlsensideasBlocks.Weird_Grass_Block, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "mudded_dirt"), new BlockItem(MuddedDirt, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "hardened_mudded_dirt"), new BlockItem(HardenedMuddedDirt, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone"), new BlockItem(Black_Tourmaline_Stone, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "pine_sapling"), new BlockItem(PineSapling, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "pine_leaves"), new BlockItem(PineLeaves, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "pine_log"), new BlockItem(PineLog, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "weirdly_black_tourmaline_stone"), new BlockItem(Weirdly_Black_Tourmaline_Stone, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "cloud_block"), new BlockItem(CharlsensideasBlocks.CloudBlock, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "cobbled_black_tourmaline_stone"), new BlockItem(CharlsensideasBlocks.Cobbled_Black_Tourmaline_Stone, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)) );
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "umbra_log"),  new BlockItem(CharlsensideasBlocks.Umbra_Log, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "umbra_leaves"),  new BlockItem(CharlsensideasBlocks.Umbra_Leaves, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "umbra_sapling"), new BlockItem(CharlsensideasBlocks.Umbra_Sapling, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)) );
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "weird_dirt"),  new BlockItem(CharlsensideasBlocks.Weird_Dirt, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "chiseled_black_tourmaline_stone"),  new BlockItem(CharlsensideasBlocks.Chiseled_Black_Tourmaline_Stone, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone_bricks"),  new BlockItem(CharlsensideasBlocks.Black_Tourmaline_Stone_Bricks, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "cracked_black_tourmaline_stone_bricks"),  new BlockItem(CharlsensideasBlocks.Cracked_Black_Tourmaline_Stone_Bricks, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "polished_black_tourmaline_stone"), new BlockItem(CharlsensideasBlocks.Polished_Black_Tourmaline_Stone, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "cobbled_black_tourmaline_stone_stairs"), new BlockItem(CharlsensideasBlocks.Cobbled_Black_Tourmaline_Stone_Stairs, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "polished_black_tourmaline_stone_stairs"), new BlockItem(CharlsensideasBlocks.Polished_Black_Tourmaline_Stone_Stairs, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "chiseled_black_tourmaline_stone_stairs"), new BlockItem(CharlsensideasBlocks.Chiseled_Black_Tourmaline_Stone_Stairs, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone_brick_stairs"), new BlockItem(CharlsensideasBlocks.Black_Tourmaline_Stone_Brick_Stairs, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone_cracked_brick_stairs"), new BlockItem(CharlsensideasBlocks.Black_Tourmaline_Stone_Cracked_Brick_Stairs, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone_pillar"),  new BlockItem(CharlsensideasBlocks.Black_Tourmaline_Stone_Pillar, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "cobbled_black_tourmaline_stone_slab"),  new BlockItem(CharlsensideasBlocks.Cobbled_Black_Tourmaline_Stone_Slab, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "polished_black_tourmaline_stone_slab"), new BlockItem(CharlsensideasBlocks.Polished_Black_Tourmaline_Stone_Slab, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "chiseled_black_tourmaline_stone_slab"), new BlockItem(CharlsensideasBlocks.Chiseled_Black_Tourmaline_Stone_Slab, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone_brick_slab"), new BlockItem(CharlsensideasBlocks.Black_Tourmaline_Stone_Brick_Slab, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "black_tourmaline_stone_cracked_brick_slab"), new BlockItem(CharlsensideasBlocks.Black_Tourmaline_Stone_Cracked_Brick_Slab, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "alpine_strawberry_cake"), new BlockItem(CharlsensideasBlocks.Alpine_Strawberry_Cake, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_FOOD)));
        Registry.register(Registry.ITEM, new Identifier("charlsensideas", "tenebris_portal"), new BlockItem(CharlsensideasBlocks.TenebrisPortal, new Item.Settings().group(CharlsensideasItemGroup.ITEM_GROUP_NATURE)));
    }
}
