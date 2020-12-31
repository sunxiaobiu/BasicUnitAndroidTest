import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_LTS_NVMS7000_1995377149 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      Object var1 = EasyMock.createMock(Paint.class);
      ViewCompat.setLayerPaint((View)var0, (Paint)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
