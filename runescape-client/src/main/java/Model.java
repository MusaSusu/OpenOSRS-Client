import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("al")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("az")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class423 field2870;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class423 field2871;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class423 field2872;
	@ObfuscatedName("bp")
	static boolean[] field2905;
	@ObfuscatedName("br")
	static boolean[] field2892;
	@ObfuscatedName("bx")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bd")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bv")
	static float[] field2911;
	@ObfuscatedName("bm")
	static int[] field2910;
	@ObfuscatedName("bq")
	static int[] field2913;
	@ObfuscatedName("bj")
	static int[] field2894;
	@ObfuscatedName("bc")
	static int[] field2884;
	@ObfuscatedName("ba")
	static char[] field2915;
	@ObfuscatedName("bb")
	static char[][] field2916;
	@ObfuscatedName("by")
	static int[] field2917;
	@ObfuscatedName("cw")
	static int[][] field2918;
	@ObfuscatedName("ck")
	static int[] field2919;
	@ObfuscatedName("cn")
	static int[] field2920;
	@ObfuscatedName("ch")
	static int[] field2889;
	@ObfuscatedName("cp")
	static int[] field2942;
	@ObfuscatedName("cd")
	static int[] field2923;
	@ObfuscatedName("cs")
	static int[] field2924;
	@ObfuscatedName("cm")
	static float[] field2925;
	@ObfuscatedName("ci")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cc")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cb")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cr")
	static boolean field2929;
	@ObfuscatedName("ce")
	static int[] field2937;
	@ObfuscatedName("cz")
	static int[] field2933;
	@ObfuscatedName("ca")
	static int[] field2934;
	@ObfuscatedName("cl")
	static int[] field2906;
	@ObfuscatedName("cy")
	static final float field2875;
	@ObfuscatedName("cx")
	static float[] field2943;
	@ObfuscatedName("ab")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ac")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ao")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ah")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("av")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aq")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ap")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ae")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ax")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ay")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("au")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("as")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("aw")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ad")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ai")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("an")
	public byte field2914;
	@ObfuscatedName("am")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("ar")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ag")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bs")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bf")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bo")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bi")
	int[][] field2895;
	@ObfuscatedName("bt")
	int[][] field2896;
	@ObfuscatedName("bn")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bw")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bl")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("be")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bg")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bu")
	@Export("radius")
	int radius;
	@ObfuscatedName("bh")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("ct")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cg")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cv")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cj")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cu")
	public short field2891;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2870 = new class423();
		field2871 = new class423();
		field2872 = new class423();
		field2905 = new boolean[6500];
		field2892 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2911 = new float[6500];
		field2910 = new int[6500];
		field2913 = new int[6500];
		field2894 = new int[6500];
		field2884 = new int[6500];
		field2915 = new char[6000];
		field2916 = new char[6000][512];
		field2917 = new int[12];
		field2918 = new int[12][2000];
		field2919 = new int[2000];
		field2920 = new int[2000];
		field2889 = new int[12];
		field2942 = new int[10];
		field2923 = new int[10];
		field2924 = new int[10];
		field2925 = new float[10];
		field2929 = true;
		field2937 = Rasterizer3D.Rasterizer3D_sine;
		field2933 = Rasterizer3D.Rasterizer3D_cosine;
		field2934 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2906 = Rasterizer3D.field2666;
		field2875 = class175.method3578(50);
		field2943 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2914 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2914 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method5175(var1, var2, var3);
		this.field2914 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Lkb;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2914 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2914 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2914 == -1) {
					this.field2914 = var4.field2914;
				}
			}
		}

		this.method5175(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5294(var1[var3]);
		}

	}

	@ObfuscatedName("ak")
	void method5175(int var1, int var2, int var3) {
		this.verticesX = new int[var1];
		this.verticesY = new int[var1];
		this.verticesZ = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceColors1 = new int[var2];
		this.faceColors2 = new int[var2];
		this.faceColors3 = new int[var2];
		if (var3 > 0) {
			this.texIndices1 = new int[var3];
			this.texIndices2 = new int[var3];
			this.texIndices3 = new int[var3];
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkb;)V"
	)
	void method5201(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2914 != var1.field2914)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2914);
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) {
			this.faceAlphas = new byte[var2];
			Arrays.fill(this.faceAlphas, (byte)0);
		}

		if (this.faceTextures == null && var1.faceTextures != null) {
			this.faceTextures = new short[var2];
			Arrays.fill(this.faceTextures, (short)-1);
		}

		if (this.textureFaces == null && var1.textureFaces != null) {
			this.textureFaces = new byte[var2];
			Arrays.fill(this.textureFaces, (byte)-1);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkb;)V"
	)
	public void method5294(Model var1) {
		if (var1 != null) {
			this.method5201(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2914;
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) {
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
				}

				if (this.faceTextures != null) {
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
				}

				if (this.textureFaces != null) {
					if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
						this.textureFaces[this.indicesCount] = (byte)(var1.textureFaces[var2] + this.texIndicesCount);
					} else {
						this.textureFaces[this.indicesCount] = -1;
					}
				}

				++this.indicesCount;
			}

			for (var2 = 0; var2 < var1.texIndicesCount; ++var2) {
				this.texIndices1[this.texIndicesCount] = this.verticesCount + var1.texIndices1[var2];
				this.texIndices2[this.texIndicesCount] = this.verticesCount + var1.texIndices2[var2];
				this.texIndices3[this.texIndicesCount] = this.verticesCount + var1.texIndices3[var2];
				++this.texIndicesCount;
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) {
				this.verticesX[this.verticesCount] = var1.verticesX[var2];
				this.verticesY[this.verticesCount] = var1.verticesY[var2];
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
				++this.verticesCount;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lkb;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder();
		int var7 = var2 - this.xzRadius;
		int var8 = var2 + this.xzRadius;
		int var9 = var4 - this.xzRadius;
		int var10 = var4 + this.xzRadius;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model();
					var11.verticesCount = this.verticesCount;
					var11.indicesCount = this.indicesCount;
					var11.texIndicesCount = this.texIndicesCount;
					var11.verticesX = this.verticesX;
					var11.verticesZ = this.verticesZ;
					var11.indices1 = this.indices1;
					var11.indices2 = this.indices2;
					var11.indices3 = this.indices3;
					var11.faceColors1 = this.faceColors1;
					var11.faceColors2 = this.faceColors2;
					var11.faceColors3 = this.faceColors3;
					var11.faceRenderPriorities = this.faceRenderPriorities;
					var11.faceAlphas = this.faceAlphas;
					var11.textureFaces = this.textureFaces;
					var11.faceTextures = this.faceTextures;
					var11.field2914 = this.field2914;
					var11.texIndices1 = this.texIndices1;
					var11.texIndices2 = this.texIndices2;
					var11.texIndices3 = this.texIndices3;
					var11.vertexLabels = this.vertexLabels;
					var11.faceLabelsAlpha = this.faceLabelsAlpha;
					var11.isSingleTile = this.isSingleTile;
					var11.verticesY = new int[var11.verticesCount];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
						}
					}
				}

				var11.resetBounds();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkb;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkb;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZLkb;[B)Lkb;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.texIndicesCount = this.texIndicesCount;
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
			var2.verticesX = new int[this.verticesCount + 100];
			var2.verticesY = new int[this.verticesCount + 100];
			var2.verticesZ = new int[this.verticesCount + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3;
			if (this.faceAlphas == null) {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.faceColors1 = this.faceColors1;
		var2.faceColors2 = this.faceColors2;
		var2.faceColors3 = this.faceColors3;
		var2.faceRenderPriorities = this.faceRenderPriorities;
		var2.textureFaces = this.textureFaces;
		var2.faceTextures = this.faceTextures;
		var2.field2914 = this.field2914;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2895 = this.field2895;
		var2.field2896 = this.field2896;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("ab")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2933[var1];
			int var9 = field2937[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var12 = this.verticesX[var10];
				int var13 = this.verticesZ[var10];
				int var11 = var12 * var8 + var9 * var13 >> 16;
				int var15 = this.verticesY[var10];
				int var16 = Language.method7482(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var15 < var3) {
					var3 = var15;
				}

				if (var15 > var6) {
					var6 = var15;
				}

				if (var16 < var4) {
					var4 = var16;
				}

				if (var16 > var7) {
					var7 = var16;
				}
			}

			AABB var17 = new AABB((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var18 = true;
			if (var17.xMidOffset < 32) {
				var17.xMidOffset = 32;
			}

			if (var17.zMidOffset < 32) {
				var17.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var19 = true;
				var17.xMidOffset += 8;
				var17.zMidOffset += 8;
			}

			this.aabb.put(var1, var17);
		}
	}

	@ObfuscatedName("ac")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) {
			this.boundsType = 1;
			super.height = 0;
			this.bottomY = 0;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.bottomY) {
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D);
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D);
		}
	}

	@ObfuscatedName("ao")
	void method5184() {
		if (this.boundsType != 2) {
			this.boundsType = 2;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("aq")
	public int method5185() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ap")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljl;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) {
			if (var2 != -1) {
				Animation var3 = var1.frames[var2];
				Skeleton var4 = var3.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;

				for (int var5 = 0; var5 < var3.transformCount; ++var5) {
					int var6 = var3.transformSkeletonLabels[var5];
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
				}

				this.resetBounds();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V"
	)
	public void method5188(class141 var1, int var2) {
		Skeleton var3 = var1.field1650;
		class249 var4 = var3.method4844();
		if (var4 != null) {
			var3.method4844().method4775(var1, var2);
			this.method5190(var3.method4844(), var1.method3150());
		}

		if (var1.method3151()) {
			this.method5189(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V"
	)
	void method5189(class141 var1, int var2) {
		Skeleton var3 = var1.field1650;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1653 != null && var1.field1653[var4] != null && var1.field1653[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class133 var6 = var1.field1653[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3079(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lje;I)V"
	)
	void method5190(class249 var1, int var2) {
		this.method5266(var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljl;ILjl;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Animation var6 = var1.frames[var2];
				Animation var7 = var3.frames[var4];
				Skeleton var8 = var6.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) {
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) {
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds();
			} else {
				this.animate(var1, var2);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljn;Lfo;I[ZZZ)V"
	)
	public void method5278(Skeleton var1, class141 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class249 var7 = var1.method4844();
		if (var7 != null) {
			var7.method4779(var2, var3, var4, var5);
			if (var6) {
				this.method5190(var7, var2.method3150());
			}
		}

		if (!var5 && var2.method3151()) {
			this.method5189(var2, var3);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljl;I[IZ)V"
	)
	public void method5193(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.animate(var1, var2);
		} else {
			Animation var5 = var1.frames[var2];
			Skeleton var6 = var5.skeleton;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var9 = 0; var9 < var5.transformCount; ++var9) {
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.transformTypes[var10] == 0) {
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
				}
			}

		}
	}

	@ObfuscatedName("ai")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.vertexLabels.length) {
					int[] var19 = this.vertexLabels[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						Model_transformTempX += this.verticesX[var12];
						Model_transformTempY += this.verticesY[var12];
						Model_transformTempZ += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				Model_transformTempX = var3 + Model_transformTempX / var7;
				Model_transformTempY = var4 + Model_transformTempY / var7;
				Model_transformTempZ = var5 + Model_transformTempZ / var7;
			} else {
				Model_transformTempX = var3;
				Model_transformTempY = var4;
				Model_transformTempZ = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] += var3;
							var10000 = this.verticesY;
							var10000[var11] += var4;
							var10000 = this.verticesZ;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2937[var14];
								var16 = field2933[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2937[var12];
								var16 = field2933[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2937[var13];
								var16 = field2933[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.faceLabelsAlpha.length) {
							var9 = this.faceLabelsAlpha[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("an")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("am")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("ar")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ag")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2937[var1];
		int var3 = field2933[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bs")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bf")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5184();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2937[var1];
		int var11 = field2933[var1];
		int var12 = field2937[var2];
		int var13 = field2933[var2];
		int var14 = field2937[var3];
		int var15 = field2933[var3];
		int var16 = field2937[var4];
		int var17 = field2933[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2910[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2911[var19] = class175.method3578(var22);
			if (this.texIndicesCount > 0) {
				field2913[var19] = var20;
				field2894[var19] = var23;
				field2884[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bi")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5184();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2937[var1];
		int var12 = field2933[var1];
		int var13 = field2937[var2];
		int var14 = field2933[var2];
		int var15 = field2937[var3];
		int var16 = field2933[var3];
		int var17 = field2937[var4];
		int var18 = field2933[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.verticesCount; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2910[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2911[var20] = class175.method3578(var8);
			if (this.texIndicesCount > 0) {
				field2913[var20] = var21;
				field2894[var20] = var24;
				field2884[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bt")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var11 = var5 * var8 - var4 * var6 >> 16;
		int var12 = var2 * var7 + var3 * var11 >> 16;
		int var13 = var3 * this.xzRadius >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < AbstractRasterizer.method4842()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method4751()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method4687()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.texIndicesCount > 0;
							int var28 = ViewportMouse.ViewportMouse_x;
							int var30 = ViewportMouse.ViewportMouse_y;
							boolean var32 = ClientPreferences.method2630();
							boolean var33 = var9 != 0L && !class74.method2110(var9);
							boolean var35 = false;
							int var37;
							int var38;
							int var39;
							if (var33 && var32) {
								boolean var36 = false;
								if (field2929) {
									var36 = class164.method3432(this, var1, var6, var7, var8, var2, var3, var4, var5);
								} else {
									var37 = var12 - var13;
									if (var37 <= 50) {
										var37 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var37;
									} else {
										var17 /= var14;
										var16 /= var37;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var37;
									} else {
										var21 /= var14;
										var23 /= var37;
									}

									var38 = var28 - Rasterizer3D.getClipMidX();
									var39 = var30 - Rasterizer3D.getClipMidY();
									if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) {
										var36 = true;
									}
								}

								if (var36) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var35 = true;
									}
								}
							}

							int var49 = Rasterizer3D.getClipMidX();
							var37 = Rasterizer3D.getClipMidY();
							var38 = 0;
							var39 = 0;
							if (var1 != 0) {
								var38 = field2937[var1];
								var39 = field2933[var1];
							}

							for (int var40 = 0; var40 < this.verticesCount; ++var40) {
								int var41 = this.verticesX[var40];
								int var42 = this.verticesY[var40];
								int var43 = this.verticesZ[var40];
								int var44;
								if (var1 != 0) {
									var44 = var43 * var38 + var41 * var39 >> 16;
									var43 = var43 * var39 - var41 * var38 >> 16;
									var41 = var44;
								}

								var41 += var6;
								var42 += var7;
								var43 += var8;
								var44 = var43 * var4 + var5 * var41 >> 16;
								var43 = var5 * var43 - var41 * var4 >> 16;
								var41 = var44;
								var44 = var3 * var42 - var43 * var2 >> 16;
								var43 = var42 * var2 + var3 * var43 >> 16;
								field2910[var40] = var43 - var12;
								if (var43 >= 50) {
									modelViewportXs[var40] = var49 + var41 * Rasterizer3D.get3dZoom() / var43;
									modelViewportYs[var40] = var37 + var44 * Rasterizer3D.get3dZoom() / var43;
									field2911[var40] = class175.method3578(var43);
								} else {
									modelViewportXs[var40] = -5000;
									var25 = true;
								}

								if (var27) {
									field2913[var40] = var41;
									field2894[var40] = var44;
									field2884[var40] = var43;
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9);
							} catch (Exception var48) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bn")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2915[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var28 = modelViewportXs[var10];
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2) {
							var15 = modelViewportYs[var8];
							var16 = modelViewportYs[var9];
							var29 = modelViewportYs[var10];
							var18 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var29) {
								var37 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var15 && var18 > var16 && var18 > var29) {
									var37 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var28) {
										var37 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var28) {
											var37 = false;
										} else {
											var37 = true;
										}
									}
								}
							}

							if (var37) {
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2892[var7] = false;
							var30 = Rasterizer3D.method4760();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var30 && var12 <= var30 && var28 <= var30) {
								field2905[var7] = false;
							} else {
								field2905[var7] = true;
							}

							var15 = (field2910[var8] + field2910[var9] + field2910[var10]) / 3 + this.radius;
							field2916[var15][field2915[var15]++] = var7;
						}
					} else {
						var30 = field2913[var8];
						var15 = field2913[var9];
						var16 = field2913[var10];
						var29 = field2894[var8];
						var18 = field2894[var9];
						int var19 = field2894[var10];
						int var20 = field2884[var8];
						int var21 = field2884[var9];
						int var22 = field2884[var10];
						var30 -= var15;
						var16 -= var15;
						var29 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var29 * var22 - var20 * var19;
						int var24 = var20 * var16 - var30 * var22;
						int var25 = var30 * var19 - var29 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2892[var7] = true;
							int var26 = (field2910[var8] + field2910[var9] + field2910[var10]) / 3 + this.radius;
							field2916[var26][field2915[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2915[var33];
					if (var34 > 0) {
						var27 = field2916[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2917[var33] = 0;
					field2889[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2915[var33];
					if (var34 > 0) {
						var27 = field2916[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2917[var36]++;
							field2918[var36][var28] = var35;
							if (var36 < 10) {
								int[] var38 = field2889;
								var38[var36] += var33;
							} else if (var36 == 10) {
								field2919[var28] = var33;
							} else {
								field2920[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2917[1] > 0 || field2917[2] > 0) {
					var33 = (field2889[1] + field2889[2]) / (field2917[1] + field2917[2]);
				}

				var8 = 0;
				if (field2917[3] > 0 || field2917[4] > 0) {
					var8 = (field2889[3] + field2889[4]) / (field2917[3] + field2917[4]);
				}

				var9 = 0;
				if (field2917[6] > 0 || field2917[8] > 0) {
					var9 = (field2889[8] + field2889[6]) / (field2917[8] + field2917[6]);
				}

				var11 = 0;
				var12 = field2917[10];
				int[] var13 = field2918[10];
				int[] var14 = field2919;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2917[11];
					var13 = field2918[11];
					var14 = field2920;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2918[11]) {
							var11 = 0;
							var12 = field2917[11];
							var13 = field2918[11];
							var14 = field2920;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2918[11]) {
							var11 = 0;
							var12 = field2917[11];
							var13 = field2918[11];
							var14 = field2920;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2918[11]) {
							var11 = 0;
							var12 = field2917[11];
							var13 = field2918[11];
							var14 = field2920;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2917[var15];
					int[] var17 = field2918[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2918[11]) {
						var11 = 0;
						var13 = field2918[11];
						var12 = field2917[11];
						var14 = field2920;
					}

					if (var11 < var12) {
						var10 = var14[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	@ObfuscatedName("bw")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2892[var1]) {
			this.method5210(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.field2973 = field2905[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.field2983 = 0;
			} else {
				Rasterizer3D.clips.field2983 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5209(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2911[var2], field2911[var3], field2911[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bl")
	boolean method5208(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2891;
	}

	@ObfuscatedName("be")
	final void method5209(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.textureFaces != null && this.textureFaces[var1] != -1) {
				int var17 = this.textureFaces[var1] & 255;
				var18 = this.texIndices1[var17];
				var15 = this.texIndices2[var17];
				var16 = this.texIndices3[var17];
			} else {
				var18 = this.indices1[var1];
				var15 = this.indices2[var1];
				var16 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method4699(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2913[var18], field2913[var15], field2913[var16], field2894[var18], field2894[var15], field2894[var16], field2884[var18], field2884[var15], field2884[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method4699(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2913[var18], field2913[var15], field2913[var16], field2894[var18], field2894[var15], field2894[var16], field2884[var18], field2884[var15], field2884[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5208(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method4739(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2934[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2934[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method4701(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bg")
	final void method5210(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2884[var5];
		int var9 = field2884[var6];
		int var10 = field2884[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.field2983 = 0;
		} else {
			Rasterizer3D.clips.field2983 = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2942[var4] = modelViewportXs[var5];
			field2923[var4] = modelViewportYs[var5];
			field2925[var4] = field2911[var7];
			field2924[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2913[var5];
			var12 = field2894[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2906[var10 - var8] * (50 - var8);
				field2942[var4] = var2 + (var11 + ((field2913[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2894[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2925[var4] = field2875;
				field2924[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2906[var9 - var8] * (50 - var8);
				field2942[var4] = var2 + (var11 + ((field2913[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2894[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2925[var4] = field2875;
				field2924[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2942[var4] = modelViewportXs[var6];
			field2923[var4] = modelViewportYs[var6];
			field2925[var4] = field2911[var7];
			field2924[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2913[var6];
			var12 = field2894[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2906[var8 - var9] * (50 - var9);
				field2942[var4] = var2 + (var11 + ((field2913[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2894[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2925[var4] = field2875;
				field2924[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2906[var10 - var9] * (50 - var9);
				field2942[var4] = var2 + (var11 + ((field2913[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2894[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2924[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2942[var4] = modelViewportXs[var7];
			field2923[var4] = modelViewportYs[var7];
			field2925[var4] = field2911[var7];
			field2924[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2913[var7];
			var12 = field2894[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2906[var9 - var10] * (50 - var10);
				field2942[var4] = var2 + (var11 + ((field2913[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2894[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2925[var4] = field2875;
				field2924[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2906[var8 - var10] * (50 - var10);
				field2942[var4] = var2 + (var11 + ((field2913[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2923[var4] = var3 + (var12 + ((field2894[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2925[var4] = field2875;
				field2924[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2942[0];
		var12 = field2942[1];
		var13 = field2942[2];
		var14 = field2923[0];
		int var15 = field2923[1];
		int var16 = field2923[2];
		float var17 = field2925[0];
		float var18 = field2925[1];
		float var19 = field2925[2];
		Rasterizer3D.clips.field2973 = false;
		int var20 = Rasterizer3D.method4760();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.field2973 = true;
			}

			this.method5209(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2924[0], field2924[1], field2924[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2942[3] < 0 || field2942[3] > var20) {
				Rasterizer3D.clips.field2973 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var23;
				int var25;
				if (this.textureFaces != null && this.textureFaces[var1] != -1) {
					int var24 = this.textureFaces[var1] & 255;
					var25 = this.texIndices1[var24];
					var22 = this.texIndices2[var24];
					var23 = this.texIndices3[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method4699(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2913[var25], field2913[var22], field2913[var23], field2894[var25], field2894[var22], field2894[var23], field2884[var25], field2884[var22], field2884[var23], var26);
					Rasterizer3D.method4699(var14, var16, field2923[3], var11, var13, field2942[3], var17, var19, field2925[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2913[var25], field2913[var22], field2913[var23], field2894[var25], field2894[var22], field2894[var23], field2884[var25], field2884[var22], field2884[var23], var26);
				} else {
					Rasterizer3D.method4699(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2924[0], field2924[1], field2924[2], field2913[var25], field2913[var22], field2913[var23], field2894[var25], field2894[var22], field2894[var23], field2884[var25], field2884[var22], field2884[var23], var26);
					Rasterizer3D.method4699(var14, var16, field2923[3], var11, var13, field2942[3], var17, var19, field2925[3], field2924[0], field2924[2], field2924[3], field2913[var25], field2913[var22], field2913[var23], field2894[var25], field2894[var22], field2894[var23], field2884[var25], field2884[var22], field2884[var23], var26);
				}
			} else {
				boolean var21 = this.method5208(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2934[this.faceColors1[var1]];
					Rasterizer3D.method4739(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method4739(var14, var16, field2923[3], var11, var13, field2942[3], var17, var19, field2925[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2934[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2923[3], var11, var13, field2942[3], var17, var19, field2925[3], var22);
				} else if (var21) {
					Rasterizer3D.method4701(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2924[0], field2924[1], field2924[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method4701(var14, var16, field2923[3], var11, var13, field2942[3], 0.0F, 0.0F, 0.0F, field2924[0], field2924[2], field2924[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2924[0], field2924[1], field2924[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2923[3], var11, var13, field2942[3], var17, var19, field2925[3], field2924[0], field2924[2], field2924[3]);
				}
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILql;)V"
	)
	void method5211(int var1, class423 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4694[0] * var3 + var2.field4694[4] * var4 + var2.field4694[8] * var5 + var2.field4694[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4694[1] * var3 + var2.field4694[5] * var4 + var2.field4694[9] * var5 + var2.field4694[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4694[2] * var3 + var2.field4694[6] * var4 + var2.field4694[10] * var5 + var2.field4694[14] * var6));
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lje;I)V"
	)
	void method5266(class249 var1, int var2) {
		if (this.field2895 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2895[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2896[var3];
					field2870.method7855();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class130 var8 = var1.method4778(var7);
						if (var8 != null) {
							field2871.method7850((float)var5[var6] / 255.0F);
							field2872.method7918(var8.method3048(var2));
							field2872.method7898(field2871);
							field2870.method7852(field2872);
						}
					}

					this.method5211(var3, field2870);
				}
			}

		}
	}

	@ObfuscatedName("ef")
	void vmethod5198(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		int var12 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var13 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var14 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var15 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var12, var13, var14, var15, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ILql;IIIJ)V"
	)
	void draw(int var1, class423 var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class417 var8 = new class417();
		var8.field4667 = new class422((float)((double)var1 * 0.0030679615D), 0.0F, 0.0F);
		var8.field4669 = new class421(1.0F, 1.0F, 1.0F);
		var8.field4668 = new class421((float)var3, (float)var4, (float)var5);
		class423 var9 = new class423();
		var9.method7860(var8);
		var9.method7898(var2);
		int var10 = (int)var9.method7863(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = Rasterizer3D.getClipMidX();
		int var13 = Rasterizer3D.getClipMidY();
		if (var1 != 0) {
		}

		for (int var14 = 0; var14 < this.verticesCount; ++var14) {
			int var15 = this.verticesX[var14];
			int var16 = this.verticesY[var14];
			int var17 = this.verticesZ[var14];
			var9.method7867((float)var15, (float)var16, (float)var17, field2943);
			var15 = (int)field2943[0];
			var16 = (int)field2943[1];
			var17 = (int)field2943[2];
			field2910[var14] = var17 - var10;
			if (var17 >= 50) {
				modelViewportXs[var14] = var12 + var15 * Rasterizer3D.get3dZoom() / var17;
				modelViewportYs[var14] = var13 + var16 * Rasterizer3D.get3dZoom() / var17;
				field2911[var14] = class175.method3578(var17);
			} else {
				modelViewportXs[var14] = -5000;
				var11 = true;
			}

			if (this.texIndicesCount > 0) {
				field2913[var14] = var15;
				field2894[var14] = var16;
				field2884[var14] = var17;
			}
		}

		boolean var20 = ClientPreferences.method2630();
		boolean var21;
		if (var20) {
			var21 = var6 != 0L && !class74.method2110(var6);
			var20 = var21;
		}

		var21 = var20;

		try {
			this.draw0(var11, var21, this.isSingleTile, var6);
		} catch (Exception var19) {
		}

	}
}
