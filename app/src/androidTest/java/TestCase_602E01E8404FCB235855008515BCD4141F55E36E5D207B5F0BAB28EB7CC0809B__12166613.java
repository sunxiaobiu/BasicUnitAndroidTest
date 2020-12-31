import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_602E01E8404FCB235855008515BCD4141F55E36E5D207B5F0BAB28EB7CC0809B__12166613 {
   @Test
   public void testCase() throws Exception {
      MediatorLiveData var3 = new MediatorLiveData();
      Object var1 = EasyMock.createMock(LiveData.class);
      Object var2 = null;
      var3.addSource((LiveData)var1, (Observer)var2);
   }
}
