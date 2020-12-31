import android.content.Context;
import android.support.v4.widget.ScrollerCompat;
import android.view.animation.Interpolator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_usp_bibliotecas_usp__868364866 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Interpolator.class);
      ScrollerCompat.create((Context)var0, (Interpolator)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
