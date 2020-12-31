import android.content.ContentResolver;
import android.content.res.Configuration;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android__93763127 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(Configuration.class);
      System.getConfiguration((ContentResolver)var0, (Configuration)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
