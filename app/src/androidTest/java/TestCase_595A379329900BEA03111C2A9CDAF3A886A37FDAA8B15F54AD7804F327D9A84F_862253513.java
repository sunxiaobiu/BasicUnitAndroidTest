import android.animation.ObjectAnimator;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F_862253513 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      int[] var1 = new int[1];
      ObjectAnimator.ofInt(var0, "backgroundColor", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
