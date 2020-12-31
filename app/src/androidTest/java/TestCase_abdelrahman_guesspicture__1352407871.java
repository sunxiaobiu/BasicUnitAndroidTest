import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_guesspicture__1352407871 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      int var1 = System.getInt((ContentResolver)var0, "screen_brightness");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
