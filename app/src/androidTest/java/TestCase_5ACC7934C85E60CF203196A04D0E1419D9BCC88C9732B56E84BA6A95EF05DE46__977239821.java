import android.app.ActivityOptions;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ACC7934C85E60CF203196A04D0E1419D9BCC88C9732B56E84BA6A95EF05DE46__977239821 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      byte var1 = 1;
      byte var2 = 1;
      ActivityOptions.makeScaleUpAnimation((View)var0, var1, var2, 0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
