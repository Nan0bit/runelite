import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-706706502"
	)
	static char method3374(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1532544056"
	)
	@Export("shouldPrioritizeDrop")
	static boolean shouldPrioritizeDrop() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}
}
