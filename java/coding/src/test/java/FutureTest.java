import future.Client;
import future.Data;
import org.junit.Test;

/**
 * Created on 2020-06-10
 *
 * @author sunbc
 * @Describe
 * @since
 */
public class FutureTest {

    @Test
    public void test() {
        Client client = new Client();
        Data data = client.request("查询名称");
        System.out.println("请求完成");
        System.out.println("真实数据：" + data.getResult());
    }
}
