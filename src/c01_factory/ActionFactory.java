package c01_factory;

/**
 * Created by Song on 2018/12/25.
 */
public class ActionFactory {

    public static Action getAction(ActionEnum actionEnum) {
        if (actionEnum.equals(ActionEnum.play)) {
            return new Play();
        } else if (actionEnum.equals(ActionEnum.study)) {
            return new Study();
        } else {
            return null;
        }
    }
}
