import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_queenmob_sinprors_196292448 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      int var1 = ViewCompat.getMeasuredWidthAndState((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
