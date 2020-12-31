import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes__1160749981 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Intent.class);
      NavUtils.navigateUpTo((Activity)var0, (Intent)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
