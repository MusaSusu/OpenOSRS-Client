import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Actor")
public abstract class Actor extends Renderable implements class67 {
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -2049286697
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1664267167
	)
	@Export("x")
	int x;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -2114612425
	)
	@Export("y")
	int y;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1773475719
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 585148803
	)
	int field1208;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2089671869
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1581269493
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1749214235
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1144226535
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1957996463
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1125955673
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -957437539
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -2018655779
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 891114171
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 507518675
	)
	int field1215;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 402540481
	)
	int field1225;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1945120027
	)
	int field1220;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1053752059
	)
	int field1273;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1914150945
	)
	int field1206;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 660027835
	)
	int field1281;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2124002405
	)
	int field1228;
	@ObfuscatedName("cw")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ck")
	boolean field1221;
	@ObfuscatedName("cn")
	boolean field1227;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1201567313
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1201696001
	)
	int field1253;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 844931771
	)
	int field1230;
	@ObfuscatedName("cs")
	int[] field1211;
	@ObfuscatedName("ci")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cc")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cb")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cr")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("co")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cf")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1270669829
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ca")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1050668579
	)
	int field1204;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1486445479
	)
	int field1242;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 68535171
	)
	int field1243;
	@ObfuscatedName("ct")
	boolean field1244;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1893608467
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -302041719
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -312855407
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1449333731
	)
	int field1248;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 2002995319
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 986534879
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1556843513
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1993218675
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1586944317
	)
	int field1239;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 2046982297
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 585711919
	)
	int field1256;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 904242481
	)
	int field1257;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1927339695
	)
	int field1258;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 506639341
	)
	int field1259;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 2090490753
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -212558525
	)
	int field1261;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -193194115
	)
	int field1262;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 2066389715
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1256709759
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1988886193
	)
	int field1265;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1884109747
	)
	int field1266;
	@ObfuscatedName("dl")
	byte field1267;
	@ObfuscatedName("dk")
	byte field1268;
	@ObfuscatedName("dh")
	byte field1269;
	@ObfuscatedName("dy")
	byte field1270;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 74629429
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -845513489
	)
	int field1272;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -445653683
	)
	int field1238;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 443603663
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dv")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ei")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "[Ljv;"
	)
	@Export("pathTraversed")
	class237[] pathTraversed;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -559968405
	)
	int field1278;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -126764577
	)
	int field1226;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 1295228337
	)
	int field1280;

	Actor() {
		this.isWalking = false;
		this.field1208 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1215 = -1;
		this.field1225 = -1;
		this.field1220 = -1;
		this.field1273 = -1;
		this.field1206 = -1;
		this.field1281 = -1;
		this.field1228 = -1;
		this.overheadText = null;
		this.field1227 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1253 = 0;
		this.field1230 = 0;
		this.field1211 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1204 = -1;
		this.field1242 = -1;
		this.field1243 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1248 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1239 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1265 = -1;
		this.field1266 = -1;
		this.field1272 = 0;
		this.field1238 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class237[10];
		this.field1278 = 0;
		this.field1226 = 0;
		this.field1280 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1854674602"
	)
	public int vmethod8779() {
		return this.x;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2039495018"
	)
	public int vmethod8773() {
		return this.y;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	public int vmethod8774() {
		return class358.topLevelWorldView.plane;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1899153369"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	final void method2420() {
		this.pathLength = 0;
		this.field1226 = 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "307897316"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = AsyncHttpResponse.method260(var1);
			var10 = var12.field2264;
			var11 = var12.field2261;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-126"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			var8.field2066 = var1;
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field2066 == var8.field2066) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-461996909"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			var3.field2066 = var1;
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "52"
	)
	@Export("updateSpotAnimation")
	void updateSpotAnimation(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle;
		ActorSpotAnim var6 = (ActorSpotAnim)this.spotAnimations.get((long)var1);
		if (var6 != null) {
			var6.remove();
			--this.graphicsCount;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var7 = 0;
			if (var4 > 0) {
				var7 = -1;
			}

			this.spotAnimations.put(new ActorSpotAnim(var2, var3, var5, var7), (long)var1);
			++this.graphicsCount;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Ltu;",
		garbageValue = "-1245366092"
	)
	IterableNodeHashTable method2426() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9325(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Lkb;",
		garbageValue = "2137336873"
	)
	Model method2451(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2914;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9325(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = Sound.SpotAnimationDefinition_get(var7.spotAnimation).method4036();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5294(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9325(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = Sound.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5294(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3217"
	)
	void method2447() {
		this.field1244 = false;
		this.field1204 = -1;
		this.field1242 = -1;
		this.field1243 = -1;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-747158696"
	)
	static final void method2464(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			boolean var2;
			int var3;
			int var4;
			ObjectComposition var5;
			if (var1.hitpoints == 0) {
				if (var1.objectId >= 0) {
					var3 = var1.objectId;
					var4 = var1.field1201;
					var5 = HitSplatDefinition.getObjectDefinition(var3);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method4184(var4);
					if (!var2) {
						continue;
					}
				}

				GrandExchangeOfferOwnWorldComparator.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1195, var1.field1201, var1.field1190);
				var1.remove();
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102) {
					if (var1.field1193 >= 0) {
						var3 = var1.field1193;
						var4 = var1.field1197;
						var5 = HitSplatDefinition.getObjectDefinition(var3);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method4184(var4);
						if (!var2) {
							continue;
						}
					}

					GrandExchangeOfferOwnWorldComparator.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1193, var1.field1198, var1.field1197, var1.field1190);
					var1.delay = -1;
					if (var1.field1193 == var1.objectId && var1.objectId == -1) {
						var1.remove();
					} else if (var1.field1193 == var1.objectId && var1.field1198 == var1.field1195 && var1.field1201 == var1.field1197) {
						var1.remove();
					}
				}
			}
		}

	}
}
