import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alarmclock_remind__1179744737 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      float var1 = System.getFloat((ContentResolver)var0, "animator_duration_scale", 1.0F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
