package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class HachaDeLaDesolacionAlPresionarClickDerechoEnElBloqueProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.BLOCK);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(3, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
