import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aws_apps_usbDeviceEnumerator__1558130685 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(AppCompatActivity.class);
      Object var1 = EasyMock.createMock(Intent.class);
      ActivityCompat.startActivity((Activity)var0, (Intent)var1, (Bundle)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
