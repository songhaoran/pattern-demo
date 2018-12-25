package c01_factory;

/**
 * Created by Song on 2018/12/25.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Action play = ActionFactory.getAction(ActionEnum.play);
        play.doSomething();

        Action study = ActionFactory.getAction(ActionEnum.study);
        study.doSomething();
    }
}
