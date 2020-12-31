import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_murad_waktusolat_1264977912 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(IntentSender.class);
      ActivityCompat.startIntentSenderForResult((Activity)var0, (IntentSender)var1, 2540, (Intent)null, 0, 0, 0, (Bundle)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
