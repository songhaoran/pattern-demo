package c02_abstractFactory;

/**
 * Created by Song on 2018/12/25.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        BaseFactory actionFactory = FactoryProducer.getFactory(FactoryEnum.action);
        BaseFactory clothesFactory = FactoryProducer.getFactory(FactoryEnum.clothes);
        actionFactory.getAction(ActionEnum.play).doSomething();
        clothesFactory.getClothes(ClothesEnum.polo).wear();

        actionFactory.getAction(ActionEnum.study).doSomething();
        clothesFactory.getClothes(ClothesEnum.gezi).wear();
    }
}
