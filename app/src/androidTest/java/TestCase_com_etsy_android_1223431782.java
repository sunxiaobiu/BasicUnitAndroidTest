import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_etsy_android_1223431782 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(Intent[].class);
      ActivityCompat.startActivities((Context)var0, (Intent[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
