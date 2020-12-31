import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp_1178916645 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Intent.class);
      WakefulBroadcastReceiver.startWakefulService((Context)var0, (Intent)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
