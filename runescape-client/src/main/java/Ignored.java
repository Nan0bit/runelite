import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class Ignored extends User {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1266323763
	)
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)I",
		garbageValue = "1464728446"
	)
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljc;I)I",
		garbageValue = "-243007320"
	)
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
