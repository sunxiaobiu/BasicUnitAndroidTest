import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E3FC499EB23F47B85C8936569ED51B0C0F102CDFB881D1FA21E9C079040E161_1181508793 {
   @Test
   public void testCase() throws Exception {
      MutableLiveData var2 = new MutableLiveData();
      Object var1 = EasyMock.createMock(Observer.class);
      var2.observeForever((Observer)var1);
   }
}
