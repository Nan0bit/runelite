import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public abstract class PcmStreamMixerListener extends Node {
	@ObfuscatedName("z")
	int field1476;

	@ObfuscatedName("z")
	abstract void remove2();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ldh;)I"
	)
	abstract int update();
}
