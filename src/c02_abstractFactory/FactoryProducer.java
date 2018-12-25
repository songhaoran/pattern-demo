package c02_abstractFactory;

/**
 * Created by Song on 2018/12/25.
 */
public class FactoryProducer {
    public static BaseFactory getFactory(FactoryEnum factoryEnum) {
        if (factoryEnum.equals(FactoryEnum.action)) {
            return new ActionFactory();
        } else if (factoryEnum.equals(FactoryEnum.clothes)) {
            return new ClothesFactory();
        } else {
            return null;
        }
    }
}
