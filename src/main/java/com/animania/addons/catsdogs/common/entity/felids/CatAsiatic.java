package com.animania.addons.catsdogs.common.entity.felids;

import net.minecraft.world.World;

public class CatAsiatic
{

	public static class EntityTomAsiatic extends EntityTomBase
	{
		public EntityTomAsiatic(World worldIn)
		{
			super(worldIn);
			this.type = CatType.ASIATIC;
		}
	
		@Override
		public int getPrimaryEggColor()
		{
			return 0x7C6450;
		}
	
		@Override
		public int getSecondaryEggColor()
		{
			return 0x383838;
		}
	}

	public static class EntityQueenAsiatic extends EntityQueenBase {
		public EntityQueenAsiatic(World worldIn)
		{
			super(worldIn);
			this.type = CatType.ASIATIC;
		}
		
		@Override
		public int getPrimaryEggColor()
		{
			return 0x7C6450;
		}
		
		@Override
		public int getSecondaryEggColor()
		{
			return 0x383838;
		}
	}

	public static class EntityKittenAsiatic extends EntityKittenBase {
		public EntityKittenAsiatic(World worldIn)
		{
			super(worldIn);
			this.type = CatType.ASIATIC;
		}
		
		@Override
		public int getPrimaryEggColor()
		{
			return 0x7C6450;
		}
		
		@Override
		public int getSecondaryEggColor()
		{
			return 0x383838;
		}
	}

}
