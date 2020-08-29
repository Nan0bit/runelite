import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 1417653903
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -213210241
	)
	@Export("magnitude")
	int magnitude;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 525564355
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1643627841
	)
	@Export("y")
	int y;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1440997727
	)
	@Export("z")
	int z;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Leg;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16
}
