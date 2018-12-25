package c02_abstractFactory;

/**
 * Created by Song on 2018/12/25.
 */
public class ClothesFactory extends BaseFactory {
    @Override
    public Action getAction(ActionEnum actionEnum) {
        return null;
    }

    @Override
    public Clothes getClothes(ClothesEnum clothesEnum) {
        if (clothesEnum.equals(ClothesEnum.polo)) {
            return new PoloShirt();
        } else if (clothesEnum.equals(ClothesEnum.gezi)) {
            return new GeziShirt();
        } else {
            return null;
        }
    }
}
