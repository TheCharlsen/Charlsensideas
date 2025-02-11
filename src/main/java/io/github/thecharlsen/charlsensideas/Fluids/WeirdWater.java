package io.github.thecharlsen.charlsensideas.Fluids;

import io.github.thecharlsen.charlsensideas.CharlsensideasBlocks;
import io.github.thecharlsen.charlsensideas.CharlsensideasFluids;
import io.github.thecharlsen.charlsensideas.CharlsensideasItems;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public class WeirdWater extends WeirdWaterFluid{

    @Override
    public Fluid getStill() {
        return CharlsensideasFluids.Still_Weird_Water;
    }

    @Override
    public Fluid getFlowing() {
        return CharlsensideasFluids.Flowing_Weird_Water;
    }

    @Override
    public Item getBucketItem() {
        return CharlsensideasFluids.Bucket_Of_Weird_Water;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
        return CharlsensideasBlocks.Weird_Water.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends WeirdWater{
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends WeirdWater {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
