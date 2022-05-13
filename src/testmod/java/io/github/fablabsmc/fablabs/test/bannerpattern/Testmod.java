package io.github.fablabsmc.fablabs.test.bannerpattern;

import io.github.fablabsmc.fablabs.api.bannerpattern.v1.LoomPattern;
import io.github.fablabsmc.fablabs.api.bannerpattern.v1.LoomPatternItem;
import io.github.fablabsmc.fablabs.api.bannerpattern.v1.LoomPatterns;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;

public class Testmod implements ModInitializer {
	public static LoomPattern A = new LoomPattern(false);
	public static LoomPattern B = new LoomPattern(true);
	public static Item TEST_ITEM = new LoomPatternItem(B, new Item.Settings());

	@Override
	public void onInitialize() {
		Registry.register(LoomPatterns.REGISTRY, new Identifier("bpp-test", "a"), A);
		Registry.register(LoomPatterns.REGISTRY, new Identifier("bpp-test", "b"), B);
		Registry.register(Registry.ITEM, new Identifier("bpp-test", "test_item"), TEST_ITEM);
	}
}
