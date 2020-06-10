package future;

/**
 * Created on 2020-06-10
 *
 * @author sunbc
 * @Describe
 * @since
 */
public class Client {

    public Data request(String queryStr) {
        FutureData fc = new FutureData();
        new Thread(() -> {
            RealData realData = new RealData(queryStr);
            fc.setRealData(realData);
        }).start();
        return fc;
    }
}
