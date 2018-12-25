package c02_abstractFactory;

/**
 * Created by Song on 2018/12/25.
 */
public abstract class BaseFactory {
    public abstract Action getAction(ActionEnum actionEnum);

    public abstract Clothes getClothes(ClothesEnum clothesEnum);
}
