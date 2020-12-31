import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_facemoji_lite__53174090 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      String var3 = "android";
      System.getLong((ContentResolver)var2, var3, 0L);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
