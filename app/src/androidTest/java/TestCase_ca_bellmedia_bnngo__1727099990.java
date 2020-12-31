import android.app.Activity;
import android.content.Context;
import android.support.v4.app.NavUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_bellmedia_bnngo__1727099990 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = null;
      NavUtils.getParentActivityIntent((Context)var0, (Class)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
