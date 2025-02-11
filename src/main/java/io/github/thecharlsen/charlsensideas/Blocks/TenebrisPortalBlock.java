package io.github.thecharlsen.charlsensideas.Blocks;

import io.github.thecharlsen.charlsensideas.CharlsensideasSoundEvents;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class TenebrisPortalBlock extends CustomPortalBlock {

    public TenebrisPortalBlock(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(100) == 0) {
            world.getProfiler().push("portal");
            world.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, CharlsensideasSoundEvents.Block_Tenebris_Portal_Ambient, SoundCategory.BLOCKS, 0.2F, random.nextFloat() * 0.4F + 0.8F, true);
            world.getProfiler().pop();
        }

        double d = (double) pos.getX() + random.nextDouble();
        double e = (double) pos.getY() + random.nextDouble();
        double f = (double) pos.getZ() + random.nextDouble();
        double g = ((double) random.nextFloat() - 0.5D) * 0.5D;
        double h = ((double) random.nextFloat() - 0.5D) * 0.5D;
        double j = ((double) random.nextFloat() - 0.5D) * 0.5D;
        int k = random.nextInt(2) * 2 - 1;
        if (!world.getBlockState(pos.west()).isOf(this) && !world.getBlockState(pos.east()).isOf(this)) {
            d = (double) pos.getX() + 0.5D + 0.25D * (double) k;
            g = random.nextFloat() * 2.0F * (float) k;
        } else {
            f = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            j = random.nextFloat() * 2.0F * (float) k;
        }
        if (world.getRandom().nextInt(6) != 0) world.addParticle(ParticleTypes.ELECTRIC_SPARK, d, e, f, g, h, j);
        else world.addParticle(ParticleTypes.CLOUD, d, e, f, 0, 0, 0);
    }
}
