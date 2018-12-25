package c02_abstractFactory;

/**
 * Created by Song on 2018/12/25.
 */
public class ActionFactory extends BaseFactory {
    @Override
    public Action getAction(ActionEnum actionEnum) {
        if (actionEnum.equals(ActionEnum.play)) {
            return new Play();
        } else if (actionEnum.equals(ActionEnum.study)) {
            return new Study();
        } else {
            return null;
        }
    }

    @Override
    public Clothes getClothes(ClothesEnum clothesEnum) {
        return null;
    }
}
