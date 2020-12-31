import android.content.ContentResolver;
import android.provider.Settings.System;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_facemoji_lite_1931956290 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      String var1 = "android";
      long var2 = 1L;
      System.putLong((ContentResolver)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
