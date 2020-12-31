import android.content.Context;
import android.support.v4.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_aussiecommerce_luxuryescapes_1556133695 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      int var1 = ActivityCompat.checkSelfPermission((Context)var0, "android.permission.CALL_PHONE");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
