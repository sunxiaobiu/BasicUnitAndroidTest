import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BD08A2A5502D276BF0A223E075BECBB5B8090FA57C2866750F9F138AC9580B0_45251950 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      float var1 = 1.0F;
      ViewCompat.setPivotY((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
