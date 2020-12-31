import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_and_games505_gemsofwar_658146403 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      WakefulBroadcastReceiver.completeWakefulIntent((Intent)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
