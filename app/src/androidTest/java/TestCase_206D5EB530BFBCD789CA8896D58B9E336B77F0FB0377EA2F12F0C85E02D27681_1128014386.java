import android.content.Context;
import android.content.Intent;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_206D5EB530BFBCD789CA8896D58B9E336B77F0FB0377EA2F12F0C85E02D27681_1128014386 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Intent[].class);
      ContextCompat.startActivities((Context)var0, (Intent[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
