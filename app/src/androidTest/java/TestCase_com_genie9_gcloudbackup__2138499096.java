import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_genie9_gcloudbackup__2138499096 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      float var1 = 1.0F;
      System.putFloat((ContentResolver)var0, "font_scale", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
