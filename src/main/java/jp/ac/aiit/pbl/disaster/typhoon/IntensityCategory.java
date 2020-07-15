package jp.ac.aiit.pbl.disaster.typhoon;

import java.util.Arrays;

/**
 * Enumeration for IntensityCategory.
 * CASE1 getById:Return intensityCategory {None or TropicalStorm or SevereTropicalStorm or Typhoon or Others}.
 * CASE2 getId:Return Id.
 * @see <a href="https://foreignlang.ecc.co.jp/know/k00046d/">Category</a>
 */
public enum IntensityCategory {
    intensityCategoryNone(0, "なし"),
    intensityCategoryTropicalStorm(1, "強い"),
    intensitycategorySevereTropicalStorm(2, "非常に強い"),
    intensitycategoryTyphoon(3, "猛烈な"),
    intensitycategoryOthers(15,"その他の強さ階級分類");

    private int id;
    private String intensityCategory;

    IntensityCategory(int id, String intensityCategory){
        this.id = id;
        this.intensityCategory = intensityCategory;
    }

    public Integer getId(){
        return id;
    }

    public static IntensityCategory getById(int id) {
        return Arrays.stream(IntensityCategory.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}