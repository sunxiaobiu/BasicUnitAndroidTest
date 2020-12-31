import android.os.RemoteException;
import android.util.Log;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__672132983 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RemoteException.class);
      Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
