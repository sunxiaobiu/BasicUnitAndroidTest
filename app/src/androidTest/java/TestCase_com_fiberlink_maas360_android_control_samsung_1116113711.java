import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiberlink_maas360_android_control_samsung_1116113711 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Intent.class);
      byte var3 = 1;
      PendingIntent.getActivity((Context)var0, var1, (Intent)var2, var3, (Bundle)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
