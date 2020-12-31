import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas__1943052483 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Intent.class);
      Object var2 = EasyMock.createMock(Bundle.class);
      ActivityCompat.startActivity((Context)var0, (Intent)var1, (Bundle)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
