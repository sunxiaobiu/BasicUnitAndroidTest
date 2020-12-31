import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8_519367512 {
   @Test
   public void testCase() throws Exception {
      MediatorLiveData var2 = new MediatorLiveData();
      Object var1 = EasyMock.createMock(LiveData.class);
      var2.removeSource((LiveData)var1);
   }
}
