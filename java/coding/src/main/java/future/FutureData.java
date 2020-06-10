package future;

/**
 * Created on 2020-06-10
 *
 * @author sunbc
 * @Describe
 * @since
 */
public class FutureData implements Data {

    private RealData realData;
    private boolean isReady = false;

    public synchronized void setRealData(RealData realData){
        if (isReady){
            return;
        }
        this.realData = realData;
        this.isReady = true;
        notifyAll();
    }

    @Override
    public synchronized String getResult() {
        while (!isReady){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.realData.getResult();
    }
}
