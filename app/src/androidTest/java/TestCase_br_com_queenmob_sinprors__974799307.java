import android.graphics.Rect;
import android.support.v4.view.GravityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_queenmob_sinprors__974799307 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Rect.class);
      Object var4 = EasyMock.createMock(Rect.class);
      byte var5 = 1;
      GravityCompat.apply(var0, var1, var2, (Rect)var3, (Rect)var4, var5);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
