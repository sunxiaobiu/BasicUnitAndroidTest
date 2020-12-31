import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_elders_android_weather__142973545 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(Rect.class);
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      ((Rect)var5).contains(var1, var2, var3, var4);
   }
}
