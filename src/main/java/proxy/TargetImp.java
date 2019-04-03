package proxy;

/**
 * @ClassName TargetImp
 * @Author yaochaochen
 * @Date 2019-04-03 14:48
 **/
public class TargetImp implements Target {
    @Override
    public int test(int i) {
        return i+1;
    }
}
