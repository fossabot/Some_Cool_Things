package org.nixub86.SCT.Dimension.Biom;

import java.util.Random;

import org.nixub86.SCT.Cripy.EntityCrip1;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.tree.WorldGenTree;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomOnMir extends BiomeGenBase
{
	private WorldGenerator WorldTree;
	
	public BiomOnMir(int id) {
		super(id);
		
		this.setDisableRain();
		
		this.spawnableMonsterList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCrip1.class, 10, 1, 3));
		
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		
		this.WorldTree = new WorldGenTree(false);
		//this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
	}
	
	public WorldGenAbstractTree func_150567_a(Random random)
    {
		return (WorldGenAbstractTree)(random.nextInt(5) == 0 ? this.worldGeneratorSwamp : (random.nextInt(10) == 0 ? this.WorldTree : this.worldGeneratorTrees));
    }
}