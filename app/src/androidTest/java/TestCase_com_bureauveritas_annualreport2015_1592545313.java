import android.graphics.Bitmap;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bureauveritas_annualreport2015_1592545313 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Bitmap.class);
      byte var1 = 1;
      ((Bitmap)var2).getScaledHeight(var1);
   }
}
