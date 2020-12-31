import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355__945398104 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Handler.class);
      Message var2 = ((Handler)var1).obtainMessage(5);
   }
}
