import android.os.IBinder;
import android.os.Messenger;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33020A2A591B70BEE7C7B4E0B6FAD20180D9C0D2A85BEA325B925C9979BA34F9__1946438423 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(IBinder.class);
      Messenger var1 = new Messenger((IBinder)var2);
      IBinder var3 = var1.getBinder();
   }
}
