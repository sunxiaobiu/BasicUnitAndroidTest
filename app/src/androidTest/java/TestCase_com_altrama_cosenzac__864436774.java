import android.content.Context;
import android.support.v4.hardware.display.DisplayManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_altrama_cosenzac__864436774 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      DisplayManagerCompat var1 = DisplayManagerCompat.getInstance((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
