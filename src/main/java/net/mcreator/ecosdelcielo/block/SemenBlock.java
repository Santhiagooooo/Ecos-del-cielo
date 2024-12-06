
package net.mcreator.ecosdelcielo.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SemenBlock extends Block {
	public SemenBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}