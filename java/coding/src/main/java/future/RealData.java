package future;

/**
 * Created on 2020-06-10
 *
 * @author sunbc
 * @Describe
 * @since
 */
public class RealData implements Data {

    private String result;

    public RealData(String queryStr) {
        System.out.println("根据'" + queryStr + "'查询，执行需要一段时间。。。");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.result = "查询结果";
    }

    @Override
    public String getResult() {
        return this.result;
    }
}
