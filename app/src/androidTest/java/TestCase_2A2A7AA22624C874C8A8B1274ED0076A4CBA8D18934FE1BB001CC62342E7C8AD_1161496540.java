import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2A2A7AA22624C874C8A8B1274ED0076A4CBA8D18934FE1BB001CC62342E7C8AD_1161496540 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(Intent.class);
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Bundle.class);
      ActivityCompat.startActivityForResult((Activity)var0, (Intent)var1, var2, (Bundle)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
