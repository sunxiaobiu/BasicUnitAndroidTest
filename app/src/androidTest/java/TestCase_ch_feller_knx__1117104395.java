import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__1117104395 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      ViewCompat.setSaveFromParentEnabled((View)var0, false);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
