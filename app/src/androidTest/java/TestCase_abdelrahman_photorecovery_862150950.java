import android.os.IBinder;
import android.os.IInterface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_862150950 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(IBinder.class);
      IInterface var2 = ((IBinder)var1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
   }
}
