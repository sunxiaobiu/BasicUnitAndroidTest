import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bitstudio_eu_synctunesmacfree__561314620 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      System.putInt((ContentResolver)var0, "wifi_sleep_policy", 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
